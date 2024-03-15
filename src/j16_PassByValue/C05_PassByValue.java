package j16_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        2 .değişklik  yapılan variable'lar atama tanımlanır.
        */
        double etiketFiyatı=100;//Primitive Deneme scope initial(ilk değer atama yapıldı) variable
        double indirimOranı =0.1;//Primitive Deneme scope initial(ilk değer atama yapıldı) variable
        System.out.println("İndirim ncesi etiket fiyatı: "+etiketFiyatı);
        etiketFiyatı=indir(etiketFiyatı,indirimOranı);
        System.out.println("İndirim sonrası etiket fiyatı: " + etiketFiyatı);
    }

    private static double indir(double etiketFiyatı, double indirimOranı) {
        return etiketFiyatı*(1-indirimOranı);
    }
}
