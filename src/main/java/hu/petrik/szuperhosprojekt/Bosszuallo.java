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
    public double mekkoraAzEreje(){
        return this.szuperero;
    }


    @Override
    public boolean legyoziE(Szuperhos ertek){
        if(ertek instanceof Bosszuallo){
            if(((Bosszuallo) ertek).vanEGyengesege && ertek.mekkoraAzEreje() < this.mekkoraAzEreje()){
                return true;
            }
        } else if(ertek instanceof Batman){
            if(this.mekkoraAzEreje() > ertek.mekkoraAzEreje()*2){
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }
}
