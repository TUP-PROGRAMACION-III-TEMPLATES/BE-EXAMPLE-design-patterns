package ar.edu.utn.frc.tup.p4;

import lombok.Getter;

@Getter
public class DurationCalculatorVisitor implements MusicVisitor {
    private int totalDuration = 0;

    @Override
    public void visit(Song song) {
        totalDuration += song.getDurationInSeconds();
    }

    @Override
    public void visit(Playlist playlist) {
        // We don't add the playlist itself to the duration, only its songs.
        System.out.println("Calculating duration for playlist '" + playlist.getName() + "'.");
    }
}
