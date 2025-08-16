package ar.edu.utn.frc.tup.p4;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public PlayButton createPlayButton() {
        return new LightPlayButton();
    }
    @Override
    public VolumeControl createVolumeControl() {
        return new LightVolumeControl();
    }
}
