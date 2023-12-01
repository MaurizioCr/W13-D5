// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        elementoMultimediale newvideo= new elementoMultimediale("Media 1", 2);
        newvideo.play();

        RegistrazioneAudio newaudio= new RegistrazioneAudio("Media 2", 5);
        newaudio.volumeUp();
        newaudio.play();
        newaudio.volumeUp();
        newaudio.volumeDown();

    }
}