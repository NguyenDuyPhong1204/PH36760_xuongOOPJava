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
public class Bird extends Animal {

    private String loaiChim;
    private int kichThuocCanh;
    private String khaNangHot;
    private String khaNangBay;

    public Bird() {
    }

    public Bird(String loaiChim, int kichThuocCanh, String khaNangHot, String khaNangBay) {
        this.loaiChim = loaiChim;
        this.kichThuocCanh = kichThuocCanh;
        this.khaNangHot = khaNangHot;
        this.khaNangBay = khaNangBay;
    }

    public Bird(String loaiChim, int kichThuocCanh, String khaNangHot, String khaNangBay, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.loaiChim = loaiChim;
        this.kichThuocCanh = kichThuocCanh;
        this.khaNangHot = khaNangHot;
        this.khaNangBay = khaNangBay;
    }

    public void xuat() {
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "Mã động vật", "Tên động vật","Giới tính","Kích thước","Cân nặng","Màu sắc"
                ,"Thức ăn","Tuổi","Thuộc loài","Kích thước cánh","Khả năng hót","Khả năng bay");
        
         System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                 getMaDongVat(), getTenDongVat(), getGioiTinh(),getKichThuoc(),getCanNang(),
                 getMauSac(), getThucAn(), getTuoi(), this.loaiChim, this.kichThuocCanh, this.khaNangHot, this.khaNangBay);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập loài chim: ");
        this.loaiChim = sc.nextLine();
        System.out.print("Nhập kích thước cánh (cm): ");
        this.kichThuocCanh = Integer.parseInt(sc.nextLine());
        System.out.print("Khả năng hót: ");
        this.khaNangHot = sc.nextLine();
        System.out.print("Khả năng bay: ");
        this.khaNangBay = sc.nextLine();
    }

}
