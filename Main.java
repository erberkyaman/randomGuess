import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Random rnd = new Random();
    int number = rnd.nextInt(100);

    Scanner input = new Scanner(System.in);
    int right=0;
    int selected;
    int[] wrong = new int[5];
    boolean isWin = false;
    boolean isWrong = false;

    System.out.println(number);
    while (right<5){
        System.out.print("Lütfen tahmininizi giriniz : ");
        selected= input.nextInt();
        if (selected==number){
            isWin=true;
            System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
            break;
        }
        if (selected <0 || selected>100){
            right++;
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            if (isWrong==false){
                isWrong=true;
                System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
            }else {
                System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hak : "+ (5-right));
            }
            continue;
        }else {
            wrong[right++]=selected;
            if (selected>number){
                System.out.println("Tahmininiz gizli sayıdan büyük! Lütfen tekrar deneyiniz. Kalan hak : "+(5-right));
            }
            if (selected<number){
                System.out.println("Tahmininiz gizli sayıdan küçük! Lütfen tekrar deneyiniz. Kalan hak : "+(5-right));
            }


        }

    }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz:");
                for (int i: wrong) {
                    System.out.println(i);
                }
            }
        }


    }


}
