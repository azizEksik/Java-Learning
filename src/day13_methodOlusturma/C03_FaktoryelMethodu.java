package day13_methodOlusturma;

public class C03_FaktoryelMethodu {

    public static void main(String[] args) {

        // verdiğimiz bir sayının faktöryelini hesaplayıp
        // sonucu bize  döndüren bir method oluşturun

        /*
                Method oluşturma aşamaları
                1- public static standart(şimdilik)
                2- oluşturduğumuz bize bir sonuç dödürecekse
                   dödüreceği sonucun data türünü yazıyoruz
                3- method ismi
                4- method parantezi içine () method'a göndermemiz gereken bilgileri
                   hangi variable ile gödereceğimizi yazalım (parametre)
                5- Döndürülmesi istenen işlemi yap
                6- return heyword kullanarak döndürülmesi istenen değeri döndür

         */

        int sonuc = faktoryelHesapla(3);

        System.out.println(sonuc);
    }

    public static int faktoryelHesapla( int sayi){

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel*=i;

        }

        return faktoryel;

    }


}
