package ar.edu.utn.frc.tup.p4;

public class SongList extends Component {
    private String currentSong;
    private boolean isPlaying;

    public void selectSong(String song) {
        this.currentSong = song;
        System.out.println("SongList: '" + song + "' has been selected.");
        mediator.notify(this, "song_selected");
    }

    public void highlightSelectedSong() {
        System.out.println("SongList: Highlighting '" + currentSong + "'.");
    }

    public void setPlayingStatus(boolean isPlaying) {
        this.isPlaying = isPlaying;
        if (isPlaying) {
            System.out.println("SongList: Status set to 'Playing'.");
        } else {
            System.out.println("SongList: Status set to 'Paused'.");
        }
    }
}
