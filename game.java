
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
        this.name     = name;
        this.gamesId  = gamesId;
        this.ageRating = ageRating;
        this.genre    = genre;
        this.platform = platform;
    }
}