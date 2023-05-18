package day09_switch_stringManipulation;

public class C06_charAt {

    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(0)); // J

        // baştan altıncı harfi yazdırın

        System.out.println(str.charAt(5)); // C

        /*
        index 0'dan başladığı için 6. karqakter için 5 yazmalıyız
        kelimeler arasındaki boşluk(spca)
         */

        // sondan 2. harfi yazdırın

        System.out.println(str.charAt(9)); // i

        // son harfi yazdırın

        System.out.println(str.charAt(10)); // r

        /*
        Java'da 2 türlü hata ile karşılaşabiliriz
        1- syntax olarak hatalı yazılan kodları Java compile ederken anlar ve altını kırmızı çizer
            String=23; String bir variable'a int deger atanamayacığını bilir ve altını kırmızı çizer
            compileTimeError (CTE) diyoruz

        2-  Bazen de syntax'de hata olmaz
            Java sorunu calismaya başladıktan sonra fark eder
            str.charAt(15) : burada str'dan bir karakter isteniyoru
            compile time'da str'ın uzunluğunu Java anlamaz
            ama çalışınca 15. index'in olmadığını fark eder ve exception fırlatır
            bunlara da RunTimeError (RTE) deriz
         */





    }
}
