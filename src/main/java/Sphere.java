import processing.core.PApplet;
public class Sphere {
    private int DIAMETER, speed1, speed2, speed3, speed4;

    public Sphere(int diameter)
    {
        this.DIAMETER = diameter;
        speed1 = speed2 = speed3 = speed4 = 0;
    }
    public int getDIAMETER() {
        return DIAMETER;
    }

    public int sphere1()
    {
        return speed1+=1;
    }
    public int sphere2()
    {
        return speed2+=2;
    }
    public int sphere3()
    {
        return speed3+=3;
    }
    public int sphere4()
    {
        return speed4+=4;
    }
}
