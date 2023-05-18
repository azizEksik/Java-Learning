package day09_switch_stringManipulation;

public class C07_concat {

    public static void main(String[] args) {


        String str1= "Java";
        String str2= "Candir";
        String  str3= " ";

        // yukarıdaki variable'ları kullanarak "Java Candir" yazdırın

        System.out.println(str1 + str3 + str2); //Java Candir

        //Method  ile aşağıdaki gibi yapılır
        //concat methodu kullanılır

        System.out.println(str1.concat(str3).concat(str2)); // Java Candir



    }
}
