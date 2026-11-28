// A class containing all the elements of a created show
public class Show {
    private String title;
    private int season;
    private int episode;
    private double rating;
    private String notes;

    public Show (String title, int season, int episode, double rating, String notes) {
        this.title = title;
        this.season = season;
        this.episode = episode;
        this.rating = rating;
        this.notes = notes;
    }

    // Returns the title vlaue
    public String getTitle() {
        return title;
    }

    // Returns the season value
    public int getSeason() {
        return season;
    }

    // Updates the season value
    public void setSeason(int season) {
        this.season = season;
    }

    // Returns the episode value
    public int getEpisode() {
        return episode;
    }

    // Updates the episode value
    public void setEpisode(int episode) {
        this.episode = episode;
    }

    // Returns the rating value
    public double getRating() {
        return rating;
    }

    // Updates the rating value
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Returns the notes value
    public String getNotes() {
        return notes;
    }

    // Updates the notes value
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Turns a show into a string displaying all the values broken with a pipe "|"
    @Override
    public String toString() {
        return title + " | Season: " + season + " | Episode: " + episode + " | Rating: " + rating + " | Notes: " + notes; 
    }
}