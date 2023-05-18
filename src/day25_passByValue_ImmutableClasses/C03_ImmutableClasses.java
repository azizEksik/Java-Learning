package day25_passByValue_ImmutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {

        /*
            Java'da bir class ve o class'dan oluşturulan objeler
            ya mutable'dir ya da immutable'dır

            Java metinsel ifadeleri atayabileceğimiz 3 class oluşturmuştur
            bunlar;
            String  -------- immutable
            StringBuilder ------ mutable
            StringBuffer ------- mutable

            immutable bir Class'dan oluşturulan objeler de immutable'dır
            String immutable olduğundan
            aynı str objesine yeni değer atandığında java eski değeri DEGİSTİREMEZ
            bunun yerine istenen yeni degere sahip yeni bir obje oluşturur
            ve str'ın pointer'ını yeni objeye yöneltir.

            kullanılmayan eski objeler
            Garbage Collector tarafından toplanmak üzere beklerler
         */

        String str= "Java candir";

        str= str.toLowerCase();

        System.out.println(str); // java candir

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDİR

        // Asagidaki kod calistiginda
        // java kaç obje oluşturur

        String s = "Hava";

        for(int i = 0; i <100; i++){

            s=s + ".";
        }

        System.out.println(s);

    }
}
