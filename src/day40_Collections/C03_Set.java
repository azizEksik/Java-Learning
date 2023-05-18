package day40_Collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class C03_Set {

    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elemntlerini silip
        // her elementin sadece bir kere kullanıldığı hale getirin


        int[] arr = {6,4,3,2,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};

        Set<Integer> geciciSet= new HashSet<>();

        for (int each : arr){
            geciciSet.add(each);
        }

        int[] arr1= new int[geciciSet.size()];

        int index=0;

        for (int each : geciciSet){
            arr1[index]=each;
            index++;
        }
        arr=arr1;

        System.out.println(Arrays.toString(arr));
    }
}
