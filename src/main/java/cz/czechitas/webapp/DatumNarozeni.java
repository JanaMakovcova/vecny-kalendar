package cz.czechitas.webapp;

public class DatumNarozeni {

    private int rok;
    private int mesic;
    private int den;
    private boolean zena;

    public DatumNarozeni() {
    }

    public DatumNarozeni(int rok, int mesic, int den, boolean zena) {
        this.rok = rok;
        this.mesic = mesic;
        this.den = den;
        this.zena = zena;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int newValue) {
        rok = newValue;
    }

    public int getMesic() {
        return mesic;
    }

    public void setMesic(int newValue) {
        mesic = newValue;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int newValue) {
        den = newValue;
    }

    public boolean isZena() {
        return zena;
    }

    public void setZena(boolean newValue) {
        zena = newValue;
    }
}