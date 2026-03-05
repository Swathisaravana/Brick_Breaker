package model.kce.ac.in;



public class GameBoard {

    public char[][] board = new char[7][7];
    public int ballRow = 6;
    public int ballCol = 3;
    public int lives = 5;

    public void initializeBoard() {

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0 || j==0 || j==6){
                    board[i][j] = 'w';
                }
                else if(i==6){
                    board[i][j] = 'g';
                }
                else{
                    board[i][j] = ' ';
                }
            }
        }

        board[2][2] = '1';
        board[2][3] = '1';
        board[2][4] = '1';
        board[3][2] = '1';
        board[3][3] = '1';
        board[3][4] = '1';

        board[ballRow][ballCol] = 'o';
    }

    public void printBoard(){

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ball count: " + lives);
    }
}