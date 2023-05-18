package day12_forLoops;

import java.util.Scanner;

public class C10_soru {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir kelime yazınız");

        String kelime= scan.nextLine();

        String output="";

        for (int i = kelime.length()-1; i>=0 ; i--) {

            output += kelime.charAt(i);

        }

        System.out.println(output);


    }
}
