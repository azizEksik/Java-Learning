package day28_accessModifier_encapsulation;

import java.util.Scanner;

public class C03_EncapsuleDatalar {

    private static String isim= "Yildir pazarlama";

    private int satisTutari;

    public int toplamSatis;

    public static String getIsim(){
        return isim;
    }

    public void setSatisTutari(int satisTutari){
        this.satisTutari=satisTutari;
        toplamSatis+=satisTutari;
    }


}
