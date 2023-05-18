package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_localTime {

    public static void main(String[] args){

        LocalTime saat1= LocalTime.of(20,15); // kullanmak için oluşturduğumuz saat methodu
        System.out.println(saat1); // 20:15

        LocalTime saat= LocalTime.now(); // şu anki zamanı veren method
        System.out.println(saat); // 08:22:14.326954700

        // LocalTime objesi olan saat varable'si canlı bir saat değildir
        // oluşturulduğu andaki LocalTime'ı sistemden alıp kaydettiğimiz sabit bir degerdir

        // kodun ilerleyen kısmında ne kadar süre geçtiğini görmek için
        // saati yeniden almamız gerekirse, yeni bir LocalTime objesi daha oluşturmalıyız

        System.out.println(saat.getNano()); // 213170800 // nano saniyeyi veren method
        System.out.println(saat.getHour()); // 8 // saati veren method
        System.out.println(saat.getMinute()); // 26 // dakikayı veren method
        System.out.println(saat.getSecond()); // 57 // saniyeyi veren method

        // .get() method'ları LocalTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10)); //10:40:24.085749200

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); // 08:21:08.599145500

        // .plus() methodu ile LocalTime objemize istediğimiz saati, dakikayı, saniyeyi ekleyebiliriz (+)
        // .minus() öethodu ile LocalTime objemizden istediğimiz saati, dakikayı, saniyeyi çıkarabiliriz (-)

        System.out.println(saat.withSecond(0).withNano(0)); // 08:34
        System.out.println(saat.withSecond(10).withNano(20)); // 08:36:10.000000020

        // .with() methodu ile LocalTime objemizde istediğimiz saate, dakikaya, saniyeye istediğimiz degeri atayabiliriz

        System.out.println(saat.compareTo(saat1)); // -1 // karşılaştırma methodu // karşılaştırılan zamanlar aynı ise 0 döner

        System.out.println(saat.isAfter(saat1)); // false // saat objesi saat1 objesinden sonra mı? boolean döner
        System.out.println(saat.isBefore(saat1)); // true // saat objesi saat1 objesinden önce mı? boolean döner

        System.out.println(saat.toSecondOfDay()); // şu anda günün 31799. saniyesiymiş


    }
}
