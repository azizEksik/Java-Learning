package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir String'i tersine çevirip
        // bize dödüren bir method oluşturun

        System.out.println(stringiTersineCevirme("Java Candir"));
        System.out.println(stringiTersineCevirme("Anlasildi mi"));
        System.out.println(stringiTersineCevirme("Soyle Omer"));

    }

    public static String  stringiTersineCevirme(String  metin){

        String  tersMetin="";

        for (int i = metin.length()-1; i>=0 ; i--) {

            tersMetin+=metin.charAt(i);
            
        }
        return tersMetin;

    }
}
