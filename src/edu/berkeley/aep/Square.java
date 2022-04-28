package edu.berkeley.aep;

//Understands a shape with four equal sides and right angels
public class Square {
    //publci class Square extends Rectangle
    //for inheritance

    private double side;

    public Square(double side) {
        //super(side,side) for inherintance
        //Problem with inheritance it gives extra code in this case
        this.side = side;
    }

    public boolean equals(Square other){
        if (other==this) return true;
        if(!(other instanceof Square)) return false;
        return Double.compare(((Square) other).side, side) == 0;

    }

    @Override
    public int hashCode(){
        return Double.hashCode(side);
    }
}
