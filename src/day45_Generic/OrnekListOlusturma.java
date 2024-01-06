package day45_Generic;

import java.util.*;

public class OrnekListOlusturma <T> {

    // bu class bizim olusturdugumuz kendi listemiz

    // yukarıda class ismine <T> ekledik. bu template demek. yani bir şablon oluşturduk

    private ArrayList<T> myList = new ArrayList<>(); // private bir arraylist oluşturduk. sınırlarımızı calss isminde
    // kullandığımız <T> ye çektik. Yani bu calss'tan oluşturulan nesneden <T> ' nin içine ne yazılırsa
    // buraya gelip arraylist'in <T> ' sınız yerine yazılacak
    // T'miz tip tir

    public void listeyeElemanEkle(T eklenecekEleman){
        myList.add(eklenecekEleman); // elemna eklee methodumuzu olusturduk
    }

    public int listeninUzunlugu(){ // lsitenin uzunlugunu getiren methodu olusturduk
        int uzunluk =0;

        for (int i = 0; i < myList.size(); i++) {
            uzunluk++;
        }
        return  uzunluk;
    }

    public T elemanGetir(int index){
       return myList.get(index);
    }

    public OrnekListOlusturma<T> dogalDuzeneGoreSirala(OrnekListOlusturma<T> myList){ // dogal düzene göre sıralayan methodu olusturduk

        TreeSet<T> siraliSet = new TreeSet<>();

        for (int i = 0; i < myList.listeninUzunlugu(); i++) {
            siraliSet.add(myList.elemanGetir(i));
        }

        List<T> siraliList = new ArrayList<>();

        Iterator<T> iterator = siraliSet.iterator();

        while (iterator.hasNext()){
            siraliList.add(iterator.next());
        }

        OrnekListOlusturma<T> dogalDuzenList = new OrnekListOlusturma<>();


        for (int i = 0; i <siraliList.size() ; i++) {
            for (int j = 0; j < myList.listeninUzunlugu(); j++) {
                if (siraliList.get(i) == myList.elemanGetir(j)){
                    dogalDuzenList.listeyeElemanEkle(myList.elemanGetir(j));
                }
            }
        }

        return dogalDuzenList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListManager{");
        sb.append("myList=").append(myList);
        sb.append('}');
        return sb.toString();
    }
}
