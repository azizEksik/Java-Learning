package day18_multiDimensionalArray;

public class C06_MultiDimensionalArray {
    public static void main(String[] args) {


        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        // array'de kaç tane çift sayı olduğunu bulun


        int adet=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    adet++;
                }
            }
        }
        System.out.println("Çift sayı adedi : " + adet); // 3
    }
}
