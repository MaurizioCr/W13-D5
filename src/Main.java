import Entities.Immagine;
import Entities.RegistrazioneAudio;
import Entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opzione;

        // Creazioni media
        RegistrazioneAudio newAudio = new RegistrazioneAudio("Media 2", 5, 10);
        Video newVideo = new Video("Media 3", 4, 10, 12);
        Immagine newImmagine = new Immagine("Media 4", 0);

        // Scanner
        Scanner scanner = new Scanner(System.in);

        do {
            // Scelta opzione
            System.out.println("Scrivi 1 per ascoltare l'audio, 2 per visualizzare il video, 3 per visualizzare l'immagine, 4 per uscire");
            opzione = scanner.nextInt();

            switch (opzione) {
                case 1:
                    newAudio.play();
                    newAudio.volumeUp();
                    newAudio.volumeDown();
                    break;
                case 2:
                    newVideo.play();
                    newVideo.brightnessUp();
                    newVideo.brightnessDown();
                    break;
                case 3:
                    newImmagine.show();
                    newImmagine.brightnessUp();
                    newImmagine.brightnessDown();
                    break;
                case 4:
                    System.out.println("Chiusura player.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (opzione != 4);


    }
}
