package day14_methodOverloading_whileLoop;

public class C06_soru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.

        System.out.println(tambolenleri(20));

    }

    public static int tambolenleri(int a){

        int kova=0;

        for (int i = 2; i <=a ; i++) {

            if (a%i==0){

                kova++;
            }

        }



        return kova;
    }
}
