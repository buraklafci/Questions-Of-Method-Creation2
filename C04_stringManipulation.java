package day14_OdevsStringManipulation;

import java.util.Scanner;

public class C04_stringManipulation {
    public static void main(String[] args) {
        //kullanicidan isim ve soyisim isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim= scanner.nextLine();
        System.out.println("lütfen soyisminizi girin");
        String soyİsim= scanner.nextLine();

       int isimUzunlugu=isim.length();
       int soyisimUzunlugu=soyİsim.length();

       if (isimUzunlugu>soyisimUzunlugu){
           System.out.println("isim soyisimden uzundur");
       }else if (soyisimUzunlugu>isimUzunlugu)
       {
           System.out.println("soyisim isimden uzundur");
       }else {
           System.out.println("isim ve soyisim aynı uzunluktadir");
       }
    }
}
