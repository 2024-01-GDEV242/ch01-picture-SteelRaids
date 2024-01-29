/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Joseph Del Santro
 * @version 2023.01.29
 */
public class Picture
{
    private Square background;
    //private Square window;
    //private Triangle roof;
    //private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        //window = new Square();
        //roof = new Triangle();  
        //sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("yellow");
            background.moveHorizontal(-350);
            background.moveVertical(-150);
            background.changeSize(999);
            background.makeVisible();
            
            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();
    
            //roof.changeSize(60, 180);
            //roof.moveHorizontal(20);
            //roof.moveVertical(-60);
            //roof.makeVisible();
    
            //sun.changeColor("yellow");
            //sun.moveHorizontal(100);
            //sun.moveVertical(-40);
            //sun.changeSize(80);
            //sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        //window.changeColor("white");
        //roof.changeColor("black");
        //sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("yellow");
        //window.changeColor("red");
        //roof.changeColor("green");
        //sun.changeColor("yellow");
    }
}
