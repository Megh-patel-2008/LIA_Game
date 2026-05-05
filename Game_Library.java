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
    public Game_Library()
    {
        game = new ArrayList<>(); 
        loadGames();
    }
    private void loadGames(){
        games.add(new Singleplayergame);
    }
}