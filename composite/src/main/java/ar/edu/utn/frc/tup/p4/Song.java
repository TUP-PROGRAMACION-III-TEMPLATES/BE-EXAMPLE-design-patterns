package ar.edu.utn.frc.tup.p4;

public class Song implements MusicComponent {
    private final String title;
    private final String artist;
    private final int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public void play() {
        System.out.println("Playing song: '" + title + "' by " + artist);
    }

    @Override
    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
