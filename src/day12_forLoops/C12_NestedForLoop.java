package day12_forLoops;

public class C12_NestedForLoop {
    public static void main(String[] args) {

        //dinamik olarak verilen satır ve sütun sayısına göre
        // yıldızlardan bir dikdörtgen oluşturun

        /*
                * * * * *
                * * * * *
                * * * * *
         */

        int satirsayisi=3;
        int sutunsayisi=5;

        for (int k = 1; k <=satirsayisi ; k++) { // satir sayisi
            for (int i = 1; i <=sutunsayisi ; i++) { // sütun sayısı

                System.out.print("* ");
            }
            System.out.println(""); // bir satırdaki tüm sütunlar bitince alt satıra geçiyor

        }

        System.out.println("=================");

        for (int i = 1; i <=satirsayisi ; i++) { // satırlar
            for (int j = 1; j <=sutunsayisi ; j++) { // sütunlar
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
