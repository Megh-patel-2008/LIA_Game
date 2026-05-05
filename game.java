
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class game
{
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private String name;
    private int gamesId;
    public game(String name, int gamesId, AgeRating ageRating, Genre genre, Platform platform)
    {
        this.name = name;
        this.gamesId = gamesId;
        this.ageRating = ageRating;
        this.genre = genre;
        this.platform = platform;
    }
    public String getDetails()
    {
        return String.format("  [%d] %-25s | Genre: %-10s | Platform: %-8s | Age: %s", gamesId, name, genre, platform, ageRating);
    }
    public String getName()
    {
        return name;
    }
        public int getGamesId()
    {
        return gamesId;
    }
        public AgeRating getAgeRating()
    {
        return ageRating;
    }
        public Genre getGenre()
    {
        return genre;
    }
        public Platform getPlatform()
    {
        return platform;
    }
    //Add setter methods
    public boolean equals(Object obj)
    {
        if(this==obj)return true;
        if (!(obj instanceof game)) return false;
        game other = (game) obj;
        return this.gamesId == other.gamesId;
    }
    public String toString()
    {
        return getDetails();
    }
}