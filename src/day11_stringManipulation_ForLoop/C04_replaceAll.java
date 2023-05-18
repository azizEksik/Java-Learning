package day11_stringManipulation_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {

        String str="J1a23va34 5C54and65ir87";

        //str'daki sayıları method'la temizleyin


        /*
        eger değiştirmek istedigimiz metin tek bir metin,
        değil ortak özelliği  olan farkli metinlerse

        -tüm sayılar
        -sayı olmayanların tümü
        -tüm space'ler
        -space olmayan tüm karakterler,,,

        bu ortak özellikleri belirtmek için Java regex tanimlamiştir
         */

        str = str.replaceAll("\\d","");

        System.out.println(str);

    }
}
