import java.util.Random;

public class Board
{
    private final Player[] players;
    private final Match[] matches;

    /**
     * Instantiates a new Board.
     *
     * @param players the number of players (must be a power of 2)
     */
    public Board(int players)
    {
        this.players = new Player[players];
        this.matches = new Match[players / 2];
        for (int i = 0; i < players; i++)
        {
            this.players[i] = new Player();
        }

        for (int i = 0; i < players / 2; i++)
        {
            Player p1 = getMatchablePlayer();
            Player p2 = getMatchablePlayer();

            matches[i] = new Match(p1, p2);
        }
    }


    public Board(Board prevBoard)
    {
        this.players = prevBoard.getPlayers();
        this.matches = new Match[prevBoard.getMatches().length / 2];
        for (int i = 0; i < prevBoard.getMatches().length; i +=2)
        {
            this.matches[i / 2] = new Match(prevBoard.getMatches()[i].getWinner(), prevBoard.getMatches()[i + 1].getWinner());
        }
    }

    private Player getMatchablePlayer()
    {
        int randIndex = new Random().nextInt(this.players.length);
        Player extractedPlayer = this.players[randIndex];
        while (extractedPlayer.isPaired())
        {
            if (randIndex == this.players.length - 1)
            {
                randIndex = 0;
            } else
            {
                randIndex++;
            }
            extractedPlayer = this.players[randIndex];
        }
        extractedPlayer.setPaired(true);
        return extractedPlayer;
    }

    public Player[] getPlayers()
    {
        return players;
    }

    public Match[] getMatches()
    {
        return matches;
    }
}
