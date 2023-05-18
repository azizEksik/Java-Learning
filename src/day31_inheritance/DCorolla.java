package day31_inheritance;

public class DCorolla extends CToyota {

    String str3="Corolla";

    DCorolla(){

        System.out.println("Parametresiz Corolla constructo'i calisti");
    }

    DCorolla(int sayi){
        this();
        System.out.println("int Parametreli Corolla constructo'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1=new DCorolla(5);

    }
}

/*
    Biz görünür bir constructor oluşturdugumuzda
    Javanın default constructor'ı silmesine bezner olarak

    extends keyword kullanılmış bir class'daki
    herhangi bir constructor'ın ilk satırında
    gözle görünür bir constructor call yazılmışsa
    Java default olarak koyduğu super()'u siler

    Bir constructor'ın içininde
    sadece 1 tane constructor call olabilir
    o da ilk satırda olmak zorundadır

    Eger this(parametreler) veya super(parametreler) ile
    constructor call yaptıgımızda
    yazdıgımız argument ile uyumlu parametreye sahip
    bir constructor yoksa java CTE verir
 */
