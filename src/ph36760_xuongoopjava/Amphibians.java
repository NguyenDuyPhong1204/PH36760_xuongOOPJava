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
public class Amphibians extends Animal{
    
    private String thuocLoai;
    private String moiTruongSong;

    public Amphibians() {
    }

    public Amphibians(String thuocLoai, String moiTruongSong) {
        this.thuocLoai = thuocLoai;
        this.moiTruongSong = moiTruongSong;
    }

    public Amphibians(String thuocLoai, String moiTruongSong, String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        super(maDongVat, tenDongVat, gioiTinh, kichThuoc, canNang, mauSac, thucAn, tuoi);
        this.thuocLoai = thuocLoai;
        this.moiTruongSong = moiTruongSong;
    }

   public void xuat(){
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                "Mã động vật", "Tên động vật","Giới tính","Kích thước","Cân nặng","Màu sắc"
                ,"Thức ăn","Tuổi","Thuộc loài","Môi trường sống");
        
         System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s\n",
                 getMaDongVat(), getTenDongVat(), getGioiTinh(),getKichThuoc(),getCanNang(),
                 getMauSac(), getThucAn(), getTuoi(), this.thuocLoai, this.moiTruongSong);
       
   }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap(); 
        System.out.print("Nhập loài: ");
        this.thuocLoai = sc.nextLine();
        System.out.print("Nhập môi trường sống: ");
        this.moiTruongSong = sc.nextLine();
    }
    
    
}
