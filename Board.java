import java.util.*;

class Board {
    String[] squares = new String[64];
    //a1 - index 0
    //a2 - index 1
    //...
    //b1 - index 8
    //...
    //h8 - index 63
    HashMap<Integer, String> whitePieces = new HashMap<>();
    HashMap<Integer, String> blackPieces = new HashMap<>();

    public void addWhite(int square, String piece) {
        this.squares[square] = "w" + piece;
        this.whitePieces.put(square, piece);
    }

    public void addBlack(int square, String piece) {
        this.squares[square] = "b" + piece;
        this.blackPieces.put(square, piece);
    }

    public void removePiece(int square) {
        char color = Square.color(this, square);
        if (color == 'w') {
            this.squares[square] = null;
            this.whitePieces.remove(square);
        }
        else if (color == 'b') {
            this.squares[square] = null;
            this.blackPieces.remove(square);
        }
    }

    public void setup() {
        this.addWhite(0, "r");
        this.addWhite(7, "r");
        this.addWhite(1, "n");
        this.addWhite(6, "n");
        this.addWhite(2, "b");
        this.addWhite(3, "q");
        this.addWhite(4, "k");

        this.addWhite(8, "p");
        this.addWhite(9, "p");
        this.addWhite(10, "p");
        this.addWhite(11, "p");
        this.addWhite(12, "p");
        this.addWhite(13, "p");
        this.addWhite(14, "p");
        this.addWhite(15, "p");

        this.addBlack(63, "r");
        this.addBlack(56, "r");
        this.addBlack(62, "n");
        this.addBlack(57, "n");
        this.addBlack(61, "b");
        this.addBlack(58, "b");
        this.addBlack(59, "q");
        this.addBlack(60, "k");

        this.addBlack(55, "p");
        this.addBlack(54, "p");
        this.addBlack(53, "p");
        this.addBlack(52, "p");
        this.addBlack(51, "p");
        this.addBlack(50, "p");
        this.addBlack(49, "p");
        this.addBlack(48, "p");
    }

}
