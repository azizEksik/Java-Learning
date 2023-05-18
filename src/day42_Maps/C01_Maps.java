package day42_Maps;

import day23_constructor.Araba;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        // verilen bir cümlede kullanılan her bir harfi
        // ve o harfin kullannım miktarını
        // A=5 , B=3 , .... gibi veren yazdırın

        String str = "Javayi balonu patlatmadan bitirelim";

        String[] arr1= str.split(""); // [J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        List<String> list1= new ArrayList<>(); // [J, a, v, a, y, i, b, a, l, o, n, u, p, a, t, l, a, t, m, a, d, a, n, b, i, t, i, r, e, l, i, m]

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(" ")){
                list1.add(arr1[i]);
            }
        }

        Set<String> st1= new HashSet<>(); // [a, b, d, e, i, J, l, m, n, o, p, r, t, u, v, y]

        for (int i = 0; i < list1.size(); i++) {
            st1.add(list1.get(i));
        }

        Iterator<String> a= st1.iterator();

        List<String> list2= new ArrayList<>(); //  [a, b, d, e, i, J, l, m, n, o, p, r, t, u, v, y]

        while (a.hasNext()){

            list2.add(a.next());
        }

        String[] arr2= new String[list1.size()]; // [a, a, a, a, a, a, a, b, b, d, e, i, i, i, i, J, l, l, l, m, m, n, n, o, p, r, t, t, t, u, v, y]

        int index=0;

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i).equals(list1.get(j))){
                    arr2[index]=list1.get(j);
                    index++;
                }
            }
        }

        List<String> list3= new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {

            int index1=0;
            String value="";

            for (int j = 0; j < arr2.length; j++) {
                if (list2.get(i).equals(arr2[j])){
                    value=list2.get(i);
                    index1++;
                }
            }
            list3.add(value+"="+index1);
            value="";
            index1=0;
        }

        String strUpdate="";

        for (int i = 0; i < list3.size(); i++) {
            if (!list3.get(i).equals(list3.get(list3.size()-1))){
                strUpdate+=list3.get(i) + " ,";
            }else {
                strUpdate+=list3.get(i);
            }
        }

        System.out.println(strUpdate); // a=7 ,b=2 ,d=1 ,e=1 ,i=4 ,J=1 ,l=3 ,m=2 ,n=2 ,o=1 ,p=1 ,r=1 ,t=3 ,u=1 ,v=1 ,y=1
    }
}
