package main.kce.ac.in;


import java.util.Scanner;

import model.kce.ac.in.GameBoard;
import service.kce.ac.in.GameService;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameBoard board = new GameBoard();
        board.initializeBoard();

        GameService service = new GameService(board);

        while(board.lives > 0){

            board.printBoard();

            System.out.println("Enter Command (St / Lt / Rt): ");
            String cmd = sc.next();

            if(cmd.equalsIgnoreCase("St")){
                service.moveStraight();
            }
            else if(cmd.equalsIgnoreCase("Lt")){
                service.moveLeft();
            }
            else if(cmd.equalsIgnoreCase("Rt")){
                service.moveRight();
            }
            else{
                System.out.println("Invalid command");
            }
        }

        System.out.println("Game Over");
    }
}
