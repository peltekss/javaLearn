package j26_Abstract;

public abstract class Lastik extends Honda {//abs Honda class'tan extend child abs class

    // abs Class'larda parent - child ise meth. implement zorunluluğu yoktur.
    public abstract void lastikEbat();//abs meth->imlement zorunlu
    public void kisLastik(){
        System.out.println("Ekim ayindan sonra takmak zorunlu");
    }
}
