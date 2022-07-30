import javafx.scene.shape.Circle;
import processing.core.PApplet;
public class BallsChallengeOOPS extends PApplet{
    public static void main(String[] args) {
        PApplet.main("BallsChallengeOOPS", args);
    }
    Window window = new Window();
    Sphere sphere = new Sphere(10);

    @Override
    public void settings() {
        super.settings();
        size(window.getWIDTH(), window.getHEIGHT());
    }

    @Override
    public void draw() {
        drawSpheres();
    }

    private void drawSpheres() {
        ellipse(sphere.sphere1(), window.getHEIGHT()*1/5, sphere.getDIAMETER(),sphere.getDIAMETER());
        ellipse(sphere.sphere2(), window.getHEIGHT()*2/5, sphere.getDIAMETER(),sphere.getDIAMETER());
        ellipse(sphere.sphere3(), window.getHEIGHT()*3/5, sphere.getDIAMETER(),sphere.getDIAMETER());
        ellipse(sphere.sphere4(), window.getHEIGHT()*4/5, sphere.getDIAMETER(),sphere.getDIAMETER());

    }
}
