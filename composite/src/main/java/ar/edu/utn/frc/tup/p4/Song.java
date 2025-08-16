package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Song implements MusicComponent {
    private final String title;
    private final String artist;
    private final int durationInSeconds;

    @Override
    public void play() {
        System.out.println("Playing song: '" + title + "' by " + artist);
    }

    @Override
    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
