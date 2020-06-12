//An unnecessary class to represent a tic-tac-toe board!

public class TicTacToeBoard {

    private int[][] board;

    public TicTacToeBoard() {
        this.board = new int[3][3];
    }

    //Returns true if move was added successfully
    public boolean addMove(int xCoord, int yCoord, int player) {

        System.out.println("Attempted to add move at " + xCoord + ',' + yCoord);

        if (this.board[xCoord][yCoord] == 0) {
            this.board[xCoord][yCoord] = player;
            return true;
        }
        return false;
    }

    public boolean hasWinner() {

        //Horizontal ways to win
        int[][][] validSolutions = {{{0,0}, {0,1}, {0,2}},
                {{1,0}, {1,1}, {1,2}},
                {{2,0}, {2,1}, {2,2}},
                //Vertical ways to win
                {{0,0}, {1,0}, {2,0}},
                {{0,2}, {1,2}, {2,2}},
                {{0,1}, {1,1}, {2,1}},
                //Diagonal ways to win
                {{0,0}, {1,1}, {2,2}},
                {{0,2}, {1,1}, {2,0}}};

        //I hate this
        for (int player = 1; player < 3; player++) {
            for (int i = 0; i < 8; i++) {
                int[][] validSolution = validSolutions[i];
                if (this.board[validSolution[0][0]][validSolution[0][1]] == player &
                        this.board[validSolution[1][0]][validSolution[1][1]] == player &
                        this.board[validSolution[2][0]][validSolution[2][1]] == player) {
                    return true;
                }
            }
        }

        return false;
    }

    public void print() {
        return;
    }



}
