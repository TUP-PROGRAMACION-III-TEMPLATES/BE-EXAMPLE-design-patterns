package ar.edu.utn.frc.tup.p4;

public class App {
    public static void main( String[] args ) {
        Song song = new Song("Imagine");
        PlaybackHistory history = new PlaybackHistory(3);

        history.saveState(new PlaybackState(0, 50));
        history.saveState(new PlaybackState(10, 60));
        history.saveState(new PlaybackState(20, 70));
        history.saveState(new PlaybackState(30, 80));

        while (history.hasStates()) {
            PlaybackState state = history.restoreState();
            song.restorePlaybackState(state);
        }
    }
}
