package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_soru {
    public static void main(String[] args) {

        //Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.

        // benden ekleme : Liste de natural order'a göre olsun

        int[] arr1={1,2,3,4,5,6,7,8,9,9,9,1};
        int[] arr2={1,3,5,7,9,9,9,1,1,5,5,5,5,5,5,5};

        List<Integer> ortakEleman=new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    ortakEleman.add(arr2[j]);
                    break;
                }
            }
        }
        // benden ekleme kısmı;

        int[] arr3=new  int[ortakEleman.size()];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=ortakEleman.get(i);
        }

        Arrays.sort(arr3);

        List<Integer> duzenlenmisOrtakEleman=new ArrayList<>();

        for (int i = 0; i <arr3.length ; i++) {
            duzenlenmisOrtakEleman.add(arr3[i]);
        }
        System.out.println(duzenlenmisOrtakEleman);
    }
}
