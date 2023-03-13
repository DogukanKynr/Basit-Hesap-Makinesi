import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int islem;
        double a, b;

        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextDouble();

        System.out.println("İşlemler : ");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme" );
        System.out.print("Yapmak istediğiniz işlemi tuşlayınız : ");
        islem = input.nextInt();


        switch (islem){
            case 1:
                System.out.print("Sonuç : " + (a+b));
                break;
            case 2:
                System.out.print("Sonuç : " + (a-b));
                break;
            case 3:
                System.out.print("Sonuç : " + (a*b));
                break;
            case 4:
                System.out.print("Sonuç : " + (a/b));
                break;
            default:
                System.out.print("Yanlış bir sayı tuşladınız...");
                break;
        }
    }
}