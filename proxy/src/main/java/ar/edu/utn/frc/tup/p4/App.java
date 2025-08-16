package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println("--- Client creates a proxy instance ---");
        // Creating the proxy is fast. The real object is not yet created.
        MusicPlayer player = new MusicPlayerProxy("Remote Music Library API");

        System.out.println("\n--- First request to play a song ---");
        // This is the first time the real object is needed.
        // The proxy will create and load it now.
        player.playSong("Bohemian Rhapsody");

        System.out.println("\n--- Second request to play a song ---");
        // The real object already exists, so the proxy just delegates the request.
        player.playSong("Hotel California");
    }
}
