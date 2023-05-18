package day36_Exceptions;

public class C01_TryCatch {

    public static void main(String[] args) {

        /*
            Kodlarımızı yazarken
            sorun oluşma ihtimali gördüğümüzde
            sorun çıkma potansiyeli olan kodları
            try - catch (finally) blok(ları) ile çevreleriz
         */

        int sayi1=20;
        int sayi2=0;

        // System.out.println(sayi1/sayi2); // ArithmeticException

        try{

            System.out.println(sayi1/sayi2);

        }catch (ArithmeticException e){

            // e.printStackTrace(); // exception'da gördüğümüz tüm hata açıklamalrını yazdıran method
            // System.out.println("Bölen sayi 0 olamaz");
            // System.out.println(e.getMessage()); // / by zero

        }

        /*
        Bir try - catch blogu 3 bölümden oluşur

        1-  try blogu : 19-23(hariç) satırları arası
            exception oluşturma potansiyeli olan kodları yazıyoruz

        2-  catch (Exception e)
            catch statement :
            ArithmeticException : oluşma ihtimali olan exception
            e : kodun karşılaştığı exception'ı kaydedeceğimiz obje

        3-  catch blogu : 23(hariç)-29 satırları arası
            ongorulen exception gerçekleştiğinde
            çalışmasını istediğimiz kodlar

         */
    }
}
