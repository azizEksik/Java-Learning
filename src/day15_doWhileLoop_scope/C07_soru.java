package day15_doWhileLoop_scope;

public class C07_soru {
    public static void main(String[] args) {

        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char k='k';
        char t='t';
        String str="";

        do {
            str+=k;
            k++;

        }while (str.charAt(str.length()-1)<t);
        System.out.println(str);
    }
}
