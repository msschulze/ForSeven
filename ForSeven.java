
/**
 * Program counts up to seven and then down to seven.
 *
 * @author (Ms. Schulze)
 * @version (1.2)
 */
public class ForSeven
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        for (int i = 0; i <= 7; i++)
        {
            System.out.println(i);
        }
        for (int i = 6; i >= 0; i--)
        {
            System.out.println(i);
        }
    }
}
