public abstract class Makanan{
    String rasa;

    public abstract String toString();

    public Makanan(String rasa) {
        this.rasa = rasa;
    }
     public String getRasa() {
        return rasa;
     }
}