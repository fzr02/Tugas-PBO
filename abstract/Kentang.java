public class Kentang extends Makanan{
    int harga;

    public Kentang (String rasa, int harga){
        super(rasa);
        this.harga = harga;
    }

    public String toString(){
        return "Kentang goreng rasa" + super.getRasa() + "Harganya: " + harga;
    }
}