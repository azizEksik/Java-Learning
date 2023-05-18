package day37_Exception;
import java.util.Scanner;
public class C02_ThrowKeyword {
    public static void main(String[] args) {

        // Kullanicidan yasını isteyin
        // eger 0 veya negatif bir sayı girerese
        // uyarı olarak IllegalArgumentException uyarısı verin
        // Anca kodumuz normal çalışmaya devam etsin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<=0){

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("yas  0 veya negatif olamaz");
            }
        }
    }
}
