package day5.OOP;

import java.util.Scanner;

public class SinhVienKhoaNgoaiNgu extends SinhVien{

    String foreignLanguage;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scan = new Scanner(System.in);
        System.out.println("Foreign Language:");
        foreignLanguage = scan.nextLine();
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Foreign Language:" + foreignLanguage);
    }
}
