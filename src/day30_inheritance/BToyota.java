package day30_inheritance;

public class BToyota extends Araba {

    String marka = "Toyota";
    String aku= "Inci aku";
    String lastik="Bridgestone";


    public void motor(){
        System.out.println("Toyotalr cevreci Toyota motorları kullanır ");
    }

    public void guvenlik(){
        System.out.println("Toyota raclar ekstra guvenlik onlemleri barindirir");
    }
}
