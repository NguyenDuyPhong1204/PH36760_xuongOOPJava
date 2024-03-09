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
            System.out.println("4. Tìm động vật theo khoảng cân");
            System.out.println("5. Xoá động vật theo mã");
            System.out.println("6. Cập nhật lại thông tin động vật");
            System.out.println("7. Sắp xếp động vật theo tên");
            System.out.println("8. Sắp xếp động vật theo kích thước");
            System.out.println("9. Sắp xếp động vật theo cân nặng");
            System.out.println("10. Thoát");
            System.out.print("Mời chọn chức năng muốn dùng: ");
            do {
                try {
                    chon = Integer.parseInt(sc.nextLine());
                    if (chon <= 0) {
                        System.out.println("Vui lòng chọn lại");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng chọn lại");
                    chon = 0;
                }
            } while (chon <= 0);
//            chon = Integer.parseInt(sc.nextLine());
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
                    oop.timTheoKhoangCan();
                    break;
                case 5:
                    oop.xoaAnimal();
                    break;
                case 6:
                    oop.capNhatAnimal();
                    break;
                case 7:
                    oop.sapXepAnimal();
                    break;
                case 8:
                    oop.sapXepTheoKichThuoc();
                    break;
                case 9:
                    oop.sapXepTheoCanNang();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Không có chức năng bạn muốn dùng !");
            }
            if (chon == 18) {
                break;
            }
        }
    }
}
