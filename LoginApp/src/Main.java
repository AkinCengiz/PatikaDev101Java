import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();
        System.out.print("Kullanıcı şifreniz :");
        password = input.nextLine();
        if(userName.equals("akincengiz")&& password.equals("BJK1903"))
        {
            System.out.println("Sisteme giriş başarılı...\nHoşgeldiniz :"+userName);

        }
        else if(userName.equals("akincengiz") && !password.equals("BJK1903"))
        {
            System.out.print("Şifrenizi yenilemek ister misiniz(EVET/HAYIR) : ");
            String secim = input.nextLine().toLowerCase();
            if(secim.equals("evet"))
            {
                System.out.print("Yeni parolanızı giriniz...");
                password = input.nextLine();
                while (password.equals("BJK1903")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    password = input.nextLine();
                }
                System.out.print("Şifre başarıyla oluşturuldu.");
            }
        }
        else
        {
            System.out.println("Bilgilerinizi yanlış girdiniz...");
        }
    }
}