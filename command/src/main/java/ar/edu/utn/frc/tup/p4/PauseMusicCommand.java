package ar.edu.utn.frc.tup.p4;

public class PauseMusicCommand implements MusicCommand {

    private final MusicPlayer musicPlayer;

    public PauseMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.pause();
    }
}
