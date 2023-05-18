package day11_stringManipulation_ForLoop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.isEmpty()); // False // bu metod str boş mu diye sorar

        System.out.println(str.isBlank()); // False // bu metod da str Space yani boşluklardan mı oluşuyor diye sorar

        str= "   ";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // true

        str="";

        System.out.println(str.isEmpty()); // true

        System.out.println(str.isBlank()); // true

    }
}
