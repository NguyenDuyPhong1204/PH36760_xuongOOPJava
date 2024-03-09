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
public class Fish extends Animal {

    private String loaiCa;
    private int tocDoBoi;

    public Fish() {
    }

    public Fish(String loaiCa, int tocDoBoi) {
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
    }

    public Fish(String loaiCa, int tocDoBoi, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.loaiCa = loaiCa;
        this.tocDoBoi = tocDoBoi;
    }

    public void xuat() {
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-2s0 | %-20s | %-20s\n",
                "Mã động vật", "Tên động vật", "Giới tính", "Kích thước", "Cân nặng", "Màu sắc",
                 "Thức ăn", "Tuổi", "Thuộc loài", "Tốc độ bơi");

        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-2s0 | %-20s | %-20ss\n",
                getMaDongVat(), getTenDongVat(), getGioiTinh(), getKichThuoc(), getCanNang(),
                getMauSac(), getThucAn(), getTuoi(), this.loaiCa, this.tocDoBoi);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        // Validate loài cá
        do {
            System.out.print("Nhập loài cá: ");
            this.loaiCa = sc.nextLine();
            if (loaiCa.isEmpty()) {
                System.out.println("Loài cá không được để trống!");
            }
        } while (this.loaiCa.isEmpty());

        // Validate tốc độ bơi
        do {
            try {
                System.out.print("Nhập tốc độ bơi(km/h): ");
                this.tocDoBoi = Integer.parseInt(sc.nextLine());
                if (this.tocDoBoi <= 0) {
                    System.out.println("Tốc độ bơi phải là số dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tốc độ bơi phải là số!");
                this.tocDoBoi = 0;
            }
        } while (this.tocDoBoi <= 0);

    }

}
