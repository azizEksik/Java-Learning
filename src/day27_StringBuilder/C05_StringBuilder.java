package day27_StringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4, 5)); // JavaCandir

        System.out.println(sb1); // JavaCandir

        System.out.println(sb1.deleteCharAt(9)); // JavaCandi

        System.out.println(sb1); // JavaCandi

        System.out.println(sb1.insert(9, "r")); // JavaCandir

        System.out.println(sb1); // JavaCandir

        sb1.insert(4, " "); // Java Candir

        System.out.println(sb1); // Java Candir

        String str = " can bize gelecekmis";

        sb1.insert(11, str, 0, 5); // Java Candir can

        System.out.println(sb1); // Java Candir can

        sb1.replace(12,15,"Can");

        System.out.println(sb1); // Java Candir Can 


    }
}
