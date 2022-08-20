package day14_OdevsStringManipulation;

public class C01_stringManipulation {
    public static void main(String[] args) {
        //" Java ogrenmek123 Cok guzel@ " Stringi "Java ogrenmek cok guzel." sekline getirin

        String str=" Java ogrenmek123 Cok guzel@ ";
        str =str.replaceAll("\\d", "")
                .replace(" ","qwer")
                .replaceAll("\\W","")
                .replace("qwer"," ")
                .replace("C","c")
                .trim();
        System.out.println(str);
    }
}
