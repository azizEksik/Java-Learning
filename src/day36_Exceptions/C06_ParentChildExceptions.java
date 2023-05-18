package day36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/day36_Exceptions/text.txt";

        try{
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k=0;
            while ((k= fis.read()) !=(-1)){
                System.out.print((char)k);
            }
        }catch (FileNotFoundException e){
            System.out.println("Dosya yolunda hata var");
        }catch (IOException e){

        }
        /*
            Eger kodumuzda birden fazla exception ihtimali varsa
            ve bu exception'lar arasında parent child ilişkisi varsa

            1- Ya sadece parant'ı yazarız
               cunku parent exception child exception'ları da kapsar

            2- Veya ikisini de yazmak istiyorsak
               önce child exception'ı
               sonra parent exception'ı yazmalıyız

               }catch(FileNotFoundException e){ ===> child exception

               }catch(IOException){ ===> parent exception
               }
         */
    }
}
