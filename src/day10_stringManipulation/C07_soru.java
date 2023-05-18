package day10_stringManipulation;

public class C07_soru {
    public static void main(String[] args) {


        String str="Java Candir can.";

        // str kaç kelimedir?

        int flag=0;
        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)==' '){
                flag++;
            }
        }
        System.out.println("Str'daki kelime sayısı : " + (flag+1));
    }
}
