import processing.core.PApplet;


public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;//these are where I made all of the balls bubbles and snowflakes 
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1; 
    private Bubble bubble2; 
    private Bubble bubble3; 
    private Bubble bubble4;
    private Snowflake snowflake1; 
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;




    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500,500);// this is the size of the world 
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);//the default ball 
        ball2 = new Ball(this, 10, 50, 50,2, 13);
        ball3 = new Ball(this,10,40,20,30,40);
        ball4 = new Ball(this,12,23,34,45,56);
        ball1.setColors(color(random(0,255), random(0,255), random(0,255)),0);//this makes random colored balls 
        ball2.setColors(color(random(0,255), random(0,255), random(0,255)),0);
        ball3.setColors(color(random(0,255), random(0,255), random(0,255)),0);
        ball4.setColors(color(random(0,255), random(0,255), random(0,255)),0);
        bubble1 = new Bubble(this);//the default Bubble 
        bubble2 = new Bubble(this,12,5,5,2,-2);
        bubble3 = new Bubble(this,10,6,7,2,-4);
        bubble4 = new Bubble(this,21,8,9,2,-6);
        snowflake1 = new Snowflake(this);//the default snowflake 
        snowflake2 = new Snowflake(this,10,2,3,2,-1);
        snowflake3 = new Snowflake(this,8,3,5,2,-1);
        snowflake4 = new Snowflake(this,21,2,67,2,-1);

        }
 
    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */


 
        

    public void draw() {
       background(180, 180, 255);
        ball1.draw();//here Is where the draw and move methods are used to make the balls bubbels and snowflakes move the way they are and how the look (draw)
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        bubble1.move();
        bubble1.draw();
        bubble2.move();
        bubble2.draw();
        bubble3.move();
        bubble3.draw();
        bubble4.move();
        bubble4.draw();
        snowflake1.move();
        snowflake1.draw();
        snowflake2.move();
        snowflake3.draw();
        snowflake3.move();
        snowflake4.draw();
        snowflake4.move();

        

    }







    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
