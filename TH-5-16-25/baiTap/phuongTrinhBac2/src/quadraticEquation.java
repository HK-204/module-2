public class quadraticEquation {
    private double a, b, c;

    public quadraticEquation() {
    }

    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return b*b - 4*a*c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDelta())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDelta())) / (2 * a);
    }

    public double getDoubleRoot() {
        return -b / (2 * a);
    }

    public void solve() {
        double delta = getDelta();
        if (delta > 0) {
            double root1 = getRoot1();
            double root2 = getRoot2();
            System.out.println("Quadratic equation has 2 distinct solutions: ");
            System.out.println("root1: " + root1);
            System.out.println("root2: " + root2);
        } else if (delta == 0) {
            double doubleRoot = getDoubleRoot();
            System.out.println("Quadratic equation with double root: ");
            System.out.println("root: " + doubleRoot);
        } else {
            System.out.println("Quadratic equation has no solutions");
        }
    }
}
