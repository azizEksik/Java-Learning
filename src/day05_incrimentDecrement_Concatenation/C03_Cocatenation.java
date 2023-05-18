package day05_incrimentDecrement_Concatenation;

public class C03_Cocatenation {

    public static void main(String[] args) {

        // bir String başka bir String veya başka data türünden bir variable ile
        // + işareti ile birleştirilebilir

        String a= "Java";
        String b="Guzeldir";

        System.out.println(a+b); // JavaGuzeldir

        System.out.println(a + " " + b); //J ava Guzeldir

        int c= 10;

        int d= 20;

        System.out.println(a+c+d); //Java1020

        //eger String ile baska data türündeki bir deger toplanırsa java sonucu String yapar

        // peki Java30 yazmak istersek

        System.out.println(a+(c+d)); //Java30

        System.out.println(a+c*d); // Java200 (işlem önceliği c*d'dir )

        System.out.println(c+d+a); // 30Java



    }
}
