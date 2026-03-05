package service.kce.ac.in;

import model.kce.ac.in.GameBoard;

public class GameService {

    GameBoard game;

    public GameService(GameBoard game){
        this.game = game;
    }

    public void moveStraight(){

        int r = game.ballRow - 1;
        int c = game.ballCol;

        while(r > 0){

            if(game.board[r][c] == '1'){
                game.board[r][c] = ' ';
                break;
            }

            r--;
        }

        game.lives--;
    }

    public void moveLeft(){

        int r = game.ballRow - 1;
        int c = game.ballCol - 1;

        while(r > 0 && c > 0){

            if(game.board[r][c] == '1'){
                game.board[r][c] = ' ';
                break;
            }

            r--;
            c--;
        }

        game.lives--;
    }

    public void moveRight(){

        int r = game.ballRow - 1;
        int c = game.ballCol + 1;

        while(r > 0 && c < 6){

            if(game.board[r][c] == '1'){
                game.board[r][c] = ' ';
                break;
            }

            r--;
            c++;
        }

        game.lives--;
    }
}