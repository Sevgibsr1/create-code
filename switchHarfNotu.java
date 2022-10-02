public class switchHarfNotu {
    public static void main(String[] args) {
        char seviye= 'A';

        switch(seviye){
            case 'A':
                System.out.println("Mukemmel gectiniz");
                break;
            case 'B':
                System.out.println("cok guzel gectiniz");
                break;
            case 'C':
                System.out.println("iyi gectiniz");
                break;
            case 'D':
                System.out.println("fena degil gectiniz");
                break;
            case 'F':
                System.out.println("maalesef kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
