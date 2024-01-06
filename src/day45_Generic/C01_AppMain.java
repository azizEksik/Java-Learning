package day45_Generic;

public class C01_AppMain {
    public static void main(String[] args) {

        OrnekListOlusturma<Integer> myOrnekListOlusturma = new OrnekListOlusturma(); // kendi listemizi oluşturduk

        myOrnekListOlusturma.listeyeElemanEkle(12); // kendi lisstemize eleman ekledik
        myOrnekListOlusturma.listeyeElemanEkle(2);
        myOrnekListOlusturma.listeyeElemanEkle(3);
        myOrnekListOlusturma.listeyeElemanEkle(5);
        myOrnekListOlusturma.listeyeElemanEkle(1);

        System.out.println(myOrnekListOlusturma);

        System.out.println(myOrnekListOlusturma.dogalDuzeneGoreSirala(myOrnekListOlusturma)); // kendi listemizin dogal düzen methodunu yaptık

        System.out.println(myOrnekListOlusturma.elemanGetir(3)); // 5

        OrnekGenericMethodOlusturma ornekGenericMethodOlusturma = new OrnekGenericMethodOlusturma();

        ornekGenericMethodOlusturma.bilgiYaz(12,"aziz"); // generic method
        ornekGenericMethodOlusturma.bilgiYaz("12","aziz");
        ornekGenericMethodOlusturma.bilgiYaz(true,22L);
        ornekGenericMethodOlusturma.bilgiYaz(false,"aziz");
        ornekGenericMethodOlusturma.bilgiYaz(0.12D,true);



    }
}
