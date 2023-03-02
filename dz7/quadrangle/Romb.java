package dz7.quadrangle;

public class Romb extends Quadrilateral {
    public double side1;
    public double side2;
    public double side3;
    public double side4;
    public double dopGradus;
    public double corner1;

    public double getCorner1(){
        return corner1;
    }

    public Romb(double side1, double dopGradus){
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
        this.side4 = side1;
        this.dopGradus = dopGradus;
        this.corner1 = dopGradus + 90;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side1;
    }

    public double getSide3() {
        return side1;
    }

    public double getSide4() {
        return side1;
    }
}
