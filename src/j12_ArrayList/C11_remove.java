package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("remove oncesi ulkeList = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("ulkeList.remove(1) = " + ulkeList.remove(1));//Isvec
        System.out.println("remove sonrasi ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya]
        //System.out.println("ulkeList.remove(33) = " + ulkeList.remove(33));//RTE->IndexOutOfBoundsException
        //trick bilgi->remove(index)silinen elemani return eder->kelle dondurur
                     //remove(eleman)->silinen elemanin varligina gore true/false return eder
        System.out.println("ulkeList.remove(\"Isvec\") = " + ulkeList.remove("Isvec"));//false
        List<String > sehirList=new ArrayList<>(Arrays.asList("Ankara","Karaman","Van","Gelibolu","Izmir"));
        ulkeList.addAll(sehirList);
        System.out.println("addAll sonrasi ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya, Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("sehirList = " + sehirList);//[Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("ulkeList.removeAll(sehirList) = " + ulkeList.removeAll(sehirList));//true
        System.out.println("removeAll sonrasi ulkeList = " + ulkeList);//[Alamanya, Danimarka, Belcika, Hollanda, Finlandiya]
        sehirList.add("Alamanya");
        System.out.println("sehirList = " + sehirList);
        System.out.println("sehirList.removeAll(ulkeList) = " + sehirList.removeAll(ulkeList));//true->ulkeListin tek elemani sehirListin icinde old icin ve remove ile o elmani sildiginden bize true dondu
        System.out.println("removeAll oncesi sehirList = " + sehirList);//[Ankara, Karaman, Van, Gelibolu, Izmir]
        System.out.println("sehirList.removeAll(sehirList) = " + sehirList.removeAll(sehirList));//true
        System.out.println("removeAll sonrasi sehirList = " + sehirList);//[]

        List<Integer> sayiList=new ArrayList<>(Arrays.asList(12,14,21,43,2,65,4,7,67));
        System.out.println("sayiList.remove(2) = " + sayiList.remove(2));//21
        System.out.println("sayiList.remove(43) = " + sayiList.remove(43));//RTE->43.index listte yok->.IndexOutOfBoundsException
        //sayiList.remove(43) Integer type listte remove girilen parametre list elemani olarak degil index olarak algilanir


    }
}
