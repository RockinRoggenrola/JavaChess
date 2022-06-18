import java.util.ArrayList;

class CoveredSquares {

    static int[] r(Board board, int square) {
        char color = Square.color(board, square);
        int x = Square.sqX(square);
        int y = Square.sqY(square);
        int rowMax = Square.rowMax(square);
        int rowMin = Square.rowMin(square);
        int colMax = Square.colMax(square);
        int colMin = Square.colMin(square);
        ArrayList<Integer> squares = new ArrayList<Integer>();
        // row
        for (int i = 0; i <= 7; i++) {
            int currentSq = rowMin + i;
            if (currentSq == square) continue;
            squares.add(currentSq);
            if (Square.color(board, currentSq) != 'n') break;
        }
        // column
        for (int i = 0; i <= 7; i++) {
            int currentSq = colMin + 8 * i;
            if (currentSq == square) continue;
            squares.add(currentSq);
            if (Square.color(board, currentSq) != 'n') break;
        }

        int length = squares.size();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = squares.get(i);
        }

        return temp;
    }

    static int[] n(Board board, int square) {
        char color = Square.color(board, square);
        int x = Square.sqX(square);
        int y = Square.sqY(square);
        ArrayList<Integer> squares = new ArrayList<Integer>();

        squares.add(8 * (y+2) + (x+1));
        squares.add(8 * (y+2) + (x-1));
        squares.add(8 * (y-2) + (x+1));
        squares.add(8 * (y-2) + (x-1));
        squares.add(8 * (y+1) + (x+2));
        squares.add(8 * (y+1) + (x-2));
        squares.add(8 * (y-1) + (x+2));
        squares.add(8 * (y-1) + (x-2));

        for (int i = 0; i < 8; i++) {
            int currentSq = squares.get(i);
            if (currentSq > 63 || currentSq < 0) squares.remove(i);
        }

        int length = squares.size();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = squares.get(i);
        }

        return temp;
    }

    static int[] b(Board board, int square) {
        char color = Square.color(board, square);
        int x = Square.sqX(square);
        int y = Square.sqY(square);
        int rdMax = Square.rdMax(square);
        int rdMin = Square.rdMin(square);
        int ldMax = Square.ldMax(square);
        int ldMin = Square.ldMin(square);
        ArrayList<Integer> squares = new ArrayList<Integer>();

        // right diagonal
        for (int i = 0; i <= Square.sqX(rdMax) - Square.sqX(rdMin); i++) {
            int currentSq = rdMin + 9 * i;
            if (currentSq == square) continue;
            squares.add(currentSq);
            if (Square.color(board, currentSq) != 'n') break;
        }
        // left diagonal
        for (int i = 0; i <= Square.sqX(ldMax) - Square.sqX(ldMin); i++) {
            int currentSq = ldMin + 7 * i;
            if (currentSq == square) continue;
            squares.add(currentSq);
            if (Square.color(board, currentSq) != 'n') break;
        }

        int length = squares.size();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = squares.get(i);
        }


        return temp;
    }

    static int[] q(Board board, int square) {
        int[] rookSquares = CoveredSquares.r(board, square); 
        int[] bishopSquares = CoveredSquares.b(board, square);
        int rookLen = rookSquares.length;
        int bishopLen = bishopSquares.length;
        int[] temp = new int[rookLen + bishopLen];

        for (int i = 0; i < rookLen; i++) {
            temp[i] = rookSquares[i];
        }
        for (int i = 0; i < bishopLen; i++) {
            temp[rookLen+i] = bishopSquares[i];
        }

        return temp;
    }

    static int[] k(Board board, int square) {
        char color = Square.color(board, square);
        int x = Square.sqX(square);
        int y = Square.sqY(square);
        ArrayList<Integer> squares = new ArrayList<Integer>();

        squares.add(8 * (y+1) + (x+1));
        squares.add(8 * (y+1) + (x-1));
        squares.add(8 * (y-1) + (x+1));
        squares.add(8 * (y-1) + (x-1));
        squares.add(8 * (y+1) + (x+1));
        squares.add(8 * (y+1) + (x-1));
        squares.add(8 * (y-1) + (x+1));
        squares.add(8 * (y-1) + (x-1));

        for (int i = 0; i < 8; i++) {
            int currentSq = squares.get(i);
            if (currentSq > 63 || currentSq < 0) squares.remove(i);
        }

        int length = squares.size();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = squares.get(i);
        }

        return temp;
    }

    static int[] p(Board board, int square) {
        char color = Square.color(board, square);
        int x = Square.sqX(square);
        int y = Square.sqY(square);
        int newY;
        ArrayList<Integer> squares = new ArrayList<Integer>();
        if (color == 'w') newY = y+1;
        else newY = y-1;
        if (x == 0) squares.add(8 * newY + 1);
        else if (x == 7) squares.add(8 * newY + 6);
        else {
            squares.add(8 * newY + (x+1));
            squares.add(8 * newY + (x-1));
        }

        int length = squares.size();
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = squares.get(i);
        }

        return temp;
    }

}
