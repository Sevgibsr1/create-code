public class parametreliMetodlar {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
    }

    public static void ekle(){
        System.out.println("eklendi");
    }

    public static void sil(){
        System.out.println("silindi");
    }

    public static void guncelle(){
        System.out.println("guncellendi");
    }

    public static int topla(int a, int b){
        return a+b;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
