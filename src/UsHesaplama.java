import java.util.Scanner;

public class UsHesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = sc.nextInt();
        sc.close();
        System.out.println("Sonuç: " + usHesapla(taban, us));
    }

    public static int usHesapla(int taban, int us) {
        if (us == 0) {  // üs sıfır ise sonuç 1'dir.
            return 1;
        } else if (us % 2 == 0) {  // üs çift ise
            int temp = usHesapla(taban, us / 2);
            return temp * temp;
        } else {  // üs tek ise
            int temp = usHesapla(taban, us / 2);
            return taban * temp * temp;
        }
    }
}
