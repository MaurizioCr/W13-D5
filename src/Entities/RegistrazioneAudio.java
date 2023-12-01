package Entities;

import interfaces.Volume;

public class RegistrazioneAudio extends elementoMultimediale {
    int volume;
    public RegistrazioneAudio(String titolo, int minutaggio, int volume) {
        super(titolo, minutaggio);
        this.volume=volume;
    }

    //alzare volume
    public void volumeUp(){
        volume+=1;
        System.out.println("Hai alzato il volume: "+ volume);
    }

    //abbassare volume
    public void volumeDown(){
        volume-=1;
        System.out.println("Hai abbassato il volume: "+volume);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(minutaggio);

        //for per la stampa del titolo
        for (int i=0; i<minutaggio; i++){
            System.out.println(titolo);

            //for per la stampa dei punti esclamativi
            for (int j=0; j<minutaggio; j++){
                System.out.println("!");}
        }
    }
}
