import java.util.Scanner;

public class test {
}
public static void main(String[] args) {
    String userName, password, answer, newPassword;

    Scanner input = new Scanner(System.in);
    System.out.print("Lutfen Kullanici Adinizi Giriniz :");
    userName = input.nextLine();

    System.out.print("Lutfen Sifrenizi Giriniz :");
    password = input.nextLine();

    if (userName.equals("patika") && password.equals("java123")) {
        System.out.println("Giris Yaptiniz !");
    } else {
        System.out.println("Girmis Oldugunuz Bilgiler Yanlis! Sifrenizi Sifirlamak Ister Misiniz?(evet-hayir)");
        answer = input.nextLine();

        if (answer.equals("evet")) {
            System.out.print("Lutfen Yeni Sifrenizi Giriniz :");
            newPassword = input.nextLine();

            if (newPassword.equals("java123")) {
                System.out.print("Sifreniz Bir Onceki Sifre Ile Ayni OIamaz! Lutfen Baska Bir Sifre Giriniz! :");
                newPassword = input.nextLine();

            } else {
                System.out.print("Yeni Sifreniz Basariyla Olusturuldu. :");

            }
        }
    }
}


