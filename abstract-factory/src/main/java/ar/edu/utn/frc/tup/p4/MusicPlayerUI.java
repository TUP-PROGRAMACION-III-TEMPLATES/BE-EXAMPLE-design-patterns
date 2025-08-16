package ar.edu.utn.frc.tup.p4;

public class MusicPlayerUI {
    private final PlayButton playButton;
    private final VolumeControl volumeControl;

    // The constructor receives a factory, not concrete classes.
    public MusicPlayerUI(ThemeFactory factory) {
        this.playButton = factory.createPlayButton();
        this.volumeControl = factory.createVolumeControl();
    }

    public void show() {
        System.out.println("--- Rendering the User Interface ---");
        playButton.render();
        volumeControl.render();
        System.out.println("----------------------------------------");
    }
}
