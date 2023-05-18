package day36_Exceptions;

public class C07_ExceptionTurleri {

    public static void main(String[] args) {

        String str=null;

        System.out.println(str); // null

        //System.out.println(str.concat("Java")); // NullPointerException

        String str1="34";
        String str2="23a";

        // String olarak verilen sayıların toplamını yazdırın

        //System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // NumberFormatException

        String str4 = "Java Candir";

        Object obj = str4;

        Integer a = (Integer) obj;

        //System.out.println(a); // ClassCastException
    }
}
