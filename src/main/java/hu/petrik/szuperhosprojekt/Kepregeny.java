package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Kepregeny {

    public static ArrayList<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath){

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(" ");
                if(parts[0].equals("Vasember")){
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < parseInt(parts[1]); i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);

                } else if(parts[0].equals("Batman")){
                    Batman batman = new Batman();
                    for (int i = 0; i < parseInt(parts[1]); i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void szuperhosok(){
        for(Szuperhos element: szuperhosLista){
            System.out.println(element.toString());
            System.out.println();
        }
    }
}
