package day18_multiDimensionalArray;

public class C08_soru {
    public static void main(String[] args) {

        //Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        ciftSayilariToplama(arr);

    }


    public static void ciftSayilariToplama (int[][] ciftSayilariToplama){

        int ciftSayilarToplami=0;

        for (int i = 0; i < ciftSayilariToplama.length; i++) {
            for (int j = 0; j < ciftSayilariToplama[i].length; j++) {
                if (ciftSayilariToplama[i][j]%2==0){
                    ciftSayilarToplami+=ciftSayilariToplama[i][j];
                }
            }
        }
        System.out.println("Arraydeki çift sayıların toplamı : " +ciftSayilarToplami);

    }
}
