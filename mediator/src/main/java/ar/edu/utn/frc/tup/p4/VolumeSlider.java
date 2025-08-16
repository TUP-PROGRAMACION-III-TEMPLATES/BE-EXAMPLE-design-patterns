package ar.edu.utn.frc.tup.p4;

public class VolumeSlider extends Component {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("VolumeSlider: Volume changed to " + volume + ".");
        mediator.notify(this, "volume_changed");
    }
}
