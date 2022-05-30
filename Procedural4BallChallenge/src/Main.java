import processing.core.PApplet;

public class Main extends PApplet {
    int height=400;
    int width=600;
    int diameter=20;
    int iteration=0;
    public static void main(String[] args) {
        PApplet.main(new String[] {"Main"});
    }

    @Override
    public void settings() {
        size(width,height);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int ball=1;ball<=4;ball++)
            ellipse(ball*iteration,ball*height/5,diameter,diameter);
        iteration++;
    }
}