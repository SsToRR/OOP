package problem2;

public class Board {

    protected Piece[][] board = new Piece[8][8];

    public void setup() {

        board[0][0] = new Rook(new Position(0,0),"black");
        board[0][1] = new Horse(new Position(0,1),"black");
        board[0][2] = new Bishop(new Position(0,2),"black");
        board[0][3] = new Queen(new Position(0,3),"black");
        board[0][4] = new King(new Position(0,4),"black");
        board[0][5] = new Bishop(new Position(0,5),"black");
        board[0][6] = new Horse(new Position(0,6),"black");
        board[0][7] = new Rook(new Position(0,7),"black");

        for(int i = 0; i < 8; i++)
            board[1][i] = new Pawn(new Position(1,i),"black");

        for(int i = 0; i < 8; i++)
            board[6][i] = new Pawn(new Position(6,i),"white");

        board[7][0] = new Rook(new Position(7,0),"white");
        board[7][1] = new Horse(new Position(7,1),"white");
        board[7][2] = new Bishop(new Position(7,2),"white");
        board[7][3] = new Queen(new Position(7,3),"white");
        board[7][4] = new King(new Position(7,4),"white");
        board[7][5] = new Bishop(new Position(7,5),"white");
        board[7][6] = new Horse(new Position(7,6),"white");
        board[7][7] = new Rook(new Position(7,7),"white");
    }

    public void printBoard() {

        for(int r=0;r<8;r++) {

            for(int c=0;c<8;c++) {

                if(board[r][c]==null)
                    System.out.print(". ");
                else
                    System.out.print(symbol(board[r][c])+" ");
            }

            System.out.println();
        }
    }

    private char symbol(Piece p) {

        if(p instanceof Pawn) return 'P';
        if(p instanceof Rook) return 'R';
        if(p instanceof Horse) return 'H';
        if(p instanceof Bishop) return 'B';
        if(p instanceof Queen) return 'Q';
        if(p instanceof King) return 'K';

        return '?';
    }

    public void movePiece(Position from, Position to) {

        Piece p = board[from.row][from.col];

        if(p==null){
            System.out.println("No piece there");
            return;
        }

        if(!p.isLegalMove(to, board)){
            System.out.println("Illegal move");
            return;
        }

        Piece target = board[to.row][to.col];

        if(target != null && target.getColor().equals(p.getColor())){
            System.out.println("Cannot capture own piece");
            return;
        }

        board[to.row][to.col] = p;
        board[from.row][from.col] = null;

        p.setPosition(to);

        System.out.println("Move successful");
    }
}

