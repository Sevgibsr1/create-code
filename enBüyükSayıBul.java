public class enBüyükSayıBul {
    public static void main(String[] args) {
        int sayı1= 20;
        int sayı2= 25;
        int sayı3= 5;
        int enBüyük= sayı1;

        if (enBüyük<sayı2)
            enBüyük= sayı2;
        else if (enBüyük<sayı3)
            enBüyük= sayı3;

            System.out.println("En büyük sayı : " +enBüyük);
    }
}
