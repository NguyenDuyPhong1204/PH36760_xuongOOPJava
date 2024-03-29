/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph36760_xuongoopjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PH36760_xuongOOPJava {

    ArrayList<Animal> listAnimal = new ArrayList<>();
    ArrayList<Mammal> listMammal = new ArrayList<>();
    ArrayList<Bird> listBird = new ArrayList<>();
    ArrayList<Fish> listFish = new ArrayList<>();
    ArrayList<Reptile> listReptile = new ArrayList<>();
    ArrayList<Amphibians> listAmphibians = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //Nhập động vật
    public void nhapAnimal() {
        System.out.println("Nhập danh sách động vật ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời chọn động vật muốn nhập: ");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                Mammal mammal = new Mammal();
                mammal.nhap();
                listAnimal.add(mammal);
                listMammal.add(mammal);
                break;
            case 2:

                Bird bird = new Bird();
                bird.nhap();
                listAnimal.add(bird);
                listBird.add(bird);
                break;
            case 3:

                Fish fish = new Fish();
                fish.nhap();
                listAnimal.add(fish);
                listFish.add(fish);
                break;
            case 4:

                Reptile reptile = new Reptile();
                reptile.nhap();
                listAnimal.add(reptile);
                listReptile.add(reptile);
                break;
            case 5:

                Amphibians amphibians = new Amphibians();
                amphibians.nhap();
                listAnimal.add(amphibians);
                listAmphibians.add(amphibians);
                break;
            default:
                System.out.println("Không có lựa chọn đó, vui lòng chọn lại");
                break;
        }
    }

    //xuất danh sách animal
    public void xuatAnimal() {
        System.out.println("Xuất danh sách động vật ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời chọn danh sách động vật muốn xuất: ");

        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                System.out.println("----------- Thông tin động vật -------------");

                for (Mammal s : listMammal) {
                    s.xuat();
                }
                break;
            case 2:
                System.out.println("----------- Thông tin động vật -------------");

                for (Bird s : listBird) {
                    s.xuat();
                }
                break;
            case 3:

                System.out.println("----------- Thông tin động vật -------------");
                for (Fish s : listFish) {
                    s.xuat();
                }
                break;

            case 4:
                System.out.println("----------- Thông tin động vật -------------");

                for (Reptile s : listReptile) {
                    s.xuat();
                }
                break;

            case 5:
                System.out.println("----------- Thông tin động vật -------------");

                for (Amphibians s : listAmphibians) {
                    s.xuat();
                }
                break;

            default:
                System.out.println("Không có lựa chọn đó, vui lòng chọn lại");
                break;
        }
    }

    //tìm động vật theo mã
    public void timAnimal() {
        int chon;
        System.out.println("Chọn động vật bạn muốn tìm ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn tìm: ");
        chon = Integer.parseInt(sc.nextLine());

        String maAnimal = sc.nextLine();
        do {
            System.out.print("Mời nhập mã động vật bạn muốn tìm: ");
            maAnimal = sc.nextLine();
            if (maAnimal.isEmpty()) {
                System.out.println("Vui lòng nhập lại mã!");
            }
        } while (maAnimal.isEmpty());
        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                for (Mammal s : listMammal) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                    }
                }
                break;
            case 2:
                for (Bird s : listBird) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                    }
                }
                break;
            case 3:
                for (Fish s : listFish) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                    }
                }
                break;
            case 4:
                for (Reptile s : listReptile) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                    }
                }
                break;
            case 5:
                for (Amphibians s : listAmphibians) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                    }
                }
                break;
        }

    }

    public void timTheoKhoangCan() {
        int chon;
        System.out.println("Chọn động vật bạn muốn tìm ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn tìm: ");
        chon = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập khoảng cân động vật bạn muốn tìm\n");
        System.out.print("Cân nặng bắt đầu (kg): ");
        int canNang1 = Integer.parseInt(sc.nextLine());
        System.out.print("Cân nặng kết thúc (kg): ");
        int canNang2 = Integer.parseInt(sc.nextLine());
        int check = 0;
        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                for (Mammal s : listMammal) {
                    if (s.getCanNang() >= canNang1 && s.getCanNang() <= canNang2) {
                        check++;
                        s.xuat();
                    }
                }
                break;
            case 2:
                for (Bird s : listBird) {
                    if (s.getCanNang() >= canNang1 && s.getCanNang() <= canNang2) {
                        check++;
                        s.xuat();

                    }
                }
                break;
            case 3:
                for (Fish s : listFish) {
                    if (s.getCanNang() >= canNang1 && s.getCanNang() <= canNang2) {
                        check++;
                        s.xuat();

                    }
                }
                break;
            case 4:
                for (Reptile s : listReptile) {
                    if (s.getCanNang() >= canNang1 && s.getCanNang() <= canNang2) {
                        check++;
                        s.xuat();

                    }
                }
                break;
            case 5:
                for (Amphibians s : listAmphibians) {
                    if (s.getCanNang() >= canNang1 && s.getCanNang() <= canNang2) {
                        check++;
                        s.xuat();

                    }
                }
                break;
        }

    }

    //xoá động vật theo mã
    public void xoaAnimal() {
        int chon;
        System.out.println("Chọn động vật bạn xoá ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println( "3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn xoá: ");
        chon = Integer.parseInt(sc.nextLine());
        String maAnimal;
        do {
            System.out.print("Mời nhập mã động vật bạn muốn xoá: ");
            maAnimal = sc.nextLine();
            if (maAnimal.isEmpty()) {
                System.out.println("Vui lòng nhập lại mã!");
            }
        } while (maAnimal.isEmpty());
        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                for (Mammal s : listMammal) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                        String xacNhan;
                        System.out.print("Bạn có muốn xoá không (Y/N)?: ");
                        xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y")) {
                            listMammal.remove(s);
                            System.out.println("Xoá thành công");
                            break;
                        }
                    }
                }
                break;
            case 2:
                for (Bird s : listBird) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                        String xacNhan;
                        System.out.print("Bạn có muốn xoá không (Y/N)?: ");
                        xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y")) {
                            listBird.remove(s);
                            System.out.println("Xoá thành công");
                            break;
                        } 
                    }
                }
                break;
            case 3:
                for (Fish s : listFish) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                        s.xuat();
                        String xacNhan;
                        System.out.print("Bạn có muốn xoá không (Y/N)?: ");
                        xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y")) {
                            listFish.remove(s);
                            System.out.println("Xoá thành công");
                            break;
                        } 
                    }
                }
                break;
            case 4:
                for (Reptile s : listReptile) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                        s.xuat();
                        String xacNhan;
                        System.out.print("Bạn có muốn xoá không (Y/N)?: ");
                        xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y")) {
                            listReptile.remove(s);
                            System.out.println("Xoá thành công");
                            break;
                        } 
                    }
                }
                break;
            case 5:
                for (Amphibians s : listAmphibians) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.xuat();
                        s.xuat();
                        String xacNhan;
                        System.out.print("Bạn có muốn xoá không (y/n)?: ");
                        xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y")) {
                            listAmphibians.remove(s);
                            System.out.println("Xoá thành công");
                            break;
                        } 
                    }
                }
                break;
        }

    }

    //Cập nhật theo mã
    public void capNhatAnimal() {
        int chon;
        int check = 0;
        System.out.println("Chọn động vật bạn cập nhật ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn cập nhật: ");
        chon = Integer.parseInt(sc.nextLine());
        System.out.print("Mời nhập mã động vật bạn muốn cập nhật: ");
        String maAnimal = sc.nextLine();
        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                for (Mammal s : listMammal) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.nhap();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy mã động vật bạn vừa nhập");
                }
                break;
            case 2:
                for (Bird s : listBird) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.nhap();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy mã động vật bạn vừa nhập");
                }
                break;
            case 3:
                for (Fish s : listFish) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.nhap();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy mã động vật bạn vừa nhập");
                }
                break;
            case 4:
                for (Reptile s : listReptile) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.nhap();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy mã động vật bạn vừa nhập");

                }
                break;
            case 5:
                for (Amphibians s : listAmphibians) {
                    if (s.getMaDongVat().equalsIgnoreCase(maAnimal)) {
                        s.nhap();
                        check = 1;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("Không tìm thấy mã động vật bạn vừa nhập");

                }
                break;
        }

    }

    //sắp xếp theo tên
    public void sapXepAnimal() {
        int chon;
        System.out.println("Chọn động vật bạn muốn xem ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn xem: ");
        chon = Integer.parseInt(sc.nextLine());
        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:

                Collections.sort(listMammal, new Comparator<Mammal>() {
                    @Override
                    public int compare(Mammal o1, Mammal o2) {
                        return o1.getTenDongVat().compareToIgnoreCase(o2.getTenDongVat());
                    }
                });
                for (Mammal m : listMammal) {
                    m.xuat();
                }
                break;
            case 2:

                Collections.sort(listBird, new Comparator<Bird>() {
                    @Override
                    public int compare(Bird o1, Bird o2) {
                        return o1.getTenDongVat().compareToIgnoreCase(o2.getTenDongVat());
                    }
                });
                for (Bird b : listBird) {
                    b.xuat();
                }
                break;
            case 3:

                Collections.sort(listFish, new Comparator<Fish>() {
                    @Override
                    public int compare(Fish o1, Fish o2) {
                        return o1.getTenDongVat().compareToIgnoreCase(o2.getTenDongVat());
                    }
                });
                for (Fish f : listFish) {
                    f.xuat();
                }
                break;
            case 4:

                Collections.sort(listReptile, new Comparator<Reptile>() {
                    @Override
                    public int compare(Reptile o1, Reptile o2) {
                        return o1.getTenDongVat().compareToIgnoreCase(o2.getTenDongVat());
                    }
                });
                for (Reptile r : listReptile) {
                    r.xuat();
                }
                break;
            case 5:

                Collections.sort(listAmphibians, new Comparator<Amphibians>() {
                    @Override
                    public int compare(Amphibians o1, Amphibians o2) {
                        return o1.getTenDongVat().compareToIgnoreCase(o2.getTenDongVat());
                    }
                });
                for (Amphibians a : listAmphibians) {
                    a.xuat();
                }
                break;
        }
    }

    //sắp xếp theo kích thước
    public void sapXepTheoKichThuoc() {
        int chon;
        System.out.println("Chọn động vật bạn muốn xem ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn xem: ");
        chon = Integer.parseInt(sc.nextLine());

        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                Collections.sort(listMammal, new Comparator<Mammal>() {
                    @Override
                    public int compare(Mammal o1, Mammal o2) {
                        return o1.getKichThuoc() - o2.getKichThuoc();
                    }
                });
                for (Mammal m : listMammal) {
                    m.xuat();
                }
                break;
            case 2:

                Collections.sort(listBird, new Comparator<Bird>() {
                    @Override
                    public int compare(Bird o1, Bird o2) {
                        return o1.getKichThuoc() - o2.getKichThuoc();
                    }
                });
                for (Bird b : listBird) {
                    b.xuat();
                }
                break;
            case 3:

                Collections.sort(listFish, new Comparator<Fish>() {
                    @Override
                    public int compare(Fish o1, Fish o2) {
                        return o1.getKichThuoc() - o2.getKichThuoc();
                    }
                });
                for (Fish f : listFish) {
                    f.xuat();
                }
                break;
            case 4:

                Collections.sort(listReptile, new Comparator<Reptile>() {
                    @Override
                    public int compare(Reptile o1, Reptile o2) {
                        return o1.getKichThuoc() - o2.getKichThuoc();
                    }
                });
                for (Reptile r : listReptile) {
                    r.xuat();
                }
                break;
            case 5:

                Collections.sort(listAmphibians, new Comparator<Amphibians>() {
                    @Override
                    public int compare(Amphibians o1, Amphibians o2) {
                        return o1.getKichThuoc() - o2.getKichThuoc();
                    }
                });
                for (Amphibians a : listAmphibians) {
                    a.xuat();
                }
                break;
        }
    }

    public void sapXepTheoCanNang() {
        int chon;
        System.out.println("Chọn động vật bạn muốn xem ");
        System.out.println("1. Động vật có vú");
        System.out.println("2. Chim");
        System.out.println("3. Cá");
        System.out.println("4. Bò sát");
        System.out.println("5. Lưỡng cư");
        System.out.print("Mời nhập động vật bạn muốn xem: ");
        chon = Integer.parseInt(sc.nextLine());

        System.out.println("----------- Thông tin động vật -------------");
        switch (chon) {
            case 1:
                Collections.sort(listMammal, new Comparator<Mammal>() {
                    @Override
                    public int compare(Mammal o1, Mammal o2) {
                        return o1.getCanNang() - o2.getCanNang();
                    }
                });
                for (Mammal m : listMammal) {
                    m.xuat();
                }
                break;
            case 2:

                Collections.sort(listBird, new Comparator<Bird>() {
                    @Override
                    public int compare(Bird o1, Bird o2) {
                        return o1.getCanNang() - o2.getCanNang();
                    }
                });
                for (Bird b : listBird) {
                    b.xuat();
                }
                break;
            case 3:

                Collections.sort(listFish, new Comparator<Fish>() {
                    @Override
                    public int compare(Fish o1, Fish o2) {
                        return o1.getCanNang() - o2.getCanNang();
                    }
                });
                for (Fish f : listFish) {
                    f.xuat();
                }
                break;
            case 4:

                Collections.sort(listReptile, new Comparator<Reptile>() {
                    @Override
                    public int compare(Reptile o1, Reptile o2) {
                        return o1.getCanNang() - o2.getCanNang();
                    }
                });
                for (Reptile r : listReptile) {
                    r.xuat();
                }
                break;
            case 5:

                Collections.sort(listAmphibians, new Comparator<Amphibians>() {
                    @Override
                    public int compare(Amphibians o1, Amphibians o2) {
                        return o1.getCanNang() - o2.getCanNang();
                    }
                });
                for (Amphibians a : listAmphibians) {
                    a.xuat();
                }
                break;
        }
    }
}
