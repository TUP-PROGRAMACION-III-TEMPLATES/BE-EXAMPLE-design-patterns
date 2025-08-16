package ar.edu.utn.frc.tup.p4;

public class PlaybackContext {
    private String currentSong;
    private boolean isPlaying;

    public void play(String songName) {
        this.currentSong = songName;
        this.isPlaying = true;
        System.out.println("Player: Started playing '" + this.currentSong + "'.");
    }

    public void pause() {
        if (isPlaying) {
            this.isPlaying = false;
            System.out.println("Player: Paused '" + this.currentSong + "'.");
        }
    }

    public void stop() {
        if (isPlaying) {
            this.isPlaying = false;
            System.out.println("Player: Stopped '" + this.currentSong + "'.");
        }
        this.currentSong = null;
    }

    public void adjustVolume(int volume) {
        System.out.println("Player: Adjusted volume to " + volume + ".");
    }
}
