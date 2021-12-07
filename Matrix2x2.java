package edu.cornellcollege;

public class Matrix2x2 {

    private final double m00;
    private final double m01;
    private final double m10;
    private final double m11;
/*
This class models a matrix...

        | m00  m01 |
        | m10  m11 |

*/

    public Matrix2x2(double m00, double m01, double m10, double m11){

        this.m00 = m00;
        this.m01 = m01;
        this.m10 = m10;
        this.m11 = m11;

    }//Matrix2x2(double, double, double, double)

    @Override
    public String toString(){
        return "| " + this.m00 + " | " + this.m01+ " |" +
                "\n| " + this.m10 + " | " + this.m11 + " |";
    }//toString()

    public Matrix2x2 multiply( Matrix2x2 other){

        double a = this.m00 * other.m00 + this.m01 * other.m10;
        double b = this.m00 * other.m01 + this.m01 * other.m11;
        double c = this.m10 * other.m00 + this.m11 * other.m10;
        double d = this.m11 * other.m11 + this.m11 * other.m11;

        return new Matrix2x2(a, b, c, d);
    }//Multiply( Matrix2x2 )

    public static void main(String[] args) {
        Matrix2x2 m = new Matrix2x2(11,13, 17, 19);
        System.out.println("Original Matrix... " + "\n"+  m);
        System.out.println("Multiplied Matrix..." + "\n" + m.multiply(m));

        double one = Math.cos(Math.PI/4);
        double two = Math.sin(Math.PI/4);
        double three = Math.sin(Math.PI/4);
        double four = Math.cos(Math.PI/4);

        double five = Math.cos(Math.PI/4);
        double six = Math.sin(Math.PI/4);
        double seven = Math.sin(Math.PI/4);
        double eight = Math.cos(Math.PI/4);

        Matrix2x2 n = new Matrix2x2(one, - two, three, four);
        Matrix2x2 o = new Matrix2x2(five, six, seven, eight);

        System.out.println("Matrices with one of the sin/cos..." + "\n" + n);
        System.out.println("Matrices with another of the sin/cos..." + "\n" + o);
        System.out.println("Multiplying above Matrices..." + "\n" + n.multiply(n));
        System.out.println("Multiplying above Matrices..." + "\n" + o.multiply(o));
	// write your code here
    }//main(String[] args)
}//Matrix2x2
