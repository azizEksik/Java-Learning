package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir arrayden tekrar eden sayıları silip
        // her bir elementin sadece bir kez kullanıldığı bir hale dönüştürün


        int[] arr= {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        Arrays.sort(arr);

        // birtane boş list oluşturalım
        // arraydeki her bir elementi ele alalım
        // ele aldığımız element listte yoksa ekleyelim
        // varsa eklemeyelim
        //böylece benzersiz elementlerden oluşan bir list oluşturalım

        List<Integer> benzersizElementler= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementler.contains(arr[i])){
                benzersizElementler.add(arr[i]);
            }
        }

        // istenen listeyi list olarak elde ettik
        // bu arr'ye direkt atayamayız

        int[] yeniArr= new int[benzersizElementler.size()];

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=benzersizElementler.get(i);
        }

        System.out.println(Arrays.toString(yeniArr));

    }

}
