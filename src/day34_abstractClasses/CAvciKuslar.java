package day34_abstractClasses;

public class CAvciKuslar extends BKuslar{


    public void hareket()
    {
        System.out.println("Ucarlar");
    }
    public void beslenme()
    {
        System.out.println("Et yerler");
    }
    public void pence()
    {
        System.out.println("Pencelidir");
    }
    public void gaga()
    {
        System.out.println("Sivri gagalı");
    }
    @Override
    public void omur()
    {
        System.out.println("Avcı kuşlar ortalama 10 yıl yaşar");
    }

    public static void main(String[] args) {

        CAvciKuslar kartal = new CAvciKuslar();
        CAvciKuslar sahin = new CAvciKuslar();

        // BKuslar kus= new BKuslar();

        AHayvan baykus= new CAvciKuslar();
        baykus.hareket();
        baykus.solunum();
        baykus.omur();
    }

}
