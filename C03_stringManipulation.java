package day14_OdevsStringManipulation;

import java.util.Scanner;

public class C03_stringManipulation {
    public static void main(String[] args) {
        //kullanicidan isim isteyin.Eger
        //isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        //isim "Z"harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        //ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String str= scanner.nextLine();
        if (str.toLowerCase().contains("a")&&str.toUpperCase().contains("Z")){
            System.out.println("a harfide Z harfide iceriyor");
        }
        else if (str.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (str.toUpperCase().contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
    }
}
