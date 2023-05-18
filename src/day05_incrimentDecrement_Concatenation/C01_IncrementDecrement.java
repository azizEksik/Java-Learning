package day05_incrimentDecrement_Concatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {


        int a= 20;

        //a'nin degerini 3 arttirin ve yeni degerini olusturacaginiz b veriable'ina atayin

        a +=3;
        int b=a;
        System.out.println("a : "+  a + ", " + " b : " + b); // a : 23,  b : 23

        // =======


        a=20;

        // a'nin degerini b'ye atayin, sonra a'nin degerini 3 arttirin

        b=a;

        a+=3;

        System.out.println("a : "+  a + ", " + " b : " + b); // a : 23,  b : 20

        //=========


        a=20;

        // a'nin degerini yazdirin ve sonra a'yi 5 arttirin

        System.out.println("a : "+a); // a : 20

        a +=5;

        System.out.println("a : " +a); // a : 25

        //===========


        a=20;

        // a'nin degerini 2 azaltin ve sonra a'nin degerini yazdırın


        a-=2;

        System.out.println("a : " + a); // a : 18




    }
}
