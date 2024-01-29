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
    private Circle pacman;
    private Triangle pacmouth;
    private Person lives;
    private Person lives1;
    private Person lives2;
    private Circle pellet;
    private Circle pellet1;
    private Square leftwall;
    private Square leftwall1;
    private Square leftwall2;
    private Square leftwall3;
    private Square leftwall4;
    private Square rightwall;
    private Square rightwall1;
    private Square rightwall2;
    private Square rightwall3;
    private Square rightwall4;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        pacman = new Circle();
        pacmouth = new Triangle();
        lives = new Person();
        lives1 = new Person();
        lives2 = new Person();
        pellet = new Circle();
        pellet1 = new Circle();
        leftwall = new Square();
        leftwall1 = new Square();
        leftwall2 = new Square();
        leftwall3 = new Square();
        leftwall4 = new Square();
        rightwall = new Square();
        rightwall1 = new Square();
        rightwall2 = new Square();
        rightwall3 = new Square();
        rightwall4 = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("black");
            background.moveHorizontal(-350);
            background.moveVertical(-150);
            background.changeSize(999);
            background.makeVisible();
            
            pacman.changeColor("yellow");
            pacman.moveHorizontal(-135);
            pacman.moveVertical(-50);
            pacman.changeSize(130);
            pacman.makeVisible();
            
            pacmouth.changeColor("black");
            pacmouth.moveHorizontal(-50);
            pacmouth.moveVertical(-30);
            pacmouth.makeVisible();
            
            lives.changeColor("yellow");
            lives.moveHorizontal(120);
            lives.moveVertical(0);
            lives.makeVisible();
            
            lives1.changeColor("yellow");
            lives1.moveHorizontal(120);
            lives1.moveVertical(-100);
            lives1.makeVisible();
            
            lives2.changeColor("yellow");
            lives2.moveHorizontal(120);
            lives2.moveVertical(0);
            lives2.makeVisible();
            
            pellet.changeColor("yellow");
            pellet.moveHorizontal(-80);
            pellet.moveVertical(100);
            pellet.changeSize(30);
            pellet.makeVisible();
            
            pellet1.changeColor("yellow");
            pellet1.moveHorizontal(-80);
            pellet1.moveVertical(165);
            pellet1.changeSize(30);
            pellet1.makeVisible();
            
            leftwall.changeColor("blue");
            leftwall.moveHorizontal(-70);
            leftwall.moveVertical(0);
            leftwall.changeSize(60);
            leftwall.makeVisible();
            
            leftwall1.changeColor("blue");
            leftwall1.moveHorizontal(-70);
            leftwall1.moveVertical(-60);
            leftwall1.changeSize(60);
            leftwall1.makeVisible();
            
            leftwall2.changeColor("blue");
            leftwall2.moveHorizontal(-70);
            leftwall2.moveVertical(-120);
            leftwall2.changeSize(60);
            leftwall2.makeVisible();
            
            leftwall3.changeColor("blue");
            leftwall3.moveHorizontal(-70);
            leftwall3.moveVertical(-180);
            leftwall3.changeSize(60);
            leftwall3.makeVisible();
            
            leftwall4.changeColor("blue");
            leftwall4.moveHorizontal(-70);
            leftwall4.moveVertical(-240);
            leftwall4.changeSize(60);
            leftwall4.makeVisible();
            
            rightwall.changeColor("blue");
            rightwall.moveHorizontal(-290);
            rightwall.moveVertical(0);
            rightwall.changeSize(60);
            rightwall.makeVisible();
            
            rightwall1.changeColor("blue");
            rightwall1.moveHorizontal(-290);
            rightwall1.moveVertical(-60);
            rightwall1.changeSize(60);
            rightwall1.makeVisible();
            
            rightwall2.changeColor("blue");
            rightwall2.moveHorizontal(-290);
            rightwall2.moveVertical(-120);
            rightwall2.changeSize(60);
            rightwall2.makeVisible();
            
            rightwall3.changeColor("blue");
            rightwall3.moveHorizontal(-290);
            rightwall3.moveVertical(-180);
            rightwall3.changeSize(60);
            rightwall3.makeVisible();
            
            rightwall4.changeColor("blue");
            rightwall4.moveHorizontal(-290);
            rightwall4.moveVertical(-240);
            rightwall4.changeSize(60);
            rightwall4.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        pacman.changeColor("white");
        pacmouth.changeColor("black");
        lives.changeColor("white");
        lives1.changeColor("white");
        lives2.changeColor("white");
        pellet.changeColor("white");
        pellet1.changeColor("white");
        leftwall.changeColor("white");
        leftwall1.changeColor("white");
        leftwall2.changeColor("white");
        leftwall3.changeColor("white");
        leftwall4.changeColor("white");
        rightwall.changeColor("white");
        rightwall1.changeColor("white");
        rightwall2.changeColor("white");
        rightwall3.changeColor("white");
        rightwall4.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("black");
        pacman.changeColor("yellow");
        pacmouth.changeColor("black");
        lives.changeColor("yellow");
        lives1.changeColor("yellow");
        lives2.changeColor("yellow");
        pellet.changeColor("yellow");
        pellet1.changeColor("yellow");
        leftwall.changeColor("blue");
        leftwall1.changeColor("blue");
        leftwall2.changeColor("blue");
        leftwall3.changeColor("blue");
        leftwall4.changeColor("blue");
        rightwall.changeColor("blue");
        rightwall1.changeColor("blue");
        rightwall2.changeColor("blue");
        rightwall3.changeColor("blue");
        rightwall4.changeColor("blue");
    }
}
