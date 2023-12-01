import Entities.RegistrazioneAudio;
import Entities.Video;
import Entities.elementoMultimediale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        RegistrazioneAudio newAudio = new RegistrazioneAudio("Media 2", 5, 10);
        newAudio.play();
        newAudio.volumeUp();
        newAudio.volumeDown();

        Video newVideo = new Video("Media 3", 4, 50);

    }
}