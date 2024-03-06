package j99_codeChallange.Challange05;

public class Task01 {

    /*
        Task-> 100'den 0'a kadar 13'e tam bölünebilen sayıları (büyükten küçüğe) ve toplamını print eden code create edinz.
      output :
         91
         78
         65
         52
         39
         26
         13
         toplam =364
         */

    public static void main(String[] args) {
        int toplam = 0; //döngüde 13'e bölünme şartını sağlayan sayıların toplanacağı boş bir kutu tanımlandı.
        for(int i = 100 ; i>=0 ; i--) {// başlangıç değeri 100, bitiş değeri 0 olan 1'er azalan döngü tanımlandı.
            if (i % 13==0) {// döngüden gelen her sayının 13 e tam bölünme şartı tanımlandı
                toplam+=i;//döngüde 13'e bölünme şartını sağlayan sayılar kutuya eklendi.
            }
        }
        System.out.println("toplam = " + toplam);



    }
}
