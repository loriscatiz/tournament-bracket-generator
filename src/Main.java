//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        do
        {
            Player.resetCount();
            int participants = InputHandler.getValidNumberOfParticipants("How many participants in this tournament?");
            Board board = new Board(participants);
            Engine.playTournament(board);
        } while (InputHandler.getBooleanAnswer("Do you want to play again?"));
    }
}