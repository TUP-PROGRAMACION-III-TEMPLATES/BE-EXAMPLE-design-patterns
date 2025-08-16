package ar.edu.utn.frc.tup.p4;

import lombok.Getter;

@Getter
public class Song {
    private final String title;
    private final String filePath;
    private final Album album;

    public Song(String title, String filePath, Album album) {
        this.title = title;
        this.filePath = filePath;
        this.album = album;
    }

    public void play() {
        System.out.printf("Playing '%s' from album '%s' by '%s'%n",
                title,
                album.getTitle(),
                album.getArtist().getName());
    }
}
