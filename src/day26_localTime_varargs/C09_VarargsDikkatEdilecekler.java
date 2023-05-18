package day26_localTime_varargs;

import java.util.Arrays;

public class C09_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        // verilen sayılardan ilki hariç digerlerini toplasın
        // sonra toplam ile ilk sayıyı çarpıp yazdırsın

        topla(2,3,4,5,6,7);

        /*
            Dikkat edilecekler 2 -

            son sayıyı ayırmak istesek?
            varargs eklenen tüm parametreleri kendisi almak ister

            bundan ötürü bir method'da parametre olarak
            varargs kullanılacaksa, EN SON parametre olarak kullanılmalıdır

            Dikkat edilecekler 3 -

            bir method'da parametre olarak 2 varargs KULLANILAMAZ
            çünkü varargs son parametre olmalıdır
            2 varargs olursa biri sonuncu olamayacağı için CTE verir

         */


    }
    /*

    public static void topla(int... a ){

        System.out.println(Arrays.toString(a));

        int toplam=0;
        for(int i = 0 ; i<a.length ; i++){
            toplam+=a[i];
        }
        System.out.println("Toplam :" + toplam);
    }

       Dikkat edilecekeler 1 -
       2 method için  Her ne kadar parametre sayısı farklı olsa da
       varargs'ın yapısından dolayı (int a, int... b) ile (int... b) arasında
       arasından argument fabülü açısından fark yoktur

     */
    public static void topla(int c ,int... a ){

        System.out.println(Arrays.toString(a));

        int toplam=0;
        for(int i = 0 ; i<a.length ; i++){
            toplam+=a[i];
        }
        System.out.println("istenen işlem sonucu :" + toplam*c);
    }
}
