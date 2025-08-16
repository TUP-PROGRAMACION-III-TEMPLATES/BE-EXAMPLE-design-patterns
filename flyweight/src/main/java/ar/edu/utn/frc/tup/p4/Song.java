package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Song {
    private final String title;
    private final String filePath;
    private final Album album;

    public void play() {
        System.out.printf("Playing '%s' from album '%s' by '%s'%n",
                title,
                album.getTitle(),
                album.getArtist().getName());
    }
}
