package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create individual songs (leaves)
        Song song1 = new Song("Bohemian Rhapsody", "Queen", 354);
        Song song2 = new Song("Hotel California", "Eagles", 391);
        Song song3 = new Song("Stairway to Heaven", "Led Zeppelin", 482);
        Song song4 = new Song("Imagine", "John Lennon", 183);

        Playlist classicRockPlaylist = new Playlist("Classic Rock Hits");
        classicRockPlaylist.add(song1);
        classicRockPlaylist.add(song2);

        Playlist seventiesPlaylist = new Playlist("70s Classics");
        seventiesPlaylist.add(song3);
        seventiesPlaylist.add(song4);
        seventiesPlaylist.add(classicRockPlaylist);

        seventiesPlaylist.play();

        System.out.println("\n--- Calculating total duration ---");
        int totalDuration = seventiesPlaylist.getDurationInSeconds();
        System.out.println("Total duration of '70s Classics' playlist: " + totalDuration + " seconds.");
    }
}
