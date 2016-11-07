/*********************************************************************************
* (Game: pick four cards) Write a program that picks four cards from a cards of 52*
* cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,   *
* 12, and 11, respectively.The program should display the number of picks that   *
* yields the sum of 24.                                                          *
*********************************************************************************/
public class CardTrick
{

    /** Main method */
    public static void main(String[] args) 
    {
        int[] cards; // Create array

        do
        {
            // Initialize cards
            cards = new int[52];

            // Pick four cards
            pickFourCards(cards);     

        } while (sum(cards) != 24);
        
        // Display the number of picks that yields the sum 24
        print(cards);
    }

    /** pickFourCards randomly picks four cards */
    public static void pickFourCards(int[] cards) 
    {
        for (int i = 0; i < 4; i++)
        {
            cards[(int)(Math.random() * 52)]++;
        }
    }

    /** sum computes the sum of cards picked */
    public static int sum(int[] cards)
    {
        int sum = 0;
        for (int i = 0; i < cards.length; i++) 
        {
            sum += ((i + 1) % 13) * cards[i]; 
        }
        return sum;
    }

    /** print displays the number of picks */
    public static void print(int[] cards) 
    {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

        System.out.print("The number of picks that yields the sum of 24: ");
        for (int i = 0; i < cards.length; i++)
        {
            if (cards[i] > 0)
                System.out.print(ranks[i % 13] + " ");
        }
		System.out.println();
	}
}