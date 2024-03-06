package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        List<String> isimList=new ArrayList<>(Arrays.asList("Saim","Savfet","Halit","Semra","Seher","Enes"));

        List<String> yeniList=new ArrayList<>(Collections.nCopies(7,"JavaCAN"));
        System.out.println("yeniList = " + yeniList);

        //addAll(list)->parametre olarak girlen listi istenen liste ekler
        System.out.println("ulkeList ilk hali = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]
        System.out.println("isimList ilk hali = " + isimList);//[Saim, Savfet, Halit, Semra, Seher, Enes]
        ulkeList.addAll(isimList);
        System.out.println("ulkeList'e isimList eklenmis hali = " + ulkeList);//[Alamanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya, Saim, Savfet, Halit, Semra, Seher, Enes]

        isimList.addAll(3,yeniList);
        System.out.println("isimList = " + isimList);//[Saim, Savfet, Halit, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, Semra, Seher, Enes]
    }
}
