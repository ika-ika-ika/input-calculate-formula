public class Treugolnik {
    static int numofSide = 3;
    double base;
    double height;
    double sideLengthOne;
    double sideLengthTwo;
    double sideLengthThree;

    public Treugolnik (double base, double height, double sideLengthOne, double sideLengthTwo, double sideLengthThree){
        this.base = base;
        this.height = height;
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
        this.sideLengthThree = sideLengthThree;
    }
    public double findArea() {
        return (this.base * this.height)/2;

    }
}
