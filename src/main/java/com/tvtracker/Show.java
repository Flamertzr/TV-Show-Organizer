
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return title + " | Season: " + season + " | Episode: " + episode + " | Rating: " + rating + " | Notes: " + notes; 
    }
}