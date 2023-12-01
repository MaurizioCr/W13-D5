package Entities;

import interfaces.Volume;

public class RegistrazioneAudio extends elementoMultimediale {
    int volume;
    public RegistrazioneAudio(String titolo, int minutaggio) {
        super(titolo, minutaggio);
    }

    //alzare volume
    public void volumeUp(){
        volume+=1;
        System.out.println("Hai alzato il volume: "+ volume);
    }

    //abbassare volume
    public void volumeDown(){
            volume-=1;
            System.out.println("Hai alzato il volume: "+ volume);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(this.minutaggio);

        //for per la stampa del titolo
        for (int i=0; i<this.minutaggio; i++){
            System.out.println(this.titolo);

            //for per la stampa dei punti esclamativi
            for (int j=0; j<this.minutaggio; j++)
                System.out.println("!");
        }
    }
}
