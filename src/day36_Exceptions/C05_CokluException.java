package day36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

        String str= "Java her gecen gun guzellesiyor";
        int[] arr={3,4,6,3,6,7,4,2,5,7};

        // Kullanicidan 0 veya pozitif bir tamsayı isteyin
        // girilen degeri index olarak kullanıp
        // str ve arr'nin o index'indeki elemanları yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("0 veya pazitif bir tamsayi giriniz");


        /*
            birbirinden bagımsız
            3 farklı türde exception riski var
            bunları farklı şekillerde handle edebiliriz

            1-  her birini ayrı ayrı try - catch yaparız
            2-  tek bir try, birden fazla catch yapabliriz
            3-  tek bir try - catch yapıp tüm exceptionları yakalayacak bir excception türü yazılabilir
         */

        // 3. yol

        try {
            int index1= scan.nextInt();
            System.out.println("str'in girilen index'teki degeri : " + str.charAt(index1));
            System.out.println("arr'nin girilen indexteki degeri : " + arr[index1]);
        }catch (RuntimeException e){
            //System.out.println("giris hatali olabilir, index String veya Array'in dısında olabilir");
            e.printStackTrace();

            // biz mesaj yazacaksak, genel bir mesaj yazabiliriz
            // veya javanın hata kodlarını yazdırabilirz
        }


        // 2. yol

        try {
            int index= scan.nextInt();
            System.out.println("str'in girilen index'teki degeri : " + str.charAt(index));
            System.out.println("arr'nin girilen indexteki degeri : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("str için girilen index hatalı");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr için girilen index hatalı");
        }catch (InputMismatchException e){
            System.out.println("0 veya pozitif tamsayi giriniz");
        }
    }
}
