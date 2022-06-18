class Square {

    static int sqX(int sqNum) {
        return sqNum % 8;
    }

    static int sqY(int sqNum) {
        return (sqNum - sqNum % 8)/8;
    }

    static char color(Board board, int sqNum) {
        if (board.squares[sqNum] == null) return 'n';
        return board.squares[sqNum].charAt(0);
    }

    static int[] row(int sqNum) {
        int[] row = new int[7];
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int i = 0;
        for (; i < 8; i++) {
            if (i == x) break;
            row[i] = 8 * y + i;
        }
        i++;
        for (; i < 8; i++) {
            row[i-1] = 8 * y + i;
        }

        return row;
    }

    static int rowMax(int sqNum) {
        return 8 * Square.sqY(sqNum) + 7;
    }

    static int rowMin(int sqNum) {
        return 8 * Square.sqY(sqNum) + 0;
    }

    static int[] col(int sqNum) {
        int[] col = new int[7];
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int i = 0;
        for (; i < 8; i++) {
            if (i == y) break;
            col[i] = 8 * i + x;
        }
        i++;
        for (; i < 8; i++) {
           col[i-1] = 8 * i + x;
        }
        return col;
    }

    static int colMax(int sqNum) {
        return 8 * 7 + Square.sqX(sqNum);
    }

    static int colMin(int sqNum) {
        return 8 * 0 + Square.sqX(sqNum);
    }

    static int[] rd(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int lowerLen = Math.min(x, y);
        int upperLen = Math.min(8-x, 8-y);
        int[] rd = new int[lowerLen + upperLen];
        for (int i = 1; i <= lowerLen; i++) {
            rd[i-1] = 8 * (y-i) + (x-i);
        }
        for (int i = 1; i <= upperLen; i++) {
            rd[lowerLen + i - 1] = 8 * (y+i) + (x+i);
        }
        return rd;
    }

    static int rdMax(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int upperLen = Math.min(8-x, 8-y);
        return 8 * (y + upperLen) + (x + upperLen);
    }

    static int rdMin(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int lowerLen = Math.min(x, y);
        return 8 * (y - lowerLen) + (x - lowerLen);
    }

     static int[] ld(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int lowerLen = Math.min(8-x, y);
        int upperLen = Math.min(x, 8-y);
        int[] ld = new int[lowerLen + upperLen];
        for (int i = 1; i <= lowerLen; i++) {
            ld[i-1] = 8 * (y-i) + (x+i);
        }
        for (int i = 1; i <= upperLen; i++) {
            ld[lowerLen + i - 1] = 8 * (y+i) + (x-i);
        }
        return ld;
    }

    static int ldMax(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int upperLen = Math.min(x, 8-y);
        return 8 * (y + upperLen) + (x - upperLen);         
    }

    static int ldMin(int sqNum) {
        int x = Square.sqX(sqNum);
        int y = Square.sqY(sqNum);
        int upperLen = Math.min(x, 8-y);
        return 8 * (y - upperLen) + (x + upperLen);         
    }

}
