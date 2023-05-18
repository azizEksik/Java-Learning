package day18_multiDimensionalArray;

public class C07_MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr={{13,25,37},{41,12,23,34},{11,25},{17}};

        // 20 ile 40 arasında olan sayıların (20 ve 40  dahil) toplamını bulun

        int sayilarToplami=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>=20 && arr[i][j]<=40){
                    sayilarToplami+=arr[i][j];
                }
            }
        }
        System.out.println("20 ile 40 arasındaki sayıların toplamı : " + sayilarToplami);
    }
}
