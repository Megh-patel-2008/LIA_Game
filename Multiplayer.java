
/**
 * Write a description of class Multiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplayer extends game
{
    private int maxPlayers;
    public Multiplayer(String name, int gamesId, AgeRating ageRating, Genre genre, Platform platform, int maxPlayers)
    {
        super(name, gamesId, ageRating, genre, platform);
        this.maxPlayers= maxPlayers;
    }
}