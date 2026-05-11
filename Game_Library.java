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
        games.add(new Singleplayer("Five Nights at Freddy's", 9, AgeRating.TEEN, Genre.HORROR, Platform.MOBILE, true, "Hard"));
        games.add(new Multiplayer("FIFA Mobile", 10, AgeRating.CHILD, Genre.SPORTS, Platform.MOBILE,2));
        games.add(new Multiplayer("Clash of Clans", 11, AgeRating.TEEN, Genre.STRATEGY, Platform.MOBILE, 50));
        games.add(new Multiplayer("Among Us", 12, AgeRating.CHILD, Genre.STRATEGY,Platform.MOBILE, 10));
        games.add(new Singleplayer("God of War", 13, AgeRating.ADULT, Genre.RPG, Platform.PLAYSTATION, true, "Hard"));
        games.add(new Singleplayer("Silent Hill 2", 14, AgeRating.ADULT, Genre.HORROR, Platform.PLAYSTATION, true, "Medium"));        
        games.add(new Singleplayer("EA FC 25", 15, AgeRating.TEEN, Genre.SPORTS, Platform.PLAYSTATION, true, "Medium"));
        games.add(new Multiplayer("NBA 2K25", 16, AgeRating.TEEN, Genre.SPORTS, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("Diablo IV", 17, AgeRating.ADULT, Genre.RPG, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("Predator Hunting Grounds", 18, AgeRating.ADULT, Genre.HORROR, Platform.PLAYSTATION, 5));
        games.add(new Singleplayer("Halo Infinite", 19, AgeRating.TEEN, Genre.STRATEGY, Platform.XBOX, true, "Medium"));
        games.add(new Singleplayer("Alan Wake 2", 20, AgeRating.ADULT, Genre.HORROR, Platform.XBOX, true, "Hard"));
        games.add(new Singleplayer("Fable", 21, AgeRating.TEEN, Genre.RPG, Platform.XBOX, true, "Easy"));
        games.add(new Multiplayer("Rocket League", 22, AgeRating.CHILD, Genre.SPORTS, Platform.XBOX, 4));
        games.add(new Multiplayer("Back 4 Blood", 23, AgeRating.ADULT, Genre.HORROR, Platform.XBOX, 4));
        games.add(new Multiplayer("Gears 5", 24, AgeRating.ADULT, Genre.STRATEGY, Platform.XBOX, 4));
        games.add(new Singleplayer("Zelda Tears of the Kingdom", 25, AgeRating.CHILD, Genre.RPG, Platform.NINTENDO, true, "Medium"));
        games.add(new Singleplayer("Fire Emblem Engage", 26, AgeRating.TEEN, Genre.STRATEGY, Platform.NINTENDO, true, "Hard"));
        games.add(new Singleplayer("Luigi's Mansion 3", 27, AgeRating.CHILD, Genre.HORROR, Platform.NINTENDO, true, "Easy"));
        games.add(new Multiplayer("Mario Kart 8", 28, AgeRating.CHILD, Genre.SPORTS, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Mario Party Superstars", 29, AgeRating.CHILD, Genre.STRATEGY, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Pokemon Unite", 30, AgeRating.CHILD, Genre.RPG, Platform.NINTENDO, 5));
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