package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class C06_sorular {
    public static void main(String[] args) {

        // soru - Kullanıcıdan bir cümle alın
        //-cümlede ev  geçiyorsa "home home sweet home" yazdırın
        //-cümlede is geçiyorsa "calismak guzeldir"
        //-ikisini de iceriyorsa "Hem ev lazım hem is"
        //-hiçbirini içermiyorsa "cok calisman lazim" yazdırın

        /*

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz");

        String cumle= scan.nextLine();


        if (cumle.contains("ev")&& !cumle.contains("is")){
            System.out.println("home home sweet home");
        } else if (cumle.contains("is") && !cumle.contains("ev")) {
            System.out.println("calismak guzeldir");
        } else if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazım hem is");

        }else {
            System.out.println("cok calisman lazim");
        }

         */


        //Soru- Kullanıcının belirli bir formatta verdigi String fiyatları toplayıp yazdırın
        // input1: "15.30 $"  input2: "11.40 $"   output: 26.70 $

        /*
                String input1="15.30 €";
        String input2="11.40 €";


       //int'e çevirip toplayabilmemiz için string'lerdeki digit  olmayan herşeyi yok etmemiz lazım.


        input1=input1.replaceAll("\\D","");
        input2=input2.replaceAll("\\D","");


        //digit olamaynları yok ettik ama String oldukları için toplayamayız
        //int'e parse etmeliyiz


        double a=Double.parseDouble(input1);
        double b=Double.parseDouble(input2);

        System.out.println((a+b)/100 + " €");
         */

        //soru- Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali +
        //- son karakter rakam olmali +
        //- sifre bosluk icermemeli +
        //- uzunlugu en az 10 karakter olmali +

        /*

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir şifre belirleyiniz");

        String sifre= scan.nextLine();
        int uzunluk= sifre.length();

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            System.out.println("ilk harf kucuk harf olmali");
        } else if (uzunluk<10) {
            System.out.println("uzunlugu en az 10 karakter olmali");

        } else if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");

        }else if (!(sifre.charAt((uzunluk-1))>='0'&& sifre.charAt((uzunluk-1))<='9')){
            System.out.println("son karakter rakam olmali");
        }else {
            System.out.println("şifre başarıyla kaydedildi");
        }

         */


        //soruyu if else ile yaparsak sadece 1 hata yazdırır, ötekilere bakmaz
        //diger hataları da yazdırmak istiyorsak bagımsız 4 if-else cümlesi olmalı
        //en son 4 şartı da sagladığını kontrol eden bir variable kullanacağız


        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir şifre belirleyiniz");

        String sifre= scan.nextLine();

        int flag=0;

        //- ilk harf kucuk harf olmali

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("ilk harf kucuk harf olmali");
        }

        //- son karakter rakam olmali

        int uzunluk=sifre.length();

        if (sifre.charAt(uzunluk-1)>='0' && sifre.charAt(uzunluk-1)<='9'){
            flag++;
        }else {
            System.out.println("son karakter rakam olmali");
        }

        //- sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else {
            flag++;
        }

        //- uzunlugu en az 10 karakter olmali

        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("uzunlugu en az 10 karakter olmali");
        }

        //eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

        if (flag==4){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
