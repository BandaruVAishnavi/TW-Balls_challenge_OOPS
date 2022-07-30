import processing.core.PApplet;

public class Window extends PApplet {
    private int WIDTH, HEIGHT;
    public Window(){
        WIDTH = 640;
        HEIGHT = 480;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

}
