package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_Contains {
    public static void main(String[] args) {
        //contains()-> list'te istenen elamanın varlığını control eder true/false return eder
        ArrayList<String> ulkeList=new ArrayList<>(List.of("Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"));
        System.out.println("ulkeList.contains(\"Hollanda\") = " + ulkeList.contains("Hollanda"));//true
        System.out.println("ulkeList.contains(\"finlandiya\") = " + ulkeList.contains("finlandiya"));//false->kucuk harf ile yazdigimiz icin
    }
}
