package Entities;

public class Immagine extends elementoMultimediale{
    int bright;
    public Immagine(String titolo, int bright) {
        super(titolo, 0);
        this.bright=bright;
    }

    public void brightnessUp() {
        bright+=1;
        System.out.println("Hai alzato la luminosità: "+ bright);
    }

    //Luminosità abbassata
    public void brightnessDown() {
        bright+=1;
        System.out.println("Hai abbassato la luminosità: "+ bright);
    }

    public void show() {
        //for per la stampa del titolo
            System.out.println(titolo);

            //for per la stampa dei punti esclamativi
            for (int j = 0; j < bright; j++) {
                System.out.println("*");
            }
        }
    }

