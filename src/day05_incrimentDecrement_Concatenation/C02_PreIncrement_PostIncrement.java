package day05_incrimentDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*
            Eger sayinin degeri Sadece 1 artacak veya azalacaksa
            arttirip sonra yazdirma/atama
            yazdirip sonra arttirma/atama

            yazdirma islemlerini tek satirda yapabiliriz

         */

        //a'nin degerini 1 arttirin ve yeni degerini olusturacaginiz b veriable'ina atayin

        /*
        int a=20;

        a++;

        int b=a;

        System.out.println("a : "+  a + ", " + " b : " + b); // a : 21,  b : 21

         */


        //=============



        // a'nin degerini b'ye atayin, sonra a'nin degerini 1 arttirin

        /*
        a=20;
        b=a;

        a++;

        System.out.println("a : "+  a + ", " + " b : " + b); // a : 21,  b : 20

         */

        // Bu islemleri istersek tek satirda yapabiliriz

        //a'nin degerini 1 arttirin ve yeni degerini olusturacaginiz b veriable'ina atayin

        int a=20;

        int b= ++a; // önce arttirir

        System.out.println("a : "+  a + ", " + " b : " + b);

        // a'nin degerini b'ye atayin, sonra a'nin degerini 1 arttirin

        a=20;

        b=a++; // once atar sonra arttirir

        System.out.println("a : "+  a + ", " + " b : " + b); // a : 21,  b : 20

        // a'nin degerini yazdirin ve sonra a'yi 1 arttirin

        a=20;

        System.out.println("a : "+ a); //a : 20

        a++;

        System.out.println("a : "+ a); //a : 21

        //=======
        System.out.println("=========");

        a=20;

        System.out.println("a : " + a++); // a : 20
        System.out.println("bir sonraki satırda a: "+ a); // bir sonraki satırda a: 21

        //=========

        System.out.println("=========");

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdırın

        a=20;

        System.out.println("a : " + --a );
        System.out.println("Bir sonraki satırda a :" + ++a);



















    }
}
