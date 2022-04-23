import java.util.Scanner;

public class Sinif_Gecme_Durumu {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int mat, fizik, turk, kimya, muzik;

        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Turkce Notunu Giriniz: ");
        turk = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Muzik Notunu Giriniz: ");
        muzik = inp.nextInt();


        double average = (mat + fizik + kimya + turk + muzik) / 5.0;

        if (mat>100 || mat<0) {
            System.out.println("Girdiginiz degerler ortalamaya alinamaz!!!"); }
        else if (fizik > 100 || fizik < 0) {
            System.out.println("Girdiginiz degerler ortalamaya alinamaz!!!"); }
       else  if (turk > 100 || turk < 0) {
            System.out.println("Girdiginiz degerler ortalamaya alinamaz!!!"); }
       else if (kimya > 100 || kimya < 0) {
            System.out.println("Girdiginiz degerler ortalamaya alinamaz!!!"); }
        else if (muzik > 100 || muzik < 0) {
            System.out.println("Girdiginiz degerler ortalamaya alinamaz!!!");

                    }

        else if (average <=55) {
            System.out.println("Not Ortalamaniz: " + average);
            System.out.print("Sinifta kaldiniz");

        }
        else {
            System.out.println("Not Ortalamaniz: " + average);
            System.out.println("Sinifi gectiniz. Tebrikler!");
        }













    }
}
