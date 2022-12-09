import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password;
        int select, price;
        int right = 3;
        int balance = 1903;

        Scanner input = new Scanner(System.in);
        while (right>0)
        {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz : ");
            password = input.nextLine();
            if(userName.equals("akincengiz") && password.equals("BJK1903"))
            {
                System.out.println("Başarılı bir şekilde giriş yapıldı...\nBankamıza Hoşgeldiniz...\n");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işleme göre karşısındaki numarayı giriniz :\n================================\nPara Yatırmak İçin     : 1\nPara Çekmek İçin       : 2\nBakiye Sorgulamak İçin : 3\nÇıkış Yapmak İçin      : 4\n================================");
                    select=input.nextInt();
                    if(select == 1)
                    {
                        System.out.print("Yatırılacak para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                        System.out.print("\n Hesabınıza " + price + " TL para yatırdınız. Yeni bakiyeniz : "+ balance + " TL'dir.\n");
                    }else if(select == 2)
                    {
                        boolean isBalance;
                        do{
                            isBalance = true;
                            System.out.print("Çekilecek para miktarı : ");
                            price = input.nextInt();
                            if(price>balance)
                            {
                                isBalance = false;
                                System.out.print("Bakiyeniz istediğiniz tutarı karşılamamaktadır. Lütfen tutarı yeniden giriniz.\n");
                            }
                        }while (isBalance == false);


                        balance -= price;
                        System.out.print("\n Hesabınızdan " + price + " TL para çektiniz. Yeni bakiyeniz : "+ balance + " TL'dir.\n");
                    }
                    else if(select == 3)
                    {
                        System.out.print("\n Hesabınızın bakiyesi : "+ balance + " TL'dir...\n");
                    }
                    else if(select == 4)
                    {
                        System.out.print("\nİyi günler diler, yine bekleriz...");
                    }
                    else
                    {
                        System.out.print("\n Hatalı bir tuşa bastınız. Tekrar deneyiniz...");
                    }
                }while(select != 4);
                break;
            }
            else
            {
                --right;
                System.out.println("Kullanıcı adınız veya parolanız hatalıdır. Tekrar deneyiniz...");
                if(right==0)
                {
                    System.out.println("Hesabınız boke olmuştur...");
                    System.out.println("Yeniden görüşmek dileğiyle...\nİyi günler dileriz...");
                }
                else
                {
                    System.out.println("Kalan hakkınız : "+ right);
                }

            }
        }

    }
}