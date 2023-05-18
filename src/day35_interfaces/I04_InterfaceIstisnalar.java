package day35_interfaces;

public interface I04_InterfaceIstisnalar {

    void toplama();

    static void aciklama(){
        System.out.println("Bu method'u implement etmek mecburi değildir");
    }

    default void ekIsler(){
        System.out.println("Default keyword ile body'si olan method oluşturulabilir");
    }

}
