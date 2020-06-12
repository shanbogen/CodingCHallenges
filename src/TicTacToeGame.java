import java.util.Random;

public class TicTacToeGame {

    public static void main(String[] args) {

        TicTacToeBoard testBoard = new TicTacToeBoard();

        //Generate between 1 and 9 random valid moves, in a pretty stupid brute force way
        //If someone wins in the process, return true
        //If the board gets filled and nobody wins, return false
        int validMoves = 0;
        boolean winner = false;
        Random r = new Random();

        //Start with Player "2", and alternate between them
        int curPlayer = 2;

        while(validMoves < 9 && !winner) {
            if (testBoard.addMove(r.nextInt(2),
                    r.nextInt(2),
                    curPlayer)) {
                System.out.println("Made a move");

                if (testBoard.hasWinner()) {
                    winner = true;
                } else {
                    validMoves++;
                    if (curPlayer == 2) curPlayer--;
                    else curPlayer++;
                }
            }

        }

        System.out.println(winner);


    }

}
