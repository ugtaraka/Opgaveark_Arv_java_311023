class personvogn extends koeretoej{
    protected int hastighed;
    protected int hestekraefter;
    protected String motorstoerelse;

    public personvogn() {
    }
    public void udskriv() {
        super.udskriv();
        System.out.println(hastighed);
        System.out.println(motorstoerelse);
        System.out.println(hestekraefter);
    }


    public personvogn(int hastighed, int hestekraefter, String motorstoerelse) {
        this.hastighed = hastighed;
        this.hestekraefter = hestekraefter;
        this.motorstoerelse = motorstoerelse;
    }

    public personvogn(double vaegtafgift, String registreringsnummer, int hastighed, int hestekraefter, String motorstoerelse) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.hestekraefter = hestekraefter;
        this.motorstoerelse = motorstoerelse;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    public int getHestekraefter() {
        return hestekraefter;
    }

    public void setHestekraefter(int hestekraefter) {
        this.hestekraefter = hestekraefter;
    }

    public String getMotorstoerelse() {
        return motorstoerelse;
    }

    public void setMotorstoerelse(String motorstoerelse) {
        this.motorstoerelse = motorstoerelse;
    }
}