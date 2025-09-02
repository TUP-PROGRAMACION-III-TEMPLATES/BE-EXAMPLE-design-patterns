package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Song {

    private String title;

    public PlaybackState createPlaybackState() {
        return new PlaybackState(0, 50);
    }

    public void restorePlaybackState(PlaybackState state) {
        System.out.println("Restoring playback state for song: " + title);
        System.out.println("Position: " + state.getPosition() + ", Volume: " + state.getVolume());
    }
}
