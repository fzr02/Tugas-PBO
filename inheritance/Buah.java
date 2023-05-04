
public class Buah {
    private int harga;
    private String rasa;

    public Buah (int harga, String rasa) {
        this.harga = harga;
        this.rasa = rasa;
    }

    public int getharga() {
        return harga;
    }

    public String getrasa() {
        return rasa;
    }

    public void segar () {
        System.out.println("Buah Segar");
    }
}