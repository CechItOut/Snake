//Daniel Rossano
package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.*;


public class NBTestGamePackageV1 extends DrawableAdapter 
{ //begin class  
    
    
    static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Snake by Daniel Rossano");
    static Snake bob = new Snake(250,250);
    static Pellets joe = new Pellets((int)(Math.random() * 490),(int)(Math.random()*490));
   
    
static int count = 0;
static int score = 0;
static String name = "";
static int directionX = 10;
static int directionY = 0;
static Snake[] body = new Snake[61];
static Boolean gameover = false;





    public static void main(String[] args) 
    {//begin main method
          showGameBoard(gb);
         JOptionPane.showMessageDialog(null, "Welcome to Snake. \nUse the "
                 + "arrows on screen to control the snake's direction."
              + "\nYour goal is to guide the snake to as many blue pellets as "
                 + "possible. \nBe sure not to run into the walls! \nYou have "
                + "60 seconds to get as many pellets as possible. Good luck!");
         name = JOptionPane.showInputDialog("Enter your name");
 

        
        
    for(int i = 0; i<body.length;i++)
            {
                body[i] = new Snake(bob.getX()-i*10,bob.getY());
            }
        
    
    
    }//end main method
    
    
    public void draw(Graphics g)
    {//begin draw
    
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);
        
        
        g.setColor(Color.BLACK);
        g.drawString(name, 235, 75);
        g.drawString("Timer: " + count, 200, 50);
        g.drawString("Score: " + score, 275,50);

        
        bob.show(g);
        joe.show(g);
        
       //only show the necessary parts of the snake, piece by piece.
            if (score>=10)
            {
            for(int i = 0;i<5;i++)
            {
                body[i].show(g);
                
            }
            }
            
            if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].show(g);
                
            }
            }
            
            if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].show(g);
                
            }
            }
            
            if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].show(g);
                
            }
            }
            
            if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].show(g);
                
            }
            }
            if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].show(g);
                
            }
            }
        
         
       
    }// end draw
    
    public void rightButton()
    {//begin rightbutton method
        directionX = 10;
        directionY = 0;
        int currentX = bob.getX();
        bob.setX(currentX + directionX);
        
        if (score>=10)
        {
        for(int i = 0; i<5;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
            }   
        }
        
        if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        
        if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        
        if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
        if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()-i*10);
                
            }
            }
    }//end rightbutton method
    
    public void downButton()
    {//begin downbutton method
        directionX = 0;
        directionY = 10;
        int currentY = bob.getY();
        bob.setY(currentY + directionY);
        
        if (score>=10)
        {
        for(int i = 0; i<5;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
            }   
        }
        
        if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        
        if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()-i*10);
                
            }
            }
        
    }//end downbutton method
    
    public void leftButton()
            {//begin leftbutton method
                directionX = -10;
                directionY = 0;
               int currentX = bob.getX();
               bob.setX(currentX + directionX);
               
               if (score>=10)
               {
               for(int i = 0; i<5;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
            }
               }
               
               if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               
               if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].setY(bob.getY());
                body[i].setX(bob.getX()+i*10);
                
            }
            }
               
               
            }//end leftbutton method
    
 public void upButton()
    {//begin upbutton method
        directionX = 0;
        directionY = -10;
        
        int currentY = bob.getY();
        bob.setY(currentY + directionY);
        
        if (score>=10)
        {
        for(int i = 0; i<5;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
            }               
        }
        
        if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        
        if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
        if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].setX(bob.getX());
                body[i].setY(bob.getY()+i*10);
                
            }
            }
    }//end upbutton method



public void timer1()
{//begin timer1
    if (gameover == false)
    {//begin giant if
    count++;
 
    int currentXP,currentYP;
    
    
    
    if (count % 10 == 0)
    {
        currentXP = (int)(Math.random() * 490);
        currentYP = (int)(Math.random() * 490);
        
        joe.setX(currentXP);
        joe.setY(currentYP);
    }
    
    if (bob.getX() >=490 || bob.getY()>=500)
    {
        gameover = true;
        JOptionPane.showMessageDialog(null,"GAME OVER");
        JOptionPane.showMessageDialog(null,"The score for " + name + " is " +
                score);
        
    }
    else if (bob.getX() <=-5 || bob.getY()<=20)
    {
        gameover = true;
        JOptionPane.showMessageDialog(null,"GAME OVER");
        JOptionPane.showMessageDialog(null,"The score for " + name + " is " +
                score);
        
    }
    
    if (count>=60)
    {
        gameover = true;
        JOptionPane.showMessageDialog(null,"Time's up!");
        JOptionPane.showMessageDialog(null,"The score for " + name + " is " +
                score);
                
    }
    
    
}//end giant if
    
    
}//end timer 1
public void timer3()
{//begin timer 3
int currentXS,currentYS;
if (gameover == false)
{//begin giant if
 currentXS = bob.getX();
    bob.setX(currentXS + (directionX));
    
    currentYS = bob.getY();
    bob.setY(currentYS + (directionY));
    
    if (score>=10)
    {
    for(int i = 0; i<5;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
            }   
    }
    
    if (score>=20)
            {
            for(int i = 5;i<10;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    
    if (score>=30)
            {
            for(int i = 10;i<15;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=40)
            {
            for(int i = 15;i<20;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=50)
            {
            for(int i = 20;i<25;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=60)
            {
            for(int i = 25;i<30;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=70)
            {
            for(int i = 30;i<35;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=80)
            {
            for(int i = 35;i<40;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=90)
            {
            for(int i = 40;i<45;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=100)
            {
            for(int i = 45;i<50;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=110)
            {
            for(int i = 50;i<55;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
    if (score>=120)
            {
            for(int i = 55;i<60;i++)
            {
                body[i].setX(body[i].getX()+directionX);
                body[i].setY(body[i].getY()+directionY);
                
            }
            }
}//end giant if

    if ((joe.getX() > bob.getX()+10) || (joe.getY() > bob.getY()+10))
    {
      //don't do anything- no collision 
       
     }
        else if ((joe.getX() < bob.getX()-10) || joe.getY() < bob.getY() - 10)
        {      
               //don't do anything, no collision     
                    
        }
        else
        {
            
            int XP,YP;
            XP = (int)(Math.random()*490);
            YP = (int)(Math.random()*490);
            joe.setX(XP);
            joe.setY(YP);
            score = score + 10;            
        }


}//end timer 3
   
}//end class