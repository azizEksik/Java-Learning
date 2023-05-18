package day11_stringManipulation_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir değer değildir
        // null bir pointer'dır
        // yanına yazıldığı non-primitive variable'a deger atanmadıgını işaret eder


        String str; // str oluşturuldu ama deger atanmadı

        // Java method içerisinde deger atamadan variable oluşturulmasına izin verir
        // ama deger atamadan kullanılmasına izin vermez

        // System.out.println(str); CTE

        // System.out.println(str.contains("Java")); CTE

        // Bazen programlarda variable'lar oluşturulul
        // ama daha sonra deger atanacagı için deger ataması yapılmaz
        // deger ataması bile yapılmayan listeleme CTE verdiği için
        // deger verilmediğini işaretleyecek, ama CTE oluşmasını engelleyecek
        // bir çözüm olarak null pointer oluşturulmuştur

        str=null; // null olarak işaretlenmiş ama degeri null atanmış değil

        System.out.println(str); // null // null yazdırsa da null bir deger değildir

        // System.out.println(str.contains("Java")); // NullPointerException // run time erro veriyor

        // System.out.println(str.length()); // NullPointerException // Run Time Error

        System.out.println(str + "java"); // nulljava

        String str2= str + "Java";

        System.out.println(str2); // nulljava

        // int sayi=null; primitive variable'lara null degeri atanmaz

        Integer sayi= null;

        // Biz genelde String bir ifade oluşturup, sonra deger atayacaksak
        // hiclik degeri atarız

        String str3="";

        System.out.println(str3.concat("Java")); // Java




    }
}
