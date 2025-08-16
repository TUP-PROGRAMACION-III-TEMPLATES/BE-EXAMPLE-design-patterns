package ar.edu.utn.frc.tup.p4;

public class WAVPlayer implements AdvancedMediaPlayer {

    @Override
    public void playWAV(String filename) {
        System.out.println("Playing WAV file: " + filename);
    }
}
