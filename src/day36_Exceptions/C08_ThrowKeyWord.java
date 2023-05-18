package day36_Exceptions;

import java.util.Scanner;

public class C08_ThrowKeyWord {

    public static void main(String[] args) {

        /*
            Kodlari yazarken bazen muhtemel bir durumda
            Bazzi kodların ignore edilmesi istenebilir

            bu durumda kodları ignore etme yöntemi olarak,
            isteyerek exception fırlatıp
            sonra da çalışmasını istediğimiz yerde
            catch ile yakalayıp yolumuza devam edebiliriz

         */

        Scanner scan=  new Scanner(System.in);
        System.out.println("Yaş gir");
        int girilenYas= scan.nextInt();

        if (girilenYas<=0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
    }
}
