class lastbil extends koeretoej{

    protected int hestekraefter;
    protected int lastkapacitet;

    public lastbil() {
    }
    public void udskriv(){
        super.udskriv();
        System.out.println(hestekraefter);
        System.out.println(lastkapacitet);
    }

    public lastbil(int hestekraefter, int lastkapacitet) {
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    public lastbil(double vaegtafgift, String registreringsnummer, int hestekraefter, int lastkapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hestekraefter = hestekraefter;
        this.lastkapacitet = lastkapacitet;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public int getLastkapacitet() {
        return lastkapacitet;
    }

    public void setLastkapacitet(int lastkapacitet) {
        this.lastkapacitet = lastkapacitet;
    }
}