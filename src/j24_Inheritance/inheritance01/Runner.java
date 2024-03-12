package j24_Inheritance.inheritance01;

public class Runner {
    /*
    1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
    2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
    3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
    4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
    5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
    6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
    7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
    denir.
    8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
    9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvanlar h1 = new Hayvanlar();
        h1.hareket();
        h1.beslenme();
        h1.icme();

        Balık b1 = new Balık();
        b1.ızgaraTava();
        b1.hareket();
        b1.beslenme();
        b1.icme();

        Memeliler m1=new Memeliler();
        m1.hareket();
        m1.beslenme();
        m1.icme();
        m1.sutBeslen();
        m1.doğum();

        Koyun k1 = new Koyun();
        k1.hareket();
        k1.beslenme();
        k1.icme();
        k1.sutBeslen();
        k1.doğum();
        k1.meler();

        Kedi p1 = new Kedi();
        p1.hareket();
        p1.tırmalama();
        p1.beslenme();
        p1.doğum();
        p1.sutBeslen();
        p1.icme();

    }
}
