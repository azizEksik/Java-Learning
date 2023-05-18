package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_soru {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9};

        List<Integer> yeniList=new ArrayList<>();

        for (int each:arr
             ) {
            if (!yeniList.contains(each)){
                yeniList.add(each);
            }
        }
        int[] arr1=new int[yeniList.size()];

        for (int i = 0; i < yeniList.size(); i++) {
            arr1[i]=yeniList.get(i);
        }

        arr=arr1;
        System.out.println(Arrays.toString(arr));

    }
}
