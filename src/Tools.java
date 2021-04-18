
import java.util.LinkedList;

public abstract class Tools
{
    Enums.kindOfTool ToolKind;
    boolean isAlive;
    Enums.toolColor color;
   String[] legalMoves;

   public Tools()
   {
       isAlive = true;
       color = Enums.toolColor.white;
   }

   public void set_kind(Enums.kindOfTool kind)
   {
       ToolKind =  kind;

   }

   public abstract void get_how_can_move();


}
