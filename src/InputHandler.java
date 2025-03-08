import java.util.Scanner;

public class InputHandler
{

    public static int getValidNumberOfParticipants(String prompt) throws NumberFormatException, InvalidNumberOfPlayersException
    {
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            String input = scanner.nextLine();
            int retvalue;
            try
            {
                retvalue = Integer.parseInt(input);
                if (retvalue <= 0 || !isPowerOfTwo(retvalue))
                {
                    throw new InvalidNumberOfPlayersException("Number must be a positive power of 2");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("You must enter a number");
                continue;
            }
            catch (InvalidNumberOfPlayersException e)
            {
                System.out.println(e.getMessage());
                continue;
            }

            return retvalue;
        }
    }

    private static boolean isPowerOfTwo(int num)

    {
        if (num == 2)
        {
            return true;
        } else if (num % 2 != 0)
        {
            return false;
        }
        return isPowerOfTwo(num / 2);
    }


    public static boolean getBooleanAnswer(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print(prompt + " [Y] / [N] ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Y"))
            {
                return true;
            }
            if (input.equals("N"))
            {
                return false;
            }
            System.out.println("Invalid answer");
        }
    }
}
