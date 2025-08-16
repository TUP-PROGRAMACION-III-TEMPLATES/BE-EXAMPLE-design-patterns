package ar.edu.utn.frc.tup.p4;

public abstract class SongDecorator implements Playable {

    protected Playable song;

    public SongDecorator(Playable song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }
}
