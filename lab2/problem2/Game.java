package problem2;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Board board = new Board();
        board.setup();

        Scanner sc = new Scanner(System.in);

        while(true) {

            board.printBoard();

            System.out.println("Enter move: row1 col1 row2 col2");

            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            
            if(r1 < 0 || r2 < 0 || c1 < 0 || c2 < 0) {
            	System.out.println("Illegal position!");
            	continue;
            } 
            if(r1 > 7 || r2 > 7 || c1 > 7 || c2 > 7) {
            	System.out.println("Illegal position!");
            	continue;
            }
            
            board.movePiece(
                new Position(r1,c1),
                new Position(r2,c2)
            );
        }
    }
}
//1 3 2 3
//2 3 3 3
//3 3 4 3
//4 3 5 3
//6 2 5 3
//0 3 5 3

