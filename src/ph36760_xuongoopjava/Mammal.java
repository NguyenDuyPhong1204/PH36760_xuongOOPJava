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
public class Mammal extends Animal{

    private String thuocLoai;
    private int soLuongDe;

    public Mammal() {
    }

    public Mammal(String thuocLoai, int soLuongDe, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.soLuongDe = soLuongDe;
    }

    public String getThuocLoai() {
        return thuocLoai;
    }

    public void setThuocLoai(String thuocLoai) {
        this.thuocLoai = thuocLoai;
    }

    public int getSoLuongDe() {
        return soLuongDe;
    }

    public void setSoLuongDe(int soLuongDe) {
        this.soLuongDe = soLuongDe;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Thuộc loài: ");
        this.thuocLoai = sc.nextLine();
        System.out.print("Số lượng đẻ trong 1 lứa: ");
        this.soLuongDe = Integer.parseInt(sc.nextLine());
    }

    
    public void xuat() {
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "Mã động vật", "Tên động vật","Giới tính","Kích thước","Cân nặng","Màu sắc"
                ,"Thức ăn","Tuổi","Thuộc loài","Số lượng đẻ", "Tuổi sinh sản");
        
         System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                 getMaDongVat(), getTenDongVat(), getGioiTinh(),getKichThuoc(),getCanNang(),
                 getMauSac(), getThucAn(), getTuoi(), this.thuocLoai, this.soLuongDe, tuoiSinhSan());
    }

    public String tuoiSinhSan() {

        if (this.getTuoi() >= 2 || this.getTuoi() <= 15) {
            return "Đang trong độ tuổi sinh sản";
        } else {
            return "Không trong độ tuổi sinh sản";
        }
    }
}
