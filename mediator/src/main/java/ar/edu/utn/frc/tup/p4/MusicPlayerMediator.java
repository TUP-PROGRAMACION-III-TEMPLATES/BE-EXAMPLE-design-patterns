package ar.edu.utn.frc.tup.p4;

public class MusicPlayerMediator implements Mediator {
    private final PlayButton playButton;
    private final VolumeSlider volumeSlider;
    private final SongList songList;

    public MusicPlayerMediator(PlayButton playButton, VolumeSlider volumeSlider, SongList songList) {
        this.playButton = playButton;
        this.volumeSlider = volumeSlider;
        this.songList = songList;
        this.playButton.setMediator(this);
        this.volumeSlider.setMediator(this);
        this.songList.setMediator(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == playButton) {
            // Play button was clicked.
            if ("play_clicked".equals(event)) {
                System.out.println("Mediator: 'play_clicked' event received from PlayButton. Updating SongList.");
                songList.setPlayingStatus(true);
            }
        } else if (sender == songList) {
            // A new song was selected from the list.
            if ("song_selected".equals(event)) {
                System.out.println("Mediator: 'song_selected' event received from SongList. Updating PlayButton.");
                songList.setPlayingStatus(false); // Stop playback before starting a new song
            }
        } else if (sender == volumeSlider) {
            // Volume was changed.
            if ("volume_changed".equals(event)) {
                System.out.println("Mediator: 'volume_changed' event received from VolumeSlider. No other components need to be notified for this change.");
            }
        }
    }
}
