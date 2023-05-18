package day11_stringManipulation_ForLoop;

public class C03_replace {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.replace('J', 'H')); // Hava Candir

        System.out.println(str.replace("a", "")); // Jv Cndir

        System.out.println(str.replace("Java", "x")); // x Candir

        System.out.println(str.replace("v", "yayaya")); // Jayayayaa Candir

        // str'daki space'leri yok edin

        str= str.replace(" ", "");

        System.out.println(str); // JavaCandir

        // replaceFirst method'u

        System.out.println(str.replaceFirst("a", "")); // JvaCandir // sadece ilk a'yı değiştirdi



    }
}
