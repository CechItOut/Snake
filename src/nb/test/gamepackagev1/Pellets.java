package nb.test.gamepackagev1;
import java.awt.*;

public class Pellets 
{//begin class
    
    private int x = 400;
    private int y = 400;
    
    
    
    public Pellets(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
     public int getY()
  {
      return y;
  }
  
  public void setY(int newY)
  {
      y = newY;
  }
  public void show(Graphics g)
  {// start method show
      g.setColor(Color.BLUE);
        g.fillRect(x,y,10,10);
        
       
  }//end show
}//end class