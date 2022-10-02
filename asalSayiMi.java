public class asalSayiMi {
    public static void main(String[] args) {

        int number=2;
        int reminder = number  % 2;
        boolean isPrime = true;

        if (number == 1){
            System.out.println("gecersiz sayi girdiniz");
            return;
        }
        if (number<1){
            System.out.println("gecersiz sayi girdiniz");
            return;
        }

        for (int i = 2; i <number ; i++) {
            if (number % i ==0){
                isPrime = false;
            }

        }

        if (isPrime){
            System.out.println("Sayi asaldir");
        }
        else{
            System.out.println("Sayi asal degildir");
        }


    }
}
