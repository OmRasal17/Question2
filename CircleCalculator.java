public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CircleCalculator <radius>");
            return;
        }
        
        double radius = Double.parseDouble(args[0]);
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Circle with radius " + radius);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }
}