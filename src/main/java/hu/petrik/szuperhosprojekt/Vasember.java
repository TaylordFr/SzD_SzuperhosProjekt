package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{

    Random random = new Random();

    public Vasember() {
        super(150, true);
    }



    @Override
    public void kutyutKeszit(){
        int randomNum = random.nextInt(11);

        float current_szuperero = getSzuperero() + randomNum;

        this.setSzuperero(current_szuperero);
    }

    @Override
    public boolean megmentiAVilagot(){
        if(this.getSzuperero() > 1000){
            return true;
        }

        return false;
    }

    @Override
    public boolean megmentiAvilagot() {
        return false;
    }

    @Override
    public String toString() {

        String formated = String.format("%.0f", getSzuperero());
        if(isVanEGyengesege()){
            return "Vasember: \nSzupererő: " + formated + ";" + "van gyengesége";
        } else {
            return "Vasember: \nSzupereő: " + formated + ";" + "nincs gyengesége";
        }
    }

}
