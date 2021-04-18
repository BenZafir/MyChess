
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MovesTest {
    LinkedList<Enums.wayOfMove> wayOfMoves = new LinkedList<Enums.wayOfMove>();
    public MovesTest()
    {
        wayOfMoves.add(Enums.wayOfMove.row);
        wayOfMoves.add(Enums.wayOfMove.colm);
    }

    Moves move = new Moves( Enums.direction.whiteSide,wayOfMoves, 1,1);
    @org.junit.jupiter.api.Test
    void get_direction() {
        assert (move.get_direction()== Enums.direction.whiteSide);
    }

    @org.junit.jupiter.api.Test
    void get_wayOfMove() {
        assert (move.get_wayOfMove()== wayOfMoves);
    }

    @org.junit.jupiter.api.Test
    void get_maxSteps() {
        assert (move.get_maxSteps()==1);
    }

    @org.junit.jupiter.api.Test
    void get_minSteps() {
        assert (move.get_minSteps()==1);
    }
}