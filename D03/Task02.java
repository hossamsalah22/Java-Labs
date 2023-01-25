import java.util.function.Function;

class QuadraticFunction implements Function<Coefficients, QuadraticRoots> {
    public QuadraticRoots apply(Coefficients coefficients) {
        double a = coefficients.getA();
        double b = coefficients.getB();
        double c = coefficients.getC();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return null;
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new QuadraticRoots(root1, root2);
        }
    }
}

class Coefficients {
    private double a;
    private double b;
    private double c;

    public Coefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

class QuadraticRoots {
    private double root1;
    private double root2;

    public QuadraticRoots(double root1, double root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;
    }
}

public class Task02 {

    public static QuadraticRoots calcRoots(Coefficients coefficients,
            Function<Coefficients, QuadraticRoots> quadraticFunction) {
        return quadraticFunction.apply(coefficients);
    }

    public static void main(String[] args) {
        if (args.length == 3) {
            Coefficients quadratic = new Coefficients(Integer.parseInt(args[0]), Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]));
            if (quadratic == null) {
                System.out.println("Error");
            } else {
                double root1 = calcRoots(quadratic, new QuadraticFunction()).getRoot1();
                double root2 = calcRoots(quadratic, new QuadraticFunction()).getRoot2();
                System.out.println("Real roots: " + root1 + " and " + root2);
            }
        }
        System.out.println("Please Enter Data in order a b c");
    }
}
