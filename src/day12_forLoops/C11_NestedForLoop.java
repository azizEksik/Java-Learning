package day12_forLoops;

public class C11_NestedForLoop {
    public static void main(String[] args) {

        // velilen bir rakam için çarpım tablosu oluşturun

        int sayi=4;

        /*
            1  2  3  4 ==> 1*1 1*2 1*3 1*4
            2  4  6  8 ==> 2*1 2*2 2*3 2*4
            3  6  9  12 ==> 3*1 3*2 3*3 3*4
            4  8  12 16 ==> 4*1 4*2 4*3 4*4
         */

        int k =1;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");

        k++;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");

        k++;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");

        k++;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println();

        System.out.println("==================");

        for (int m = 1; m <=sayi ; m++) {
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(m*i + " ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("================");


        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {

                System.out.print(i*j + " ");

            }
            System.out.println("");

        }



    }
}
