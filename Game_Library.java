import java.util.ArrayList;

/**
 * Write a description of class Game_Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game_Library
{
    private game game;
    private ArrayList<game> games;
    public Game_Library()
    {
        games = new ArrayList<>();
        loadGames();
    }
    public void loadGames(){
        games.add(new Singleplayer("The Witcher 3", 1, AgeRating.ADULT, Genre.RPG, Platform.PC, true, "Hard"));
        games.add(new Singleplayer("Resident Evil 4", 2, AgeRating.ADULT, Genre.HORROR, Platform.PC, true, "Medium"));
        games.add(new Singleplayer("Civilization VI", 3, AgeRating.TEEN, Genre.STRATEGY, Platform.PC, false, "Hard"));
        games.add(new Multiplayer("FIFA 25", 4, AgeRating.TEEN, Genre.SPORTS, Platform.PC, 4));
        games.add(new Multiplayer("Age of Empires IV", 5, AgeRating.TEEN, Genre.STRATEGY, Platform.PC, 8));
        games.add(new Multiplayer("Dead by Daylight", 6, AgeRating.ADULT, Genre.HORROR, Platform.PC, 5));
        games.add(new Singleplayer("Alto's Odyssey", 7, AgeRating.CHILD, Genre.RPG, Platform.MOBILE, false, "Easy"));
        games.add(new Singleplayer("Plague Inc", 8, AgeRating.TEEN, Genre.STRATEGY, Platform.MOBILE, false, "Medium"));
    }
    public ArrayList<game> filter(boolean isSinglePlayer, Platform platform, Genre genre, AgeRating ageRating){
        ArrayList<game> result = new ArrayList<>();
        for (game g : games){
             boolean typeMatch = isSinglePlayer ? (g instanceof Singleplayer) : (g instanceof Multiplayer);
             if(typeMatch && g.getPlatform() == platform && g.getGenre() == genre && g.getAgeRating() == ageRating){
                 result.add(g);
             }
             
        }
        return result;
    }
    public ArrayList<game> getGames(){
        return games;
    }
}