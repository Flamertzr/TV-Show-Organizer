import java.util.ArrayList;

// A class that manages all the shows
public class ShowManager {
    private ArrayList<Show> shows;

    public ShowManager() {
        shows = new ArrayList<>();
    }

    // Creates a new show with the given values
    public void addShow(String title, int season, int episode, double rating, String notes) {
        Show show = new Show(title, season, episode, rating, notes);
        shows.add(show);
    }

    // Removes an existing show with the given title
    public void removeShow(String title) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.remove(i);
                IO.println("Removed: " + title);
                return;
            }
        }
        IO.println("Show not found");
    }

    // Returns an arraylist with all existing shows
    public ArrayList<Show> getAllShows() {
        return shows;
    }

    // Prints shows starting with the given string
    public void findByTitle(String title) {
        int count = 0;
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().startsWith(title.toLowerCase())) {
                IO.println(shows.get(i).toString());
                count += 1;
            }
        }
        if (count == 0) {
            IO.println("Show not found");
        }
    }

    // Updates the season value of an existing show based on the title given
    public void updateSeason(String title, int season) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setSeason(season);
                IO.println("Changed Season For " + title);
            }
        }
    }

    // Updates the episode value of an existing show based on the title given
    public void updateEpisode(String title, int episode) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setEpisode(episode);
                IO.println("Changed Episode For " + title);
            }
        }
    }

    // Updates the rating value of an existing show based on the title given
    public void updateRating(String title, double rating) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setRating(rating);
                IO.println("Changed Rating For " + title);
            }
        }
    }

    // Updates the notes value of an exitsing show based on the title given
    public void updateNotes(String title, String notes) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setNotes(notes);
                IO.println("Changed Notes For " + title);
            }
        }
    }
}