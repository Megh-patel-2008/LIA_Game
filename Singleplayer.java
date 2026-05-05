 
/**
 * Write a description of class Singleplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Singleplayer extends game
{
    private boolean storyMode;
    private String difficulty;
    public Singleplayer(String name, int gamesId, AgeRating ageRating, Genre genre, Platform platform, boolean storyMode, String difficulty)
    {
        super(name, gamesId, ageRating, genre, platform);
    }
    public String getDetails(){
        return super() + String.format(" | Difficulty: %-6s | Story Mode: %s", difficulty, storyMode ? "Yes" : "No");
    }
}