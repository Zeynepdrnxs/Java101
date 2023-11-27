import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //değişken tanımlayalım
        int mat, fizik, kimya, turkce, tarih, muzik;

        //scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri alalım
        System.out.print("Matematik notunuzu giriniz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik=inp.nextInt();

        //Ortalamayı buluyoruz
        int notOrtalama=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=notOrtalama/6.0;
        System.out.println("Not Ortalamanız: " +sonuc);
        String sonuc1 = sonuc>60 ? "Dersi Geçtiniz": "Dersten Kaldınız";
        System.out.println(sonuc1);

    }
}