package day21_arrayLists_forEachLoop;

public class C04_soru {
    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        int[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        karelerinToplami(arr);

    }
    public static void karelerinToplami(int[] array){

        int kareToplami=0;

        for (int each: array
             ) {
            kareToplami+=each*each;
        }
        System.out.println(kareToplami);
    }
}
