package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan eleman için -1 return eder.
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("ulkeList.indexOf(\"alamanya\") = " + ulkeList.indexOf("alamanya"));//-1 verir->java case sensitive calisir buyuk kucuk harf duyarliligi vardir
        System.out.println("ulkeList.indexOf(\"Belcika\") = " + ulkeList.indexOf("Belcika"));//3
        System.out.println("ulkeList.indexOf(\"Turkiye\") = " + ulkeList.indexOf("Turkiye"));//-1->olmayan eleman icin -1 deger doner

        ulkeList.add("Ukrayna");
        ulkeList.add("Isvec");
        System.out.println("ulkeList.indexOf(\"Isvec\") = " + ulkeList.indexOf("Isvec"));//1
        System.out.println("ulkeList.lastIndexOf(\"Isvec\") = " + ulkeList.lastIndexOf("Isvec"));//7
    }
}
