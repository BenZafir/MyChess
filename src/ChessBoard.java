public class ChessBoard
{

    final int numOfRows = 8;
    final int numOfColm = 8;
    Enums.toolColor turn;

    private int[][] squares;

    // build a new default board 8X8
    public ChessBoard()
    {
        squares = new int[numOfRows][numOfColm];

    }
    // build a new custom board rowsXcolms
    public ChessBoard(int rows, int colms)
    {
        squares = new int[rows][colms];
    }
    //set position for new game
    public void set_new_game()
    {



    }
    //return the numbers of rows
    public int get_num_of_rows()
    {
        return numOfRows;
    }
    //return the numbers of colms
    public int get_num_of_colms()
    {
        return numOfColm;
    }

}





