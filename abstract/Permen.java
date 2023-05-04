public class Permen extends Makanan{
    int harga;

    public Permen (String rasa, int harga){
        super(rasa);
        this.harga = harga;

    }

public String toString(){
    return "Rasa permen: "+ super.getRasa() + "Harga permen: " + harga;
}
}