import java.util.LinkedList;

public class King extends Tools
{
    LinkedList<Enums.wayOfMove> wayOfMoves = new LinkedList<Enums.wayOfMove>();
    Moves kingMove;
    public King(Enums.toolColor color)
    {
        wayOfMoves.add(Enums.wayOfMove.row);
        wayOfMoves.add(Enums.wayOfMove.colm);
        wayOfMoves.add(Enums.wayOfMove.diagonal);
        this.color = color;
        kingMove = new Moves(Enums.direction.allSide,wayOfMoves,1,1);


    }
    public void get_how_can_move()
    {
        kingMove = new Moves(Enums.direction.allSide,wayOfMoves,1,1);
    }

}
