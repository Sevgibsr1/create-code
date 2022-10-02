public class döngüİleİşlemler {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
        }
        System.out.println("for ile dongu bitti");

        for (int i = 1; i <10 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("for ile dongu bitti");

        int i=1;

        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("while ile dongu bitti");

        int j=2;
        do {
            System.out.println(j);
            j+=2;
        }
        while (j<10);
        System.out.println("do while dongusu bitti");
    }
}
