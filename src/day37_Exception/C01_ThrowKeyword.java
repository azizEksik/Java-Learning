package day37_Exception;

public class C01_ThrowKeyword {

    public static void main(String[] args) {

        int sayi=1;
        System.out.println(sayi); // 1

        try {
            sayi=2;
            System.out.println(sayi); // 2
            if (sayi==2){
                throw new RuntimeException(); // sayi'nin degeri 2 olunca throw keyword ile exception fırlattık
                                              // catch bloguna kadar olan kodlar görmezden gelindi
            }
            sayi=3;
            System.out.println(sayi); // görmezden gelindi
            sayi=4;
            System.out.println(sayi); // görmezden gelindi
            sayi=5;
            System.out.println(sayi); // görmezden gelindi

            /*
                bazı durumlarda bazı kodların görmezden gelinmesini istediğimizde throw keyword kullanırız
             */

        } catch (RuntimeException e) {

        }

        sayi=6;
        System.out.println(sayi); // 6

    }
}
