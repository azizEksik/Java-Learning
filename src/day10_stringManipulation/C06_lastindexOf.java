package day10_stringManipulation;

public class C06_lastindexOf {

    public static void main(String[] args) {

        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a")); // 20

        System.out.println(str.indexOf("a", 2)); // 3

        System.out.println(str.lastIndexOf("a", 19)); // 18

        System.out.println(str.indexOf("a",4)); // 6

        System.out.println(str.lastIndexOf("a", 17)); // 6

        System.out.println(str.indexOf('e')); //  8

        System.out.println(str.lastIndexOf('e')); // 12

        System.out.println(str.lastIndexOf("mustafa")); // -1

        System.out.println("===============================");

        // soru- verilen bir cümlede, istenen bir string için
        //       aşağıdaki cümlelerden uygun olanı yazdırın
        //       1- aradığınız kelime cümlede 1 kere  kullanılmış
        //       2- aradığınız kelime cümlede 1'den fazla kere kullanılmış
        //       3-aradığınız kelime cümlede hiç kullanılmamıştır



        String cumle="Yasasin java, iyi ki java ogreniyorum";

        String kelime="java";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)){

            System.out.println("aradığınız kelime cümlede hiç kullanılmamıştır");

        } else if (ilkIndex==lastIndex) {

            System.out.println("aradığınız kelime cümlede 1 kere  kullanılmış");
            
        }else {
            System.out.println("aradığınız kelime cümlede 1'den fazla kere kullanılmış");
        }


    }
}
