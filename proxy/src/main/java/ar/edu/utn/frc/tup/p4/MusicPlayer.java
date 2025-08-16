package ar.edu.utn.frc.tup.p4;

public interface MusicPlayer {
    void loadLibrary() throws InterruptedException;
    void playSong(String songTitle) throws InterruptedException;
}
