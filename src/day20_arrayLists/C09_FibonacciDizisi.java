package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_FibonacciDizisi {
    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.

        // 0 1 1 2 3 5 8 13 21 34 55 89 .....

        System.out.println(FibonacciDizisi(10));

    }

    public static List<Integer> FibonacciDizisi(int sayiAdedi){

        List<Integer> FibonacciDizisi= new ArrayList<>();

        if (sayiAdedi<=0){
            System.out.println("yanlış giriş");
        }else if (sayiAdedi==1){
            FibonacciDizisi.add(0);
        }else if (sayiAdedi==2){
            FibonacciDizisi.add(0);
            FibonacciDizisi.add(1);
        }else {
            int ilkSayi=0;
            FibonacciDizisi.add(ilkSayi);
            int ikinciSayi=1;
            FibonacciDizisi.add(ikinciSayi);
            int yeniSayi=ilkSayi+ikinciSayi;
            FibonacciDizisi.add(yeniSayi);

            while(FibonacciDizisi.size()<sayiAdedi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                FibonacciDizisi.add(yeniSayi);
            }
        }
        return FibonacciDizisi;
    }
}
