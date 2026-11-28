import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// A class that stores all of the created shows
public class ShowStorage {
    private static final String FILE_NAME = "shows.txt";

    // Stores all the shows in a .txt file when exiting
    public static void save(ShowManager manager) {
        try {
            PrintWriter writer = new PrintWriter(FILE_NAME);

            for (Show s : manager.getAllShows()) {
                writer.println(s.getTitle() + "|" + s.getSeason() + "|" + s.getEpisode() + "|" + s.getRating() + "|" + s.getNotes());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            IO.println("Couldn't save shows");
        }
    }

    // Loads the shows when running the program again
    public static void load(ShowManager manager) {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split("\\|", -1);
                if (parts.length < 5) {
                    continue;
                }
                manager.addShow(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), parts[4]); 
            }
            reader.close();
        } catch (FileNotFoundException e) {
            IO.println("Couldn't load shows");
        }
    }
}
