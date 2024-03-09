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
public class Reptile extends Animal {

    private String thuocLoai;
    private int kichThuocVay;
    private String loaiVay;

    public Reptile() {
    }

    public Reptile(String thuocLoai, int kichThuocVay, String loaiVay) {
        this.thuocLoai = thuocLoai;
        this.kichThuocVay = kichThuocVay;
        this.loaiVay = loaiVay;
    }

    public Reptile(String thuocLoai, int kichThuocVay, String loaiVay, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.kichThuocVay = kichThuocVay;
        this.loaiVay = loaiVay;
    }

    public void xuat() {
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "Mã động vật", "Tên động vật", "Giới tính", "Kích thước", "Cân nặng", "Màu sắc",
                 "Thức ăn", "Tuổi", "Thuộc loài", "kích thước vảy", "Loại vảy");

        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                getMaDongVat(), getTenDongVat(), getGioiTinh(), getKichThuoc(), getCanNang(),
                getMauSac(), getThucAn(), getTuoi(), this.thuocLoai, this.kichThuocVay, this.loaiVay);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        // Validate thuộc loài
        do {
            System.out.print("Nhập loài: ");
            thuocLoai = sc.nextLine();
            if (thuocLoai.isEmpty()) {
                System.out.println("Loài không được để trống!");
            }
        } while (thuocLoai.isEmpty());

        // Validate loại vẩy
        do {
            System.out.print("Nhập loại vẩy: ");
            loaiVay = sc.nextLine();
            if (loaiVay.isEmpty()) {
                System.out.println("Loại vẩy không được để trống!");
            }
        } while (loaiVay.isEmpty());

        // Validate kích thước vẩy
        do {
            try {
                System.out.print("Nhập kích thước vẩy: ");
                kichThuocVay = Integer.parseInt(sc.nextLine());
                if (kichThuocVay <= 0) {
                    System.out.println("Kích thước vẩy phải là số dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Kích thước vẩy phải là số!");
                kichThuocVay = 0;
            }
        } while (kichThuocVay <= 0);
    }

}
