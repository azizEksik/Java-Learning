package day11_stringManipulation_ForLoop;

public class C11_ForLoopls {
    public static void main(String[] args) {

        // 50'den başlayıp, 100'e kadar(100 dahil) sayıları
        //yan yana, aralarında bir boşluk olacak şekilde yazdırın



        for (int i = 50; i <=100 ; i++) {

            System.out.print(i+ " ");

        }

        System.out.println("");


        //3 basamaklı sayılardan 23 ile bölünebilenleri
        // yan yana, aralarında bir boşluk olacak şekilde yazdırın



        for (int i = 100; i <=999 ; i++) {

            if (i%23==0){
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        //20'den başlayıp 7'şer artarak 100'e kadar yazdırın
        //(100 yazdırmamız gerikiyorsa yazdırın ama 100'ü geçmeyin)

        for (int i = 20; i <=100 ; i+=7) {

            System.out.print(i  + " ");

        }

        System.out.println("");

        //100'den başlayarak 1'e kadar (sinirlar dahil)
        // 7 ile bölünebilen sayıları yazdırın

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }

    }
}
