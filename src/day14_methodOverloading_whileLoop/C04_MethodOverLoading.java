package day14_methodOverloading_whileLoop;

public class C04_MethodOverLoading {
    public static void main(String[] args) {

        /*
        Java overloading kurallarr:
        1-İsim ve parametreleri aynı olan birden fazla method oluşturulamaz
        2- data türleri farklı olan parametrelerin yerlerini değiştirirsek
           java yeni bir method olarak kabul eder (int, double) (double, int)

         Overloading olan class'larda Java hangi method'un çalıştırılacağına şu şekilde karar verir

         1- cağrılan isimde method var mı ?
         2- method call'da kullanılan arguments(parantez içine yazılan) ile methodlar'daki
            parametlerin %100 uyumlu olduğu var mı?
         3- argument ile parametre aynı olmasa bile
            verilen argument'leri kabul edecek parametre var mı
         4- Casting ile birden fazla method'u kullanabiliyorsa
            Daha azi Casting ile çalışacak method'u kullanır
         */

        topla(3,5); // 8

        topla(3.4,2.3); //  5.7

       // topla("ali", "veli"); // CTE bu argument'ler kabul edebilecek parametre yok

        topla('a', 'b'); // iki int 195

        topla(3f,4f); // İki double sayının toplamı : 7.0

        topla(3f,4); // double ve int sayıların toplamı : 7.0



    }

    public static void topla(int a, int b){

        System.out.println("İki tamsayının toplamı : " +(a+b));


    }

    public static void topla(double a, double b){

        System.out.println("İki double sayının toplamı : " + (a+b));
    }

    public static void topla(int sayi1,double sayi2){
        System.out.println("int ve double sayıların toplamı : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("double ve int sayıların toplamı : " + (sayi1+sayi2));
    }
}
