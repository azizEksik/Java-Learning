package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere sayılar alın
        // toplam 500 olursa veya 500'ü geçerse
        // kaç sayı girdiğini ve sayıların toplamını yazdırın

        Scanner scan=new Scanner(System.in);


        int girilensayi=0;
        int toplam=0;
        int girelensayiadedi=0;

        while (toplam<500){ // toplam 500'den küçük olduğu sürece bu işlemi  yap
            System.out.println("Toplanmak üzere bir tamsayı giriniz");

            girilensayi=scan.nextInt();
            toplam+=girilensayi;
            girelensayiadedi++;

        }
        System.out.println("Girilen sayı adedi : " + girelensayiadedi + " "+ "Sayıların toplamı : " + toplam);






    }
}
