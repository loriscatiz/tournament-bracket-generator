public class Engine
{
    public static void playTournament(Board board)
    {
        switch (board.getMatches().length)
        {
            case 2:
                System.out.println("Semifinals");
                break;
            case 1:
                System.out.println("Final match");
                break;
            default:
                System.out.println("Round of " + board.getMatches().length * 2);

        }

        for (Match match : board.getMatches())
        {
            System.out.println(match);
        }
        if (board.getMatches().length == 1)
        {
            System.out.println(board.getMatches()[0].getWinner() + " wins the tournament");
            return;
        }
        Board nextRound = new Board(board);
        playTournament(nextRound);
    }
}
