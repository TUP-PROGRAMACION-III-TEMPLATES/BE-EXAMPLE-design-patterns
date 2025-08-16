package ar.edu.utn.frc.tup.p4;

public class RealMusicPlayer implements MusicPlayer {

    private final String librarySource;

    public RealMusicPlayer(String librarySource) {
        this.librarySource = librarySource;
        System.out.println("RealMusicPlayer instance created, but library is not loaded yet.");
    }

    @Override
    public void loadLibrary() throws InterruptedException {
        System.out.println("Loading music library from source: " + librarySource + "...");
        Thread.sleep(3000); // Delay simulation for simulate async service.
        System.out.println("Music library loaded successfully.");
    }

    @Override
    public void playSong(String songTitle) {
        System.out.println("Playing song: '" + songTitle + "'");
    }
}
