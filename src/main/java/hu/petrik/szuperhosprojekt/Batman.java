package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos{

    private float lelemenyesseg;

    public Batman(){
        this.lelemenyesseg = 100;
    }

    @Override
    public float mekkoraAzEreje(){
        return this.lelemenyesseg*2;
    }

    @Override
    public boolean legyoziE(Bosszuallo ertek){
        if(this.lelemenyesseg > ertek.getSzuperero()){
            return true;
        }

        return false;
    }

    @Override
    public void kutyutKeszit(){
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        String formated = String.format("%.0f", lelemenyesseg);
        return "Batman: leleményesség: " + formated;
    }
}
