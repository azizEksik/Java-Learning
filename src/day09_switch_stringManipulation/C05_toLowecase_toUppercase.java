package day09_switch_stringManipulation;

import java.util.Locale;

public class C05_toLowecase_toUppercase {
    public static void main(String[] args) {

        String str= "Java Candır";

        //str'ı büyük harf olarak yazdırın

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candır

        // String manipulation yaptıktan sonra, asıl variable'a atama yapılmazsa
        //asıl variable değişmez

        str=str.toUpperCase();

        System.out.println(str); //JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candır

        //str'ı turkçe karakterleri göz onünde bulundurarak küçük harfe çevirin

        str=str.toLowerCase(Locale.forLanguageTag("TR")); // java candır

        System.out.println(str);


    }
}
