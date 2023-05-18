package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_soru {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] sayilar={2,2,5,5,4,3,9,9,8,8,5,6,1,1,77,6,2,13,21,54};

        System.out.println(Arrays.toString(benzersizArray(sayilar))); // [2, 5, 4, 3, 9, 8, 6, 1, 77, 13, 21, 54]
    }

    public static int[] benzersizArray(int[] array){

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!sayilar.contains(array[i])){
                sayilar.add(array[i]);
            }
        }

        int [] yeniArray= new int[sayilar.size()];

        for (int i = 0; i < sayilar.size(); i++) {
            yeniArray[i]=sayilar.get(i);
        }

        return yeniArray;
    }


}

