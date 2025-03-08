import java.util.Random;

public class Player
{
    private static final String[] FIRST_NAMES = {"Pippo", "Pluto"};
    private static final String[] LAST_NAMES = {"Rossi", "Bianchi"};
    private static final int MAX_SKILL_LEVEL = 100;
    private static int playerCount = 0;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int skillLevel;

    private boolean isPaired;

    public Player()
    {
        this.id = ++playerCount;
        this.firstName = FIRST_NAMES[new Random().nextInt(FIRST_NAMES.length)];
        this.lastName = LAST_NAMES[new Random().nextInt(LAST_NAMES.length)];
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
        return this.firstName + " " + this.lastName + " skill level: " + this.skillLevel + " " + "id: " + this.id;
    }
}
