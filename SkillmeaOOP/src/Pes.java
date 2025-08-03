public class Pes {
    private String rasa;
    private String barva;
    private float vaha;
    private boolean pohlavi;

    Pes(String rasa, String barva, float vaha, boolean pohlavi) {
        this.rasa = rasa;
        this.barva = barva;
        this.vaha = vaha;
        this.pohlavi = pohlavi;
    }

    public void vydejZvuk (String zvuk){
        System.out.println(zvuk);
    }

    public void zrani(){
        System.out.println("Pes zere");
    }

}
