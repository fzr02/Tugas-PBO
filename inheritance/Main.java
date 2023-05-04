public class Main {
    public static void main(String[] args) {
        Apel a1 = new Apel(12000, "Manis");
        System.out.println("Harga Apel: " + a1.getharga());
        System.out.println("Rasanya " + a1.getrasa());
        a1.hijau();
        System.out.println();

        Jeruk j1 = new Jeruk(10000, "asem");
        System.out.println("Harga Jeruk: " + j1.getharga());
        System.out.println("Rasanya " + j1.getrasa());
        j1.bali();
        System.out.println();

        Alpukat b1 = new Alpukat(15000, "pahit");
        System.out.println("Harga Alpukat: " + b1.getharga());
        System.out.println("Rasanya " + b1.getrasa());
        b1.madu();
        System.out.println();
    }
}