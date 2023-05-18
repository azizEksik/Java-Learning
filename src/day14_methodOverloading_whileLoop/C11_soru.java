package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C11_soru {
    public static void main(String[] args) {

        // While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        // donduren bir method olusturun.
        System.out.println(tersstring("aziz"));
    }

    public static String tersstring(String girilenstring){


        String ters="";
        int adet=1;

        while (girilenstring.length()+1!=adet){

            ters+=girilenstring.charAt(girilenstring.length()-adet);
            adet++;
        }
        return ters;
    }
}
