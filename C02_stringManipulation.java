package day14_OdevsStringManipulation;

public class C02_stringManipulation {
    public static void main(String[] args) {
        //String seklinde verilen asagıdaki fiyatlari toplayin
        //String str1="$13.99"
        //String str2="$10.55"
        // ipucu:Double.parseDouble() methodunu kullanabilirsiniz

        String str1="$13.99";
        String str2="$10.55";
        String str3=str1.replace("$","");
        String str4=str2.replace("$","");
        Double d1=Double.parseDouble(str3);
        Double d2=Double.parseDouble(str4);

        System.out.println("$"+(d1+d2));







    }
}
