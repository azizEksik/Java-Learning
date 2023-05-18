package day29_inheritance;

public class C02_EncapsulationKullanim {

    public static void main(String[] args) {

        C01 obj= new C01();

        obj.isim="Melike"; // Write
        System.out.println(obj.isim); // Melike // Read

        obj.setSayi(40); // Write
        System.out.println(obj.getSayi()); // 40 // Read

        /*
            Bir Class üyesinin public olması ile
            private yapılıp, getter() ve setter() methodlarının oluşturulması
            işlevsel açıdan aynı sonucu oluşturur

            Bazi developer'lar setter(write) ve getter(read) yetkilerinin
            kullanıldığını vurgulamak için
            2. yöntemi tercih ederler.
         */
    }
}
