import java.util.Random;

public class Player
{
    private static final String[] USERNAMES = {"Rick Sanchez", "Goku", "Mickey Mouse", "Minnie Mouse", "Donkey Kong", "Corvo Attano", "Batman", "Yoshi", "Shrek", "Waluigi", "Spongebob", "Iron Man", "Hulk", "Voldemort", "Gandalf", "Princess Peach", "Thanos", "Optimus Prime",};
    private static final int MAX_SKILL_LEVEL = 100;
    private static int playerCount = 0;
    private final int id;
    private final String username;
    private final int skillLevel;

    private boolean isPaired;

    public Player()
    {
        this.id = ++playerCount;
        this.username = USERNAMES[new Random().nextInt(USERNAMES.length)];
        this.skillLevel = new Random().nextInt(MAX_SKILL_LEVEL) + 1;
        this.isPaired = false;
    }


    public int getSkillLevel()
    {
        return skillLevel;
    }

    public boolean isPaired()
    {
        return isPaired;
    }

    public void setPaired(boolean paired)
    {
        isPaired = paired;
    }

    @Override
    public String toString()
    {
        return this.username + "(" + this.skillLevel + ")" + " id: " + this.id;
    }

    public static void resetCount()
    {
        playerCount = 0;
    }
}
