package Player;

import Player.Interface.Luminosita;

public class Immagine extends PlayerMultimediale implements Luminosita {

    private int lum;

    public Immagine (String _title){
        super(_title);
        lum = 5;
    }

    public void upLum(){
        if (lum < 10 && lum > 0){
            lum++;
            System.out.println(lum);
        }else {
            System.out.println("already at max volume");
        }
    }

    public void downLum(){
        if (lum <= 10 && lum >= 0){
            lum--;
            System.out.println(lum);
        }else {
            System.out.println("already at min volume");
        }
    }

    public void show(){
        String currentLum = "";
        for (int k = 0; k <= lum; k++) {
            currentLum += "*";
        }
        System.out.println(title + currentLum);
    }
}
