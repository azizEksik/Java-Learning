package day10_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {


        String str= "Java ne kadar guzel";
        //substring iki farklı şekilde kullanılabilir
        // 1- tek parametre olursa, o indexten başlar sonuna kadar yazdırır

        System.out.println(str.substring(8)); // kadar guzel

        System.out.println(str.substring(0)); // Java ne kadar guzel

        System.out.println(str.substring(str.length() - 3)); // zel

        System.out.println(str.substring(str.length())); // hiçlik yazdırır çünkü str'ın karakter uzunluğu 19
                                                         // index  uzunluğu ise 18 çünkü index 0'dan başlar
                                                         // 19. index'te de karakter olmadığı için hiçlik yazdırır


        // 2- iki parametre girilirse baslangicIndex'inden(dahil) başlar
        //    bitisIndex'ine(hariç) kadar olan bölümü yazdırır

        System.out.println(str.substring(5, 7)); // ne

        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.substring(0 ,1)); // J

        //str'ın 5. index'teki karakterini yazdırın

        System.out.println(str.charAt(5)); // n
        System.out.println(str.substring(5, 6)); // n

        System.out.println(str.substring(2,2)); // hiçlik

        // System.out.println(str.substring(5, 1)); // rune Time Error, yani hata verir




    }
}
