package day34_abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class FTatliSuBaliklari extends EBalik {

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void iskeletYapisi() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }

    public static void main(String[] args) {

        // AHayvan hayvan = new AHayvan();
        // EBalik balik= new EBalik();

        FTatliSuBaliklari sazan = new FTatliSuBaliklari();

        EBalik alabalik = new FTatliSuBaliklari();

        AHayvan yayin = new FTatliSuBaliklari();

        /*
            Abstract class'ların constructor'ları vardir
            ama obje oluşturulamaz

            Abstract Class'lar data türü seçilip
            concrete child class'ların constructor'ları kullanılarak
            Abstract parent class özelliklerinde objeler oluşturulabilir
         */

        
    }
}
