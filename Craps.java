package Package_3;

import java.util.Random;

public class Craps {

    private static final Random randomNumbers = new Random();

    private enum Status {CONTINUE, WON, LOST}

    ;

    private static final int TWO = 2;
    private static final int TREE = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rolDice();

        switch (sumOfDice) {
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;
            case TWO:
            case TREE:
            case TWELVE:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rolDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;

        }
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }

    private static void Switch(int sumOfDice) {
    }

    public static int rolDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.println("player rolled " + die2 + " and " + die1 + " = " + sum);

        return sum;

    }
}
/*You roll two dice. Each die has six faces, which contain one, two, three, four, five and
six spots, respectively. After the dice have come to rest, the sum of the spots on the two
upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
you must continue rolling the dice until you “make your point” (i.e., roll that same
point value). You lose by rolling a 7 before making your point.

 */


