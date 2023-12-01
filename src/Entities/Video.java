package Entities;

import interfaces.Luminosità;
import Entities.elementoMultimediale;

public class Video extends elementoMultimediale {
    int bright=10;
    public Video(String titolo, int minutaggio, int bright) {
        super(titolo, minutaggio);
        this.bright=bright;
    }

        //Luminosità aumentata
    public void brightnessUp() {
        bright+=1;
        System.out.println("Hai alzato il volume: "+ bright);
    }

        //Luminosità abbassata
    public void brightnessDown() {
        bright+=1;
        System.out.println("Hai alzato il volume: "+ bright);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(minutaggio);

        //for per la stampa del titolo
        for (int i=0; i<minutaggio; i++){
            System.out.println(this.titolo);

            //for per la stampa dei punti esclamativi
            for (int j=0; j<minutaggio; j++) {
                System.out.println("!");
            }
            for (int h=0; h<bright; h++){
                System.out.println("*");
            }
        }
    }
}
