import processing.core.PApplet;

public class Main extends PApplet {
    public static final int HEIGHT=400;
    public static final int WIDTH=600;
    public static final int DIAMETER=20;
    int iteration=0;
    public static void main(String[] args) {
        PApplet.main(new String[] {"Main"});
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int ball=1;ball<=4;ball++)
            drawellipse(ball*iteration,ball*HEIGHT/5);
        iteration++;
    }

    public void drawellipse(int height,int width){
        ellipse(height,width,DIAMETER,DIAMETER);
    }
}
