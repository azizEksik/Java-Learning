package day15_doWhileLoop_scope;

public class C08_LocalVariable {
    public static void main(String[] args) {

        /*
            1- bir method içerisinde oluşturulan variable'ın scop'u o method'dur
               başka bir method'dan KULLANILAMAZ
               bu variable'lara local variable denir
            2- her ne kadar bir method içinde olsalar da
               loop'ların da ayrı biir scope'u vardır
               loop içerisinde oluşturulan variable'lar
               loop dışında KULLANILAMAZLAR

            3- Local variable'ları deger atamadan oluşturabiliriz
               ancak deger atamadan KULLANAMAYIZ

         */

        String isim="Ali Can";

        int sayi;

        // System.out.println(sayi);

        // sayi++;

        for (int i = 0; i < 10; i++) {

            int j= i+1;
            
        }

        // System.out.println(i);
        // System.out.println(j);
    }

    public static void baskaMethod(){

        //System.out.println(isim);

        int sayi=5;
    }
}
