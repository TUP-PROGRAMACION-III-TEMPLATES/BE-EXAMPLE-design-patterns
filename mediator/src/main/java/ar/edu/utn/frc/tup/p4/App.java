package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        PlayButton playButton = new PlayButton();
        VolumeSlider volumeSlider = new VolumeSlider();
        SongList songList = new SongList();

        // Create the mediator and link it with the components
        MusicPlayerMediator mediator = new MusicPlayerMediator(playButton, volumeSlider, songList);

        System.out.println("--- Scenario 1: User selects a song ---");
        songList.selectSong("Bohemian Rhapsody");

        System.out.println("\n--- Scenario 2: User clicks the play button ---");
        playButton.click();

        System.out.println("\n--- Scenario 3: User changes the volume ---");
        volumeSlider.setVolume(80);
    }
}
