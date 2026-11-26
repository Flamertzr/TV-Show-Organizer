import java.util.ArrayList;

public class ShowManager {
    private ArrayList<Show> shows;

    public ShowManager() {
        shows = new ArrayList<>();
    }

    public void addShow(String title, int season, int episode, double rating, String notes) {
        Show show = new Show(title, season, episode, rating, notes);
        shows.add(show);
    }

    public void removeShow(String title) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.remove(i);
                System.out.println("Removed: " + title);
            }
        }
    }

    public ArrayList<Show> getAllShows() {
        return shows;
    }

    public void findByTitle(String title) {
        int count = 0;
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                System.out.println(shows.get(i).toString());
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("No Shows");
        }
    }

    public void updateSeason(String title, int season) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setSeason(season);
                System.out.println("Changed Season For " + title);
            }
        }
    }

    public void updateEpisode(String title, int episode) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setEpisode(episode);
                System.out.println("Changed Episode For " + title);
            }
        }
    }

    public void updateRating(String title, double rating) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setRating(rating);
                System.out.println("Changed Rating For " + title);
            }
        }
    }

    public void updateNotes(String title, String notes) {
        for (int i = 0; i < shows.size(); i++) {
            if (shows.get(i).getTitle().toLowerCase().equals(title.toLowerCase())) {
                shows.get(i).setNotes(notes);
                System.out.println("Changed Notes For " + title);
            }
        }
    }
}