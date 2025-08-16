package ar.edu.utn.frc.tup.p4;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public PlayButton createPlayButton() {
        return new DarkPlayButton();
    }
    @Override
    public VolumeControl createVolumeControl() {
        return new DarkVolumeControl();
    }
}
