class Board {
    String[] squares = new String[64];
    //a1 - index 0
    //a2 - index 1
    //...
    //b1 - index 8
    //...
    //h8 - index 63

    public void setup() {
        this.squares[0] = "wr";
        this.squares[7] = "wr";
        this.squares[1] = "wn";
        this.squares[6] = "wn";
        this.squares[2] = "wb";
        this.squares[5] = "wb";
        this.squares[3] = "wq";
        this.squares[4] = "wk";

        this.squares[8] = "wp";
        this.squares[9] = "wp";
        this.squares[10] = "wp";
        this.squares[11] = "wp";
        this.squares[12] = "wp";
        this.squares[13] = "wp";
        this.squares[14] = "wp";
        this.squares[15] = "wp";

        this.squares[63] = "br";
        this.squares[56] = "br";
        this.squares[62] = "bn";
        this.squares[57] = "bn";
        this.squares[61] = "bb";
        this.squares[58] = "bb";
        this.squares[59] = "bq";
        this.squares[60] = "bk";

        this.squares[55] = "bp";
        this.squares[54] = "bp";
        this.squares[53] = "bp";
        this.squares[52] = "bp";
        this.squares[51] = "bp";
        this.squares[50] = "bp";
        this.squares[49] = "bp";
        this.squares[48] = "bp";
    }

}
