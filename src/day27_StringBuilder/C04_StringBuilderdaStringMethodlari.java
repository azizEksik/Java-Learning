package day27_StringBuilder;

public class C04_StringBuilderdaStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder Class'ında olmayıp,
            String Class'ında olan method'ları kullanmka istersek
            sb.toString() kullanarak, StringBuilder'ı önce String'e cevirir
            sonra istediğimiz String method'larını kullanırız

            Bu konuda DİKKAT etmemiz gereken konu
            String döndüren method'lar
            veya String Class'ından kullanacağımız methodlar
            kalıcı değişiklik yapmaz

         */

        StringBuilder sb1= new StringBuilder("Java Candir");

        StringBuilder sb2= new StringBuilder("Java candir");

        sb1.substring(5);

        System.out.println(sb1); // Java Candir

        //sb1=sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);

        System.out.println(sb1); // Java Candir




    }
}
