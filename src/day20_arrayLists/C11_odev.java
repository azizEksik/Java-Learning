package day20_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_odev {
    public static void main(String[] args) {

        // odev: verilen bir listede, istenen iki index'deki elementlerin yerini değiştip
        //       yeni listeyi bize döndüren bir method oluşturun

        int[] arr={3,5,1,4,3,7,10};

        System.out.println(Arrays.toString(arr)); // [3, 5, 1, 4, 3, 7, 10]

        System.out.println(istenenElementinYeriniDegistirme(arr, 2, 5)); // [3, 5, 7, 4, 3, 1, 10]

    }

    public static List<Integer> istenenElementinYeriniDegistirme(int[] arr ,int index1, int index2){

        List<Integer> yeniArrList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            yeniArrList.add(arr[i]);
        }
        int tempt=yeniArrList.get(index1);

        yeniArrList.set(index1,yeniArrList.get(index2));
        yeniArrList.set(index2,tempt);

        return yeniArrList;
    }
}
