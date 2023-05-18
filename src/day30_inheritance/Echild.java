package day30_inheritance;

public class Echild extends DParentAccessModifier{

    static int sayiChildStatic;

    public static void main(String[] args) {

        // inheritance'da private class üyeleri inherit edilemez

        Echild eChild= new Echild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

        // icinde bulunduğumuz class'daki static variable'lar
        // obje üzerinden otomatik gelmez
        // ama manuel yazdığımızda java kabullenir

        System.out.println(eChild.sayiChildStatic);

    }

}
