package day17_arrays;

public class C05_EnUzunElementiYazdir {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String [] arr1={"Melike","Burkay","İnci","Eda","Emre"};

        arraydakiEnuzunEnkisaElemnetYazdir(arr1);


    }

    public static void arraydakiEnuzunEnkisaElemnetYazdir(String[] arr){

        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }
        System.out.println("array'daki en uzun kelime : "+enUzunKelime);
        System.out.println("array'daki en kısa kelime : " + enKisaKelime);

    }

}
