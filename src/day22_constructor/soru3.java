package day22_constructor;

import java.util.ArrayList;
import java.util.List;

public class soru3 {
    public static void main(String[] args) {


// [3,5,1,2,7,9,2,3,5,7]
// output [3, 5+1, 2+7+9, 2+3+5+7]
//        [3, 6,    18,    17]

        int[] arr={3,5,1,2,7,9,2,3,5,7};

        List<Integer> list1=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }

        System.out.println(list1); // [3, 5, 1, 2, 7, 9, 2, 3, 5, 7]

        List<Integer> list2=new ArrayList<>();
        int sayac1=0;
        for (int i = 0; i < arr.length; i=i+sayac1) {
            list2.add(arr[i]);
            sayac1++;
        }

        System.out.println(list2); // [3, 5, 2, 2] // list2'de oluşturduğum yöntem toplamaya başlayacağımız elementlerin
        // index'ini bulmak içindi

        List<Integer> list3=new ArrayList<>();
        list3.add(list1.get(0));
        int sayac2=1;
        int whileSayac=2;
        for (int i = 1; i < arr.length; i=i+sayac2) {

            List<Integer> list4=new ArrayList<>();
            int toplam=0;
            int listSayac=0;
            while (whileSayac!=list4.size()){
                list4.add(list1.get(i+listSayac));
                listSayac++;
            }
            for (int j = 0; j < list4.size(); j++) {
                toplam+=list4.get(j);
            }
            list3.add(toplam);
            sayac2++;
            whileSayac++;
            toplam=0;
        }
        System.out.println(list3);

    }
}
