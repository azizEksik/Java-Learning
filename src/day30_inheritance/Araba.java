package day30_inheritance;

public class Araba {

    // Marka gözekmetsizin tüm arabaların sahip olacagi ozellikleri
    // bu class'a koyarız

    String marka="Tum arabalarin markasi olur";
    String model="Tum arabalarin modeli olur";
    String vites="Tum arabalarin vitesi olur";
    String yakit="Tum arabalar yakitla calisir";

    public void uretimYeri(){
        System.out.println("Tum arabalar fabrikada uretilir");
    }

    public void motorMethodu(){
        System.out.println("Tum arabalarin motoru olur");
    }

}
