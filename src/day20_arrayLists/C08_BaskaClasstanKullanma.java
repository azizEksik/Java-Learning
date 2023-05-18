package day20_arrayLists;

public class C08_BaskaClasstanKullanma {
    public static void main(String[] args) {

        //verilen sayının pozitif tam bölenleri sayısı 10'dan çok ise "Guzel"
        // yoksa "Kotu" yazdırın

        int sayi=140;

        int pozitifTamBolenlerListesi= C07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if (pozitifTamBolenlerListesi>10){
            System.out.println("Tam bölenlerinin sayısı : " + pozitifTamBolenlerListesi);
            System.out.println("Guzel");
        }else {
            System.out.println("Tam bölenlerinin sayısı : " + pozitifTamBolenlerListesi);
            System.out.println("Kotu");
        }
    }
}
