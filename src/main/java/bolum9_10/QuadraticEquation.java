package bolum9_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Calculate discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Calculate first root
    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }

        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    // Calculate second root
    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }

        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
