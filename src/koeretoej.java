public class koeretoej {
    protected double vaegtafgift;
    protected String registreringsnummer;

public void udskriv(){
    System.out.println(vaegtafgift);
    System.out.println( registreringsnummer);
}

    public koeretoej() {
    }

    public koeretoej(double vaegtafgift, String registreringsnummer) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsnummer = registreringsnummer;
    }

    public double getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(double vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }
}













