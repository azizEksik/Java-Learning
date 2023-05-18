package day05_incrimentDecrement_Concatenation;

public class C04_StringIntGecisler {
    public static void main(String[] args) {

        String s1= "423";

        // s1'i int'a çevirmek istersek

        int sayi= Integer.parseInt(s1);

        System.out.println(sayi++); // 423

        int a= 20;
        int b= 40;

        // bu iki sayıyı kullanarak 2040 yazdırın

        String harf1= String.valueOf(a);
        String harf2= String.valueOf(b);

        System.out.println(harf1+harf2); // 2040

        //diğer yöntem

        System.out.println(a+""+b); // 2040
        System.out.println(""+a+b); // 2040



    }
}
