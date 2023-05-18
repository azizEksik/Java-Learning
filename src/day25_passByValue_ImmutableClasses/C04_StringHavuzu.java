package day25_passByValue_ImmutableClasses;

public class C04_StringHavuzu {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3= new String("Java");
        String str4="Ja"+"va";
        String s="Ja";
        String t="va";
        String str5= s.concat(t);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true

        System.out.println("===========");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // true
        System.out.println(str1==str5); // false

        /*
            == hem referansı hem de degeri karşılaştırır
            equals() ise sadece degerleri karşılaştırır

            eger String havuzunda olup, hme referansı hem degeri aynı olan Stringler
            == ile karşılaştırılırlarsa sonuc TRUE olur

            ancak new keyword kullanılarak oluşturulan veya metdhod kullanılan String'ler
            == ile karşılaştırılılarsa sonuc  FALSE olur
         */
    }
}
