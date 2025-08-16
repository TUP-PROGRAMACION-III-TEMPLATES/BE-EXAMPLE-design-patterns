package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("--- Creating songs with shared data ---");

        // Use the factory to get shared Artist and Album instances
        Artist queenArtist = MusicFlyweightFactory.getArtist("Queen");
        Album aNightAtTheOpera = MusicFlyweightFactory.getAlbum("A Night at the Opera", queenArtist);

        // Create multiple songs that share the same album and artist objects
        Song song1 = new Song("Bohemian Rhapsody", "path/to/song1.mp3", aNightAtTheOpera);
        Song song2 = new Song("Love of My Life", "path/to/song2.mp3", aNightAtTheOpera);

        // Get another album for the same artist
        Album theGame = MusicFlyweightFactory.getAlbum("The Game", queenArtist);
        Song song3 = new Song("Crazy Little Thing Called Love", "path/to/song3.mp3", theGame);

        // Get a new artist and album
        Artist eaglesArtist = MusicFlyweightFactory.getArtist("Eagles");
        Album hotelCaliforniaAlbum = MusicFlyweightFactory.getAlbum("Hotel California", eaglesArtist);
        Song song4 = new Song("Hotel California", "path/to/song4.mp3", hotelCaliforniaAlbum);
        Song song5 = new Song("New Kid in Town", "path/to/song5.mp3", hotelCaliforniaAlbum);

        System.out.println("\n--- Play all songs ---");
        song1.play();
        song2.play();
        song3.play();
        song4.play();
        song5.play();

        System.out.println("\n--- Verifying shared instances using hash codes ---");
        System.out.println("Is 'Queen' artist instance shared for song1 and song2? " + (song1.getAlbum().getArtist() == song2.getAlbum().getArtist()));
        System.out.println("Is 'Queen' artist instance shared for song1 and song3? " + (song1.getAlbum().getArtist() == song3.getAlbum().getArtist()));
        System.out.println("Is 'A Night at the Opera' album instance shared for song1 and song2? " + (song1.getAlbum() == song2.getAlbum()));
        System.out.println("Is 'A Night at the Opera' album instance shared for song1 and song4? " + (song1.getAlbum() == song4.getAlbum()));
    }
}
