package day14_OdevsStringManipulation;

import java.util.Scanner;

public class C05_stringManipulation {
    public static void main(String[] args) {
        //kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 4harfli kelime girin");
        String str= scanner.next();
        //abcd
        str=str.substring(3,4).concat(str.substring(2,3).concat(str.substring(1,2).concat(str.substring(0,1))));
        System.out.println(str);


    }
}
