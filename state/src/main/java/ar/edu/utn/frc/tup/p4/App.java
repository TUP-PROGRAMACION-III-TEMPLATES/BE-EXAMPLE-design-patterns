package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        MusicPlayerContext player = new MusicPlayerContext();

        System.out.println("--- Current State: Stopped ---");
        player.play(); // Switches to PlayingState

        System.out.println("\n--- Current State: Playing ---");
        player.play(); // No state change
        player.pause(); // Switches to PausedState

        System.out.println("\n--- Current State: Paused ---");
        player.play(); // Switches to PlayingState
        player.stop(); // Switches to StoppedState

        System.out.println("\n--- Current State: Stopped ---");
        player.pause(); // No state change
        player.stop(); // No state change

    }
}
