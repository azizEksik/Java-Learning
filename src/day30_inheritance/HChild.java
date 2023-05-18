package day30_inheritance;

public class HChild extends GParent{

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor'i calisti");
    }

    public static void main(String[] args) {

        HChild objChild= new HChild();

        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayGrandParent);

        /*
            Child classtan oluşturduğumuz bir obje
            parent ve grandparent class'larındaki tüm özelliklere sahip olur

            bir obje oluşturulduğunda ilk degerleri alabilmesi için MUTLAKA BİR CONSTRUCTO çalışmalıdır

            Constructor call bizim çok kullandığımız bir özellik degildir
            ancak inheritance'ı tam anlayabilmek için
            constructor call konusunu bilmemiz lazım

            Bu classtan obje oluşturmak için
            HChild() constructor'ını kullandık
            AMA objemiz parent grandparent'daki özellikleri de sahiplendi

            Peki bu nasıl oldu?

            Her ne kadar objeyi Child classtan oluştursak da
            bu objenin parent ve grandparent class'larındaki özellikleri alabilmesi için
            o class'ların constructor'ı da çalışmak ZORUNDADIR

            Java bu mecburi çalışmayı sağlayabilmek için
            çok özel bir sistem geliştirmiştir.

            bunun adı super() : super constructor call'dur
         */
    }
}
