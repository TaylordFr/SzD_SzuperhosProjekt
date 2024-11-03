package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public String toString() {
        String formated = String.format("%.0f", szuperero);

        if(this.vanEGyengesege == true){
            return "Szupererő: " + formated + ";" + "van gyengesége";
        } else {
            return "Szupereő: " + formated + ";" + "nincs gyengesége";
        }

    }

    @Override
    public float mekkoraAzEreje(){
        return this.szuperero;
    }


    @Override
    public boolean legyoziE(Bosszuallo ertek){
        if(ertek.vanEGyengesege == true){
            if(ertek.mekkoraAzEreje() < this.mekkoraAzEreje()){
                return true;
            }
        }

        return false;
    }

    public abstract boolean megmentiAvilagot();
}
