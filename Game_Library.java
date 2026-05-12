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
        //PC
        games.add(new Singleplayer("The Witcher 3", 1, AgeRating.ADULT, Genre.RPG, Platform.PC, true, "Hard"));
        games.add(new Singleplayer("Resident Evil 4", 2, AgeRating.ADULT, Genre.HORROR, Platform.PC, true, "Medium"));
        games.add(new Singleplayer("Civilization VI", 3, AgeRating.TEEN, Genre.STRATEGY, Platform.PC, false, "Hard"));
        games.add(new Singleplayer("Dragon Age Inquisition", 31, AgeRating.TEEN, Genre.RPG, Platform.PC, true, "Medium"));
        games.add(new Singleplayer("Ni No Kuni", 32, AgeRating.CHILD, Genre.RPG, Platform.PC, true, "Easy"));
        games.add(new Singleplayer("Amnesia The Bunker", 33, AgeRating.TEEN, Genre.HORROR, Platform.PC, false, "Hard"));
        games.add(new Singleplayer("Little Nightmares", 34, AgeRating.CHILD, Genre.HORROR, Platform.PC, true, "Easy"));
        games.add(new Singleplayer("XCOM 2", 35, AgeRating.ADULT, Genre.STRATEGY, Platform.PC, false, "Hard"));
        games.add(new Singleplayer("Angry Birds Reloaded", 36, AgeRating.CHILD, Genre.STRATEGY, Platform.PC, false, "Easy"));
        games.add(new Singleplayer("EA FC 25 PC", 37, AgeRating.ADULT, Genre.SPORTS, Platform.PC, true, "Hard"));
        games.add(new Singleplayer("Tony Hawk Pro Skater", 38, AgeRating.TEEN, Genre.SPORTS, Platform.PC, true, "Medium"));
        games.add(new Singleplayer("Mario and Sonic Olympics PC", 39, AgeRating.CHILD, Genre.SPORTS, Platform.PC, false, "Easy"));
        
        games.add(new Multiplayer("FIFA 25", 4, AgeRating.TEEN, Genre.SPORTS, Platform.PC, 4));
        games.add(new Multiplayer("Age of Empires IV", 5, AgeRating.TEEN, Genre.STRATEGY, Platform.PC, 8));
        games.add(new Multiplayer("Dead by Daylight", 6, AgeRating.ADULT, Genre.HORROR, Platform.PC, 5));
        games.add(new Multiplayer("World of Warcraft", 40, AgeRating.ADULT, Genre.RPG, Platform.PC, 40));
        games.add(new Multiplayer("Genshin Impact", 41, AgeRating.TEEN, Genre.RPG, Platform.PC, 4));
        games.add(new Multiplayer("Wizard101", 42, AgeRating.CHILD, Genre.RPG, Platform.PC, 4));
        games.add(new Multiplayer("Phasmophobia", 43, AgeRating.TEEN, Genre.HORROR, Platform.PC, 4));
        games.add(new Multiplayer("Specter", 44, AgeRating.CHILD, Genre.HORROR, Platform.PC, 4));
        games.add(new Multiplayer("Rainbow Six Siege", 45, AgeRating.ADULT, Genre.STRATEGY, Platform.PC, 10));
        games.add(new Multiplayer("Clash Royale PC", 46, AgeRating.TEEN, Genre.STRATEGY, Platform.PC, 2));
        games.add(new Multiplayer("Minecraft Legends", 47, AgeRating.CHILD, Genre.STRATEGY, Platform.PC, 4));
        games.add(new Multiplayer("NBA 2K25 PC", 48, AgeRating.ADULT, Genre.SPORTS, Platform.PC, 4));
        games.add(new Multiplayer("Rocket League PC", 49, AgeRating.TEEN, Genre.SPORTS, Platform.PC, 4));
        games.add(new Multiplayer("Fall Guys", 50, AgeRating.CHILD, Genre.SPORTS, Platform.PC, 60));
        
        //Mobile
        games.add(new Singleplayer("Alto's Odyssey", 7, AgeRating.CHILD, Genre.RPG, Platform.MOBILE, false, "Easy"));
        games.add(new Singleplayer("Plague Inc", 8, AgeRating.TEEN, Genre.STRATEGY, Platform.MOBILE, false, "Medium"));
        games.add(new Singleplayer("Five Nights at Freddy's", 9, AgeRating.TEEN, Genre.HORROR, Platform.MOBILE, true, "Hard"));
        games.add(new Singleplayer("Genshin Impact Mobile", 51, AgeRating.ADULT, Genre.RPG, Platform.MOBILE, true, "Hard"));
        games.add(new Singleplayer("Raid Shadow Legends Solo", 52, AgeRating.TEEN, Genre.RPG, Platform.MOBILE, false, "Medium"));
        games.add(new Singleplayer("Granny", 53, AgeRating.ADULT, Genre.HORROR, Platform.MOBILE, false, "Hard"));
        games.add(new Singleplayer("Eyes The Horror Game", 54, AgeRating.CHILD, Genre.HORROR, Platform.MOBILE, false, "Easy"));
        games.add(new Singleplayer("Plague Inc Evolved", 55, AgeRating.ADULT, Genre.STRATEGY, Platform.MOBILE, false, "Hard"));
        games.add(new Singleplayer("Angry Birds", 56, AgeRating.CHILD, Genre.STRATEGY, Platform.MOBILE, false, "Easy"));
        games.add(new Singleplayer("NBA 2K Mobile", 57, AgeRating.ADULT, Genre.SPORTS, Platform.MOBILE, false, "Hard"));
        games.add(new Singleplayer("FIFA Mobile Solo", 58, AgeRating.TEEN, Genre.SPORTS, Platform.MOBILE, false, "Medium"));
        games.add(new Singleplayer("Subway Surfers", 59, AgeRating.CHILD, Genre.SPORTS, Platform.MOBILE, false, "Easy"));
        
        games.add(new Multiplayer("FIFA Mobile", 10, AgeRating.CHILD, Genre.SPORTS, Platform.MOBILE,2));
        games.add(new Multiplayer("Clash of Clans", 11, AgeRating.TEEN, Genre.STRATEGY, Platform.MOBILE, 50));
        games.add(new Multiplayer("Among Us", 12, AgeRating.CHILD, Genre.STRATEGY,Platform.MOBILE, 10));
        games.add(new Multiplayer("Raid Shadow Legends", 60, AgeRating.ADULT, Genre.RPG, Platform.MOBILE, 20));
        games.add(new Multiplayer("Pokemon GO", 61, AgeRating.TEEN, Genre.RPG, Platform.MOBILE, 20));
        games.add(new Multiplayer("Roblox", 62, AgeRating.CHILD, Genre.RPG, Platform.MOBILE, 100));
        games.add(new Multiplayer("Identity V", 63, AgeRating.ADULT, Genre.HORROR, Platform.MOBILE, 5));
        games.add(new Multiplayer("Dead by Daylight Mobile", 64, AgeRating.TEEN, Genre.HORROR, Platform.MOBILE, 5));
        games.add(new Multiplayer("Among Us Horror Mode", 65, AgeRating.CHILD, Genre.HORROR, Platform.MOBILE, 10));
        games.add(new Multiplayer("Clash of Clans Adult", 66, AgeRating.ADULT, Genre.STRATEGY, Platform.MOBILE, 50));
        games.add(new Multiplayer("Clash Royale", 67, AgeRating.TEEN, Genre.STRATEGY, Platform.MOBILE, 2));
        games.add(new Multiplayer("FIFA Mobile Adult", 68, AgeRating.ADULT, Genre.SPORTS, Platform.MOBILE, 2));
        games.add(new Multiplayer("NBA Live Mobile", 69, AgeRating.TEEN, Genre.SPORTS, Platform.MOBILE, 2));
        games.add(new Multiplayer("Stumble Guys", 70, AgeRating.CHILD, Genre.SPORTS, Platform.MOBILE, 32));
        
        //PlaySation
        games.add(new Singleplayer("God of War", 13, AgeRating.ADULT, Genre.RPG, Platform.PLAYSTATION, true, "Hard"));
        games.add(new Singleplayer("Silent Hill 2", 14, AgeRating.ADULT, Genre.HORROR, Platform.PLAYSTATION, true, "Medium"));        
        games.add(new Singleplayer("EA FC 25", 15, AgeRating.TEEN, Genre.SPORTS, Platform.PLAYSTATION, true, "Medium"));
        games.add(new Singleplayer("Final Fantasy XVI", 71, AgeRating.TEEN, Genre.RPG, Platform.PLAYSTATION, true, "Medium"));
        games.add(new Singleplayer("Sackboy A Big Adventure", 72, AgeRating.CHILD, Genre.RPG, Platform.PLAYSTATION, true, "Easy"));
        games.add(new Singleplayer("Until Dawn", 73, AgeRating.TEEN, Genre.HORROR, Platform.PLAYSTATION, true, "Medium"));
        games.add(new Singleplayer("Coraline The Game", 74, AgeRating.CHILD, Genre.HORROR, Platform.PLAYSTATION, true, "Easy"));
        games.add(new Singleplayer("Horizon Forbidden West", 75, AgeRating.ADULT, Genre.STRATEGY, Platform.PLAYSTATION, true, "Hard"));
        games.add(new Singleplayer("Ghost of Tsushima", 76, AgeRating.TEEN, Genre.STRATEGY, Platform.PLAYSTATION, true, "Medium"));
        games.add(new Singleplayer("Astro Bot", 77, AgeRating.CHILD, Genre.STRATEGY, Platform.PLAYSTATION, false, "Easy"));
        games.add(new Singleplayer("MLB The Show 24", 78, AgeRating.ADULT, Genre.SPORTS, Platform.PLAYSTATION, true, "Hard"));
        games.add(new Singleplayer("Everybody Golf", 79, AgeRating.CHILD, Genre.SPORTS, Platform.PLAYSTATION, false, "Easy"));
        
        games.add(new Multiplayer("NBA 2K25", 16, AgeRating.TEEN, Genre.SPORTS, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("Diablo IV", 17, AgeRating.ADULT, Genre.RPG, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("Predator Hunting Grounds", 18, AgeRating.ADULT, Genre.HORROR, Platform.PLAYSTATION, 5));
        games.add(new Multiplayer("Destiny 2", 80, AgeRating.TEEN, Genre.RPG, Platform.PLAYSTATION, 6));
        games.add(new Multiplayer("Minecraft PS", 81, AgeRating.CHILD, Genre.RPG, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("The Dark Pictures", 82, AgeRating.TEEN, Genre.HORROR, Platform.PLAYSTATION, 5));
        games.add(new Multiplayer("Overcooked PS", 83, AgeRating.CHILD, Genre.HORROR, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("Rainbow Six Siege PS", 84, AgeRating.ADULT, Genre.STRATEGY, Platform.PLAYSTATION, 10));
        games.add(new Multiplayer("Rocket League PS", 85, AgeRating.TEEN, Genre.STRATEGY, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("LittleBigPlanet 3", 86, AgeRating.CHILD, Genre.STRATEGY, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("NBA 2K25 PS Adult", 87, AgeRating.ADULT, Genre.SPORTS, Platform.PLAYSTATION, 4));
        games.add(new Multiplayer("FIFA Junior PS", 88, AgeRating.CHILD, Genre.SPORTS, Platform.PLAYSTATION, 4));
        
        //XBox
        games.add(new Singleplayer("Halo Infinite", 19, AgeRating.TEEN, Genre.STRATEGY, Platform.XBOX, true, "Medium"));
        games.add(new Singleplayer("Alan Wake 2", 20, AgeRating.ADULT, Genre.HORROR, Platform.XBOX, true, "Hard"));
        games.add(new Singleplayer("Fable", 21, AgeRating.TEEN, Genre.RPG, Platform.XBOX, true, "Easy"));
        games.add(new Singleplayer("Fable Adult", 89, AgeRating.ADULT, Genre.RPG, Platform.XBOX, true, "Hard"));
        games.add(new Singleplayer("Ori and the Blind Forest", 90, AgeRating.CHILD, Genre.RPG, Platform.XBOX, true, "Easy"));
        games.add(new Singleplayer("The Medium", 91, AgeRating.TEEN, Genre.HORROR, Platform.XBOX, false, "Medium"));
        games.add(new Singleplayer("Minecraft Dungeons", 92, AgeRating.CHILD, Genre.HORROR, Platform.XBOX, false, "Easy"));
        games.add(new Singleplayer("Halo Infinite Adult", 93, AgeRating.ADULT, Genre.STRATEGY, Platform.XBOX, true, "Hard"));
        games.add(new Singleplayer("Viva Pinata", 94, AgeRating.CHILD, Genre.STRATEGY, Platform.XBOX, false, "Easy"));
        games.add(new Singleplayer("EA FC 25 Xbox", 95, AgeRating.ADULT, Genre.SPORTS, Platform.XBOX, true, "Hard"));
        games.add(new Singleplayer("Tony Hawk Xbox", 96, AgeRating.TEEN, Genre.SPORTS, Platform.XBOX, true, "Medium"));
        games.add(new Singleplayer("Kinect Sports", 97, AgeRating.CHILD, Genre.SPORTS, Platform.XBOX, false, "Easy"));
        
        games.add(new Multiplayer("Rocket League", 22, AgeRating.CHILD, Genre.SPORTS, Platform.XBOX, 4));
        games.add(new Multiplayer("Back 4 Blood", 23, AgeRating.ADULT, Genre.HORROR, Platform.XBOX, 4));
        games.add(new Multiplayer("Gears 5", 24, AgeRating.ADULT, Genre.STRATEGY, Platform.XBOX, 4));
        games.add(new Multiplayer("Diablo IV Xbox", 98, AgeRating.ADULT, Genre.RPG, Platform.XBOX, 4));
        games.add(new Multiplayer("Destiny 2 Xbox", 99, AgeRating.TEEN, Genre.RPG, Platform.XBOX, 6));
        games.add(new Multiplayer("Minecraft Xbox", 100, AgeRating.CHILD, Genre.RPG, Platform.XBOX, 8));
        games.add(new Multiplayer("Evolve Stage 2", 101, AgeRating.TEEN, Genre.HORROR, Platform.XBOX, 5));
        games.add(new Multiplayer("Overcooked Xbox", 102, AgeRating.CHILD, Genre.HORROR, Platform.XBOX, 4));
        games.add(new Multiplayer("Rainbow Six Xbox", 103, AgeRating.TEEN, Genre.STRATEGY, Platform.XBOX, 10));
        games.add(new Multiplayer("Minecraft Legends Xbox", 104, AgeRating.CHILD, Genre.STRATEGY, Platform.XBOX, 4));
        games.add(new Multiplayer("NBA 2K25 Xbox", 105, AgeRating.ADULT, Genre.SPORTS, Platform.XBOX, 4));
        games.add(new Multiplayer("Rocket League Xbox", 106, AgeRating.TEEN, Genre.SPORTS, Platform.XBOX, 4));
        games.add(new Multiplayer("Fall Guys Xbox", 107, AgeRating.CHILD, Genre.SPORTS, Platform.XBOX, 60));
        
        //Nintendo
        games.add(new Singleplayer("Zelda Tears of the Kingdom", 25, AgeRating.CHILD, Genre.RPG, Platform.NINTENDO, true, "Medium"));
        games.add(new Singleplayer("Fire Emblem Engage", 26, AgeRating.TEEN, Genre.STRATEGY, Platform.NINTENDO, true, "Hard"));
        games.add(new Singleplayer("Luigi's Mansion 3", 27, AgeRating.CHILD, Genre.HORROR, Platform.NINTENDO, true, "Easy"));
        games.add(new Singleplayer("Zelda Breath of the Wild", 108, AgeRating.ADULT, Genre.RPG, Platform.NINTENDO, true, "Hard"));
        games.add(new Singleplayer("Pokemon Scarlet", 109, AgeRating.TEEN, Genre.RPG, Platform.NINTENDO, true, "Medium"));
        games.add(new Singleplayer("Outlast Nintendo", 110, AgeRating.ADULT, Genre.HORROR, Platform.NINTENDO, false, "Hard"));
        games.add(new Singleplayer("Alien Isolation Nintendo", 111, AgeRating.TEEN, Genre.HORROR, Platform.NINTENDO, true, "Medium"));
        games.add(new Singleplayer("Fire Emblem Three Houses", 112, AgeRating.ADULT, Genre.STRATEGY, Platform.NINTENDO, true, "Hard"));
        games.add(new Singleplayer("Pikmin 4", 113, AgeRating.CHILD, Genre.STRATEGY, Platform.NINTENDO, false, "Easy"));
        games.add(new Singleplayer("Nintendo Switch Sports Solo", 114, AgeRating.ADULT, Genre.SPORTS, Platform.NINTENDO, false, "Hard"));
        games.add(new Singleplayer("Wii Sports Resort", 115, AgeRating.TEEN, Genre.SPORTS, Platform.NINTENDO, false, "Medium"));
        games.add(new Singleplayer("Ring Fit Adventure", 116, AgeRating.CHILD, Genre.SPORTS, Platform.NINTENDO, false, "Easy"));
        
        games.add(new Multiplayer("Mario Kart 8", 28, AgeRating.CHILD, Genre.SPORTS, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Mario Party Superstars", 29, AgeRating.CHILD, Genre.STRATEGY, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Pokemon Unite", 30, AgeRating.CHILD, Genre.RPG, Platform.NINTENDO, 5));
        games.add(new Multiplayer("Xenoblade Chronicles", 117, AgeRating.ADULT, Genre.RPG, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Pokemon Sword Shield", 118, AgeRating.TEEN, Genre.RPG, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Witch It Nintendo", 119, AgeRating.ADULT, Genre.HORROR, Platform.NINTENDO, 16));
        games.add(new Multiplayer("Devour Nintendo", 120, AgeRating.TEEN, Genre.HORROR, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Splatoon 3 Adult", 121, AgeRating.ADULT, Genre.STRATEGY, Platform.NINTENDO, 8));
        games.add(new Multiplayer("Splatoon 3", 122, AgeRating.TEEN, Genre.STRATEGY, Platform.NINTENDO, 8));
        games.add(new Multiplayer("Nintendo Switch Sports", 123, AgeRating.ADULT, Genre.SPORTS, Platform.NINTENDO, 4));
        games.add(new Multiplayer("Mario Kart 8 Teen", 124, AgeRating.TEEN, Genre.SPORTS, Platform.NINTENDO, 4));
        
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