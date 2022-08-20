package day14_OdevsStringManipulation;

import java.util.Scanner;

public class C07_stringManipulation {
    public static void main(String[] args) {
        //kullanicidan ismini,soyismini ve kredi kart numarasini isteyin
        //isim-soyisim:B**** K*******
        //kart no :1243 **** **** ****

        Scanner scan=new Scanner(System.in);
        System.out.print("write your name:");
        String name=scan.nextLine().toUpperCase();
        System.out.print("write your surname:");
        String surname= scan.nextLine().toUpperCase();

        System.out.print("write your card numbers:");
        String cardNumber=scan.nextLine();

        String nameFirst=name.substring(0,1);
        String nameLeast=name.substring(1).replaceAll("\\w","*");

        String surnameFirst=surname.substring(0,1);
        String surnameLeast=surname.substring(1).replaceAll("\\w","*");

        String First4=cardNumber.substring(0,4);
        String cardleast=" **** **** ****";

        System.out.println(nameFirst+nameLeast+" "+surnameFirst+surnameLeast+"\n"+First4+cardleast);


    }
}
