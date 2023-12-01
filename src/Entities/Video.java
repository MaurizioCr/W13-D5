package Entities;

import interfaces.Luminosità;
import Entities.elementoMultimediale;

public class Video extends elementoMultimediale {
    int bright;
    int volume;
    public Video(String titolo, int minutaggio, int bright, int volume) {
        super(titolo, minutaggio);
        this.bright=bright;
        this.volume=volume;
    }

    public void volumeUp(){
        volume+=1;
        System.out.println("Hai alzato il volume: "+ volume);
    }

    //abbassare volume
    public void volumeDown(){
        volume-=1;
        System.out.println("Hai abbassato il volume: "+volume);
    }

        //Luminosità aumentata
    public void brightnessUp() {
        bright+=1;
        System.out.println("Hai alzato la luminosità: "+ bright);
    }

        //Luminosità abbassata
    public void brightnessDown() {
        bright+=1;
        System.out.println("Hai abbassato la luminosità: "+ bright);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(minutaggio);

        //for per la stampa del titolo
        for (int i=0; i<minutaggio; i++){
            System.out.println(titolo);

            //for per la stampa dei punti esclamativi
            for (int j=0; j<volume; j++) {
                System.out.println("!");
            }
            for (int h=0; h<bright; h++){
                System.out.println("*");
            }
        }
    }
}
