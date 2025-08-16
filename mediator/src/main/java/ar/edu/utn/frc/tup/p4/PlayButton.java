package ar.edu.utn.frc.tup.p4;

public class PlayButton extends Component {
    public void click() {
        System.out.println("PlayButton: User clicked 'Play'.");
        mediator.notify(this, "play_clicked");
    }
}
