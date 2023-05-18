package day14_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {

        // Verilen 1'den büyük bir tamsayı için
        //sayı asal ise true
        // sayı asal değilse ise false dönen bir method oluşturun

        System.out.println(isAsal(3));
        C01_AsalSayiYazdir.asalsayi(37);
    }

    public static boolean isAsal(int sayi){


        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi % i ==0){
                flag++;
                break;
            }

        }

        if (sayi==2){
           return true;

        }else if (flag==0){
            return true;
        }else {
            return false;
        }

    }
}
