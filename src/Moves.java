import java.util.LinkedList;

public class Moves
{
    private Enums.direction direction;
    private LinkedList<Enums.wayOfMove>wayOfMove;
    private int maxSteps;
    private int minSteps;

    public Moves(Enums.direction direction,LinkedList<Enums.wayOfMove>wayOfMove,int maxSteps,int minSteps)
    {
        this.direction = direction;
        this.wayOfMove =wayOfMove;
        this.maxSteps = maxSteps;
        this.minSteps = minSteps;
    }
    public Enums.direction get_direction()
    {



        return direction;
    }
    public LinkedList<Enums.wayOfMove> get_wayOfMove()
    {
        return wayOfMove;
    }
    public int get_maxSteps()
    {
        return maxSteps;
    }
    public int get_minSteps()
    {
        return minSteps;
    }
}



