package day36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exception kod yazılır yazılmaz daha run etmeden
            Java'nın riskli kodları tanımlayıp
            çalıştırmadan önce bana bir yol göstermelisin dediği
            exception türlerdir

            Checked Exception genelde dosya okuma ve yazma IO(input, output) işlemlerinde oluşur

            IO exception oluşma ihtimaline karşı
            kdu yazar yazmaz Java altını kırmızı çizer

            Checked exception kodun altını kırmızı çizdiğinden
            kodumuzun calisir hale gelmes için kırmızı çizgiyi kaldırmamız lazım

            1-  try - catch blogu kullanarak
                exception handle edilebilir
                ve Java'ya exception oluştuğunda ne yapmasını istediğimiz gösterilebilir

            2-  eger exception'ı handle etmek istemiyorsak
                sadece kodumuzun calismasini istiyorsak
                method deklerasyonuna bu exception ihtimalini yazarak
                kodu calisir hale getirebiliriz

                method signature'na throws keyword'u ile
                beklenen exception türünü yazarsak
                kod calisir duruma gelir
                ANCAK exception oluşursa Java'ya çözüm yolu sunulmadığından
                kodun çalışması durur
         */

        String dosyaYolu="src/day36_Exceptions/text.txt";

        FileInputStream fis= new FileInputStream(dosyaYolu);



    }
}
