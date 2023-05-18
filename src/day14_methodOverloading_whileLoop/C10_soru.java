package day14_methodOverloading_whileLoop;

public class C10_soru {

    public static void main(String[] args) {

        //Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        //yazdirin.

        int sayi=10;

        while (sayi<100){

            if (sayi%7==0){

                System.out.print(" "+sayi);
            }
            sayi++;
        }
    }

}
