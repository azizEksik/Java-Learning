package day26_localTime_varargs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4); // [3, 4]
        topla(3,4,5); // [3, 4, 5]
        topla(3,4,5,6); // [3, 4, 5, 6]
        topla(1,2,3,4,5,6); // [1, 2, 3, 4, 5, 6]
        topla(1,2,3,5,6,8,9); // [1, 2, 3, 5, 6, 8, 9]

    }
    public static void topla(int... a ){

        System.out.println(Arrays.toString(a));

        int toplam=0;
        for(int i = 0 ; i<a.length ; i++){
            toplam+=a[i];
        }
        System.out.println("Toplam :" + toplam);
    }
    /*
        Java'da bir method parametrelerine uygun argümente sahip
        method call olduğunda çalışır

        Ornegin 2 int parametre varsa
        sadece 2 int argüment ile method call yapıldığında çalışır

        Java aynı data türüne sahip olmak şartıyla
        parametre sayısını esnek tutabilmek için Varargs oluşturmuştur

        Varargs bir ARRAY'dir

        Dolayısıyla method'da array elemntlerini
        istediğimiz işleme uygun olarak kullanabiliriz
     */
}
