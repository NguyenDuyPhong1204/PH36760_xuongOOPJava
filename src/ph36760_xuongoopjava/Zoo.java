/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph36760_xuongoopjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Zoo {

    public static void main(String[] args) {
        PH36760_xuongOOPJava oop = new PH36760_xuongOOPJava();
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            System.out.println("----------Menu---------");
            System.out.println("1. Nhập danh sánh động vật");
            System.out.println("2. Xuất danh sách động vật");
            System.out.println("3. Tìm động vật theo mã");
            System.out.println("4. Xoá động vật theo mã");
            System.out.println("5. Cập nhật lại thông tin động vật");
            System.out.println("6. Sắp xếp động vật theo tên");
            System.out.println("7. Thoát");
            System.out.println("Mời chọn chức năng muốn dùng: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    oop.nhapAnimal();
                    break;
                case 2:
                    oop.xuatAnimal();
                    break;
                case 3:
                    oop.timAnimal();
                    break;
                case 4:
                    oop.xoaAnimal();
                    break;
                case 5:
                    oop.capNhatAnimal();
                    break;
                case 6:
                    oop.sapXepAnimal();
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Không có chức năng bạn muốn dùng !");
            }
            if (chon == 7) {
                break;
            }
        }
    }
}
