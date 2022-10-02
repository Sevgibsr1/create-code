public class mukemmelSayi {
    public static void main(String[] args) {
        // 6 --> 1,2,3 topla 6 ya esit

        int sayi = 1;
        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi % i == 0){
                System.out.println(i);
                toplam+= i;
            }
        }
        if (sayi == toplam)
            System.out.println(toplam +" mukemmel sayidir");
        else
            System.out.println(toplam +" mukemmel sayi degildir");


    }
}
