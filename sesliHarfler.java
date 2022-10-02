public class sesliHarfler {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf){
            case 'A':
            case 'E':
            case 'O':
            case 'U':
                System.out.println("kalin sesli harflerdir");
                break;
            default:
                System.out.println("ince sesli harf girdiniz");

        }
    }
}
