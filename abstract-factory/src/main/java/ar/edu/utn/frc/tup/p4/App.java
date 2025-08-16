package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("--- Changing to the Light Theme ---");
        ThemeFactory lightFactory = new LightThemeFactory();
        MusicPlayerUI lightPlayer = new MusicPlayerUI(lightFactory);
        lightPlayer.show();

        System.out.println("\n--- Changing to the Dark Theme ---");
        ThemeFactory darkFactory = new DarkThemeFactory();
        MusicPlayerUI darkPlayer = new MusicPlayerUI(darkFactory);
        darkPlayer.show();
    }
}
