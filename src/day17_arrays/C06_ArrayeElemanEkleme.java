package day17_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {

        /*

        int[] a={4,5,6};
        int[] b={4,5,6,10};

        a = b;

        System.out.println(Arrays.toString(a)); // {4,5,6,10}


                Array'in uzunluğu değiştirilmez
                Ancak array'e yeni bir array degeri atanabilir
         */


        // verilen array'e istenen  elementi ekleyelim

        int[] arr={4,5,6};
        int eklenecekElement= 10;

        // arr=new int[4]; [0,0,0,0] // direkt atama yaparsak eski degerler kaybolur
        // önce istenen uzunlukta yeni bir array oluşturup
        // eski array'deki tüm elemntleri yeni array'e taşıyoruz
        // sonra istene elementi de atayıp
        // yeni array istediğimiz hale gelince
        // eskiArr= yeniArr diyerek yeni arr'nin degerini eskisine  atıyoruz

        int[] yeniArr=new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];
            
        } // yeniArr=[4,5,6,0]

        yeniArr[yeniArr.length-1]=eklenecekElement;

        System.out.println(Arrays.toString(yeniArr)); // [4, 5, 6, 10]

        arr=yeniArr;

        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 10]


    }
}
