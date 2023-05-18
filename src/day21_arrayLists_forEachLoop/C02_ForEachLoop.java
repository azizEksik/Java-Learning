package day21_arrayLists_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
            Bizden istenen görevde siralama önemsiz ise
            asil amaçlanan tüm elementleri elden geçirmek ise
            for loop yerine for each loop tercih edilir

            for each loop'da
                - index yok
                - başlangıç değeri yok
                - bitiş degeri yok

         */

        int[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};


        // array'yin tüm elemtlerinin toplamını yazdırın
        int toplam=0;
        for (int each: arr
             ) {
            toplam+=each;
        }
        System.out.println("Elemtler toplamı : "+ toplam);

        // array'in elementlerinden 3 ile bölünebilenleri yazdırın

        for (int each: arr
             ) {
            if (each%3==0){
                System.out.print(each + " ");
            }
        }
        System.out.println("");

        //  array'in elemntleri içinde kaç tane tek sayı olduğunu bulun
        int adet=0;
        for (int each: arr
             ) {
            if (each%2!=0){
                adet++;
            }
        }
        System.out.println("arr içindeki tek sayı adedi : " + adet);

    }
}
