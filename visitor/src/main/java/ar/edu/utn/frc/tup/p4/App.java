package ar.edu.utn.frc.tup.p4;

/**
 * Adapter Pattern
 */
public class App 
{
    public static void main( String[] args )
    {
        Song song1 = new Song("Bohemian Rhapsody", 354);
        Song song2 = new Song("Hotel California", 391);
        Song song3 = new Song("Stairway to Heaven", 482);

        Playlist rockHits = new Playlist("Rock Hits");
        rockHits.add(song1);
        rockHits.add(song2);

        Playlist library = new Playlist("My Entire Library");
        library.add(rockHits);
        library.add(song3);

        System.out.println("--- Using DurationCalculatorVisitor ---");
        DurationCalculatorVisitor durationVisitor = new DurationCalculatorVisitor();
        library.accept(durationVisitor);
        System.out.println("Total library duration: " + durationVisitor.getTotalDuration() + " seconds.");

        System.out.println("\n--- Using FileExporterVisitor ---");
        FileExporterVisitor exportVisitor = new FileExporterVisitor();
        library.accept(exportVisitor);
        System.out.println("Exported Data:\n" + exportVisitor.getExportedData());
    }
}
