package Player;

import Player.Interface.Volume;

public class Audio extends PlayerMultimediale implements Volume {
    private int durata;
    private int volume;

    public Audio (String _title, int _durata){
        super(_title);
        durata = _durata;
        volume = 5;
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

    public void play(){
        String print = title;
        String currentVol = "";

        for (int j = 0; j <= volume; j++) {
            currentVol += "!";
        }

        for (int i = 0; i <= durata; i++) {
            System.out.println("Now Playing: "+ title +" "+ currentVol + " tunz tunz...");
        }
    }
}
