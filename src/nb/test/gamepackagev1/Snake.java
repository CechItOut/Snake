package nb.test.gamepackagev1;
import java.awt.*;

public class Snake 
{// start class
    private int x = 200;
    private int y = 200;
    
    
  public Snake(int x, int y)
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
      g.setColor(Color.BLACK);
        g.fillOval(x,y,10,10);
        
       
  }// end show method
}//end class