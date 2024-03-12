package j24_Inheritance.inheritance02;

public class Memeliler extends Hayvanlar{//grand-parent Hayvanlar class'tan extends edilen parent class
    int m=1;//initial int type variable
    int c=4;//initial int type variable

    public Memeliler() {//default p'siz const
        this('H');//bu class'taki pli const call edildi
        System.out.println("memeliler class p'siz const call edildi");
    }
    public Memeliler(char y) {//1 p'li const
        super(34);//parent class'taki p'li cost call edildi
        System.out.println("memeliler class 1 p'li const call edildi");
    }

    public void mC(){
        System.out.println("mC-> Memeliler class meth call edildi");
    }

    @Override//anotation->dipnot
    public void mM() {//parent'tan ezilen meth
        System.out.println("mM-> Memeliler class meth call edildi");
    }

}
