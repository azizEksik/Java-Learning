package day09_switch_stringManipulation;

public class C06_equals {

    public static void main(String[] args) {

        // equals(karşılaştırma)

        String str1= "Java";

        String str2= "JAVA";

        String str3= "java";

        String str4= "JaVa";

        System.out.println(str1.equals(str2)); // false

        System.out.println(str3.equals(str4)); // false

        //eger büyük küçük harfe dikkat etmeden string'leri karşılaştırmak isterseniz

        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str3.equalsIgnoreCase(str4)); // true

        String str5= "Java";
        String str6= "Ja";
        String str7= "va";
        String str8= str6.concat(str7); // "Ja" ile "va"yı birleştiren method

        System.out.println(str8); //Java

        System.out.println(str1 == str5); // Java == Java // true

        System.out.println(str1 == str8); // Java == Java // false

        /*
        == ile String'leri karşılaştırırsak hem metin değerine hem de referanslarına bakar
        equals ile String'leri karşılaştırırsak sadece metin değerlerine bakar

        == ile String'leri karşılaştırdığımızda beklediğimizden farklı sonuçlar alabiliriz
        bu yüzden iki String'i karşılaştıracaksask == değil, equals kullanırız
         */






    }
}
