package day15_doWhileLoop_scope;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
                While loop'da bitiş şartı kontrolü her zaman bodyden 1 fazla çalışır
                while loop'da kullanıcıdan alacağımız değerlere önce bizim deger atamamız gerekir
                bu da bazen hatalara sebep olur

         */

        int sayi=-10;
        int toplam=0;

        while (sayi>0){

            toplam+=sayi*sayi;
            sayi--;
        }
        System.out.println("While toplam : "+toplam);



        sayi=-10;
        toplam=0;

        do {
            toplam+=sayi*sayi;
            sayi--;

        }while (sayi>0);

        System.out.println("do while toplam : "+ toplam);


    }
}
