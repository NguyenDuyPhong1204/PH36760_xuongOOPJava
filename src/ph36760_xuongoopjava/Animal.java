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
public class Animal {

    private String maDongVat;
    private String tenDongVat;
    private String gioiTinh;
    private int kichThuoc;
    private int canNang;
    private String mauSac;
    private String thucAn;
    private int tuoi;

    public Animal() {
    }

    public Animal(String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.gioiTinh = gioiTinh;
        this.kichThuoc = kichThuoc;
        this.canNang = canNang;
        this.mauSac = mauSac;
        this.thucAn = thucAn;
        this.tuoi = tuoi;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập mã động vật: ");
//        this.maDongVat = sc.nextLine();
//        System.out.print("Nhập tên của động vật: ");
//        this.tenDongVat = sc.nextLine();
//        System.out.print("Nhập giới tính của động vật: ");
//        this.gioiTinh = sc.nextLine();
//        System.out.print("Nhập kích thước của động vật: ");
//        this.kichThuoc = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhập cân nặng của động vật: ");
//        this.canNang = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhập màu sắc của động vật: ");
//        this.mauSac = sc.nextLine();
//        System.out.print("Nhập thức ăn của động vật: ");
//        this.thucAn = sc.nextLine();
//        System.out.print("Nhập tuổi của động vật: ");
//        this.tuoi = Integer.parseInt(sc.nextLine());
        String maDongVat, tenDongVat, gioiTinh, mauSac, thucAn;
        int kichThuoc, canNang, tuoi;

        // Validate mã động vật
        do {
            System.out.print("Nhập mã động vật: ");
            maDongVat = sc.nextLine();
            if (maDongVat.isEmpty()) {
                System.out.println("Mã động vật không được để trống!");
            }
        } while (maDongVat.isEmpty());

        // Validate tên động vật
        do {
            System.out.print("Nhập tên của động vật: ");
            tenDongVat = sc.nextLine();
            if (tenDongVat.isEmpty()) {
                System.out.println("Tên động vật không được để trống!");
            }
        } while (tenDongVat.isEmpty());

        // Validate giới tính động vật
        do {
            System.out.print("Nhập giới tính của động vật: ");
            gioiTinh = sc.nextLine();
            if (gioiTinh.isEmpty()) {
                System.out.println("Giới tính động vật không được để trống!");
            }
        } while (gioiTinh.isEmpty());

        // Validate kích thước động vật
        do {
            try {
                System.out.print("Nhập kích thước của động vật: ");
                kichThuoc = Integer.parseInt(sc.nextLine());
                if (kichThuoc <= 0) {
                    System.out.println("Kích thước động vật phải là số dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Kích thước động vật phải là số!");
                kichThuoc = 0;
            }
        } while (kichThuoc <= 0);

        // Validate cân nặng động vật
        do {
            try {
                System.out.print("Nhập cân nặng của động vật: ");
                canNang = Integer.parseInt(sc.nextLine());
                if (canNang <= 0) {
                    System.out.println("Cân nặng động vật phải là số dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Cân nặng động vật phải là số!");
                canNang = 0;
            }
        } while (canNang <= 0);

        // Validate màu sắc động vật
        do {
            System.out.print("Nhập màu sắc của động vật: ");
            mauSac = sc.nextLine();
            if (mauSac.isEmpty()) {
                System.out.println("Màu sắc động vật không được để trống!");
            }
        } while (mauSac.isEmpty());

        // Validate thức ăn của động vật
        do {
            System.out.print("Nhập thức ăn của động vật: ");
            thucAn = sc.nextLine();
            if (thucAn.isEmpty()) {
                System.out.println("Thức ăn của động vật không được để trống!");
            }
        } while (thucAn.isEmpty());

        // Validate tuổi động vật
        do {
            try {
                System.out.print("Nhập tuổi của động vật: ");
                tuoi = Integer.parseInt(sc.nextLine());
                if (tuoi <= 0) {
                    System.out.println("Tuổi động vật phải là số dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tuổi động vật phải là số!");
                tuoi = 0;
            }
        } while (tuoi <= 0);
    }

    ;
    
    public void xuat() {
//        System.out.println("Mã động vật: " + this.maDongVat + " \n" + "Tên động vật: " + this.tenDongVat + "\n" 
//                + "Giới tính: " + this.gioiTinh
//                + "\n" + "Kích thức: " + this.kichThuoc + "\n" + "Cân nặng: " + this.canNang + "\n"
//                + "Màu sắc: " + this.mauSac + "\n" + "Thức ăn: " + this.thucAn + "\n" + "Tuổi: " + this.tuoi);

        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s \n",
                "Mã động vật", "Tên động vật", "Giới tính", "Kích thước", "Cân nặng", "Màu sắc", "Thức ăn", "Tuổi");
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s \n",
                this.maDongVat, this.tenDongVat, this.gioiTinh, this.kichThuoc, this.canNang,
                this.mauSac, this.thucAn, this.tuoi);
    }
;
}
