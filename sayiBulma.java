public class sayiBulma {
    public static void main(String[] args) {
        int [] sayilar = new int []{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak){
                System.out.println("sayi vardir");
            }
            // varMi=true;
            //    break;
            else{
                System.out.println("sayi mevcut degildir");
            }

    }
}}
