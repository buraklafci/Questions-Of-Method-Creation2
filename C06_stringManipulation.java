package day14_OdevsStringManipulation;

import java.util.Scanner;

public class C06_stringManipulation {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin.Asagidaki satlari sagliyorsa "Sifre basari ile tanimlandi",
        //sartlari saglamazsa "Islem basarisiz,Lütfen yeni bir sifre girin" yazdirin
        //ilk harf büyük harf olmali
        //Son harfi kücük harf olmali
        //Sifre bosluk icermemeli
        //Sifre uzunlugu en az 8 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen sifre girin");
        String sifre= scanner.nextLine();

        //1.cözüm
        if ((sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z')
                &&(sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z')
                &&(!sifre.contains(" "))
                &&(sifre.length()>=8)){
            System.out.println("Sifre basari ile tanimlndi");
        }else {System.out.println("islem basarisiz,lütfen yeni bir sifre girin");}

        //2.cözüm

        int kontrol=0;

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("Ilk harf büyük olmali");
        }if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("Son harf kücük olmali");
        }if (!sifre.contains(" ")){
            kontrol++;
        }else {
            System.out.println("Bosluk icermemeli");
        }if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre en az 8 karakterli olmali");
        }if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else System.out.println("Islem basarisiz,Lütfen yeni bir sifre girin");



    }
}
