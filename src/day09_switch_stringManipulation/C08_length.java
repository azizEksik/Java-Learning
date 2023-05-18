package day09_switch_stringManipulation;

public class C08_length {
    public static void main(String[] args) {


        String str= "Java gun gectikce guzellesiyor";

        // bu cümledeki karakter sayısını yazdırın

        System.out.println(str.length()); // 30 karakter

        // bu cümledeki son karakteri yazdırın

        System.out.println(str.charAt(29)); // r

        // hepsini tek cümlede yazdıracak güzel bir yol

        System.out.println(str.charAt(str.length()-1)); // r

        // sondan 3. karakteri yazdırın

        System.out.println(str.charAt(str.length()-3)); // y

        




    }
}
