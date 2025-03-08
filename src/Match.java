import java.util.Random;

public class Match
{
    private final Player playerOne;
    private final Player playerTwo;
    private final Player winner;


    public Match(Player playerOne, Player playerTwo)
    {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.winner = play();
    }

    private Player play()
    {
        int totalSkillPoints = playerOne.getSkillLevel() + playerTwo.getSkillLevel();
        int[] range = new int[totalSkillPoints];
        for(int i = 0; i < playerOne.getSkillLevel(); i++)
        {
            range[i] = 1;
        }
        for (int i = playerOne.getSkillLevel(); i < totalSkillPoints; i++)
        {
            range[i] = 2;
        }
        int extraction = new Random().nextInt(totalSkillPoints);
        switch (range[extraction])
        {
            case 1:
                return playerOne;
            case 2:
                return playerTwo;
        }



        return playerTwo;
    }

    public Player getWinner()
    {
        return winner;
    }

    @Override
    public String toString()
    {
        return "\n" + playerOne.toString() + "\nVS\n" + playerTwo.toString() + "\n" + winner + " wins the match \n\n" ;
    }
}
