package Player;

import Player.Interface.Luminosita;
import Player.Interface.Volume;

public class Video extends PlayerMultimediale implements Volume, Luminosita {
    private int durata;
    private int volume;
    private int lum;

    public Video (String _title, int _durata){
        super(_title);
        durata = _durata;
        volume = 5;
        lum = 5;
    }
    public void upVolume(){
        if (volume < 10 && volume > 0){
            volume++;
            System.out.println(volume);
        }else {
            System.out.println("already at max volume");
        }
    }

    public void downVolume(){
        if (volume <= 10 && volume >= 0){
            volume--;
            System.out.println(volume);
        }else {
            System.out.println("already at min volume");
        }
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

    public void play(){
        String print = title;
        String currentVol = "";
        String currentLum = "";
        for (int j = 0; j <= volume; j++) {
            currentVol += "!";
        }
        for (int k = 0; k <= lum; k++) {
            currentLum += "*";
        }
        for (int i = 0; i <= durata; i++) {
            System.out.println("Now Playing: "+ title +" "+ currentVol +" "+ currentLum +" tunz tunz...");
        }
    }


}
