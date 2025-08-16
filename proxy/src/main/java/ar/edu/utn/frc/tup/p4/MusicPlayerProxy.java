package ar.edu.utn.frc.tup.p4;

public class MusicPlayerProxy implements MusicPlayer {
    private RealMusicPlayer realPlayer;
    private final String librarySource;

    public MusicPlayerProxy(String librarySource) {
        this.librarySource = librarySource;
        System.out.println("MusicPlayerProxy instance created.");
    }

    @Override
    public void loadLibrary() throws InterruptedException {
        System.out.println("Proxy: Delegating library load request.");
        getRealPlayer().loadLibrary();
    }

    @Override
    public void playSong(String songTitle) throws InterruptedException {
        // The real player is only created and loaded on the first request.
        System.out.println("Proxy: Handling play request for '" + songTitle + "'...");
        getRealPlayer().playSong(songTitle);
    }

    // Lazy initialization logic
    private RealMusicPlayer getRealPlayer() throws InterruptedException {
        if (realPlayer == null) {
            System.out.println("Proxy: Real player is not initialized. Initializing now.");
            realPlayer = new RealMusicPlayer(librarySource);
            realPlayer.loadLibrary();
        }
        return realPlayer;
    }
}
