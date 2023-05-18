package day12_forLoops;

public class C14_NestedForLoop {
    public static void main(String[] args) {

        /*

            verilen satır sayısına göre aşağıdaki şekli oluşturan kod yazınız


            *
            * *
            * * *
            * * * *

         */

        int satir=4;

        for (int i = 1; i <=satir ; i++) { // satirlar / Outer Loop yani dış föngü
            for (int j = 1; j <=i ; j++) { // sütunlar / Inner Loop yani iç döngü
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
