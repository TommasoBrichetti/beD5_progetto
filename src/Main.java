import Player.Audio;
import Player.Immagine;
import Player.PlayerMultimediale;
import Player.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Video bombo =  new Video("bombo", 30);
//        Audio dumbo =  new Audio("dumbo", 30);
//        Immagine wow = new Immagine("wow");
//
//        bombo.upLum();
//
//
//        bombo.play();
//        dumbo.play();
//        wow.show();
        PlayerMultimediale[] arr = new PlayerMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("che tipo di file vuoi creare? scegli da 1 o video per video, 2 o audio per audio, 3 o" +
                    " immagine per immagine oppure qualsiasi altra cosa per uscire");
            Scanner input = new Scanner(System.in);
            int scanner = input.nextInt();
            if (scanner == 1){
                System.out.println("Titolo?");
                Scanner ins = new Scanner(System.in);
                String title = ins.next();
                System.out.println("Durata?");
                Scanner time = new Scanner(System.in);
                int durata = time.nextInt();
                arr[i] = new Video(title, durata);
            } else if (scanner == 2) {
                System.out.println("Titolo?");
                Scanner ins = new Scanner(System.in);
                String title = ins.next();
                System.out.println("Durata?");
                Scanner time = new Scanner(System.in);
                int durata = time.nextInt();
                arr[i] = new Audio(title, durata);
            } else if (scanner == 3) {
                System.out.println("Titolo?");
                Scanner ins = new Scanner(System.in);
                String title = ins.next();
                arr[i] = new Immagine(title);
            }





        }
        boolean loop = true;
        while (loop){
            System.out.println("Cosa vuoi riprodurre? Scegli numeri da 1 a 5 per la selezionare la posizione " +
                    "qualsiasi altro numero terminerà il processo!");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            switch (selection){
                case 1:
                    if (arr[1] instanceof Immagine){
                        ((Immagine) arr[0]).show();
                    }else if(arr[0] instanceof Video) {
                        ((Video) arr[0]).play();
                    }else {
                        ((Audio) arr[0]).play();
                    }
                    break;
                case 2:
                    if (arr[1] instanceof Immagine){
                        ((Immagine) arr[1]).show();
                    }else if(arr[1] instanceof Video) {
                        ((Video) arr[1]).play();
                    }else {
                        ((Audio) arr[1]).play();
                    }
                    break;
                case 3:
                    if (arr[2] instanceof Immagine){
                        ((Immagine) arr[2]).show();
                    }else if(arr[2] instanceof Video) {
                        ((Video) arr[2]).play();
                    }else {
                        ((Audio) arr[2]).play();
                    }
                    break;
                case 4:
                    if (arr[3] instanceof Immagine){
                        ((Immagine) arr[3]).show();
                    }else if(arr[3] instanceof Video) {
                        ((Video) arr[3]).play();
                    }else {
                        ((Audio) arr[3]).play();
                    }
                    break;
                case 5:
                    if (arr[4] instanceof Immagine){
                        ((Immagine) arr[4]).show();
                    }else if(arr[4] instanceof Video) {
                        ((Video) arr[4]).play();
                    }else {
                        ((Audio) arr[4]).play();
                    }
                    break;
                default:
                    loop = false;
                    break;
            }}




    }
}