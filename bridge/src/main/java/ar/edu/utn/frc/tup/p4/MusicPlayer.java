package ar.edu.utn.frc.tup.p4;

public abstract class MusicPlayer {

    protected Player player;

    public MusicPlayer(Player player) {
        this.player = player;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
