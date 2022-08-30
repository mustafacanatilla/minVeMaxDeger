import java.util.Scanner;

public class minVeMaxDeger {
    public static void main(String[] args) {
        int number, count, min = 1, max = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz:");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + " . Sayıyı Giriniz:");
            number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En Büyük Değer:" + max);
        System.out.print("En Küçük Değer:" + min);
    }
}
