import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hình chữ nhật
        System.out.println("Hình Chữ Nhật:");
        double rectangleLength = getInput("Chiều dài: ");
        double rectangleWidth = getInput("Chiều rộng: ");
        System.out.println("Diện tích: " + calculateRectangleArea(rectangleLength, rectangleWidth));
        System.out.println("Chu vi: " + calculateRectanglePerimeter(rectangleLength, rectangleWidth));
        System.out.println();

        // Hình thang
        System.out.println("Hình Thang:");
        double trapezoidBase1 = getInput("Đáy lớn: ");
        double trapezoidBase2 = getInput("Đáy nhỏ: ");
        double trapezoidHeight = getInput("Chiều cao: ");
        System.out.println("Diện tích: " + calculateTrapezoidArea(trapezoidBase1, trapezoidBase2, trapezoidHeight));
        System.out.println("Chu vi: " + calculateTrapezoidPerimeter(trapezoidBase1, trapezoidBase2, trapezoidHeight));
        System.out.println();

        // Hình tròn
        System.out.println("Hình Tròn:");
        double circleRadius = getInput("Bán kính: ");
        System.out.println("Diện tích: " + calculateCircleArea(circleRadius));
        System.out.println("Chu vi: " + calculateCirclePerimeter(circleRadius));
        System.out.println();

        // Hình tam giác
        System.out.println("Hình Tam Giác:");
        double triangleBase = getInput("Đáy: ");
        double triangleHeight = getInput("Chiều cao: ");
        System.out.println("Diện tích: " + calculateTriangleArea(triangleBase, triangleHeight));
        System.out.println("Chu vi: " + calculateTrianglePerimeter(triangleBase, triangleHeight));
    }

    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    public static double calculateTrapezoidPerimeter(double base1, double base2, double height) {
        // Không có công thức cụ thể cho chu vi của hình thang, nên chỉ in ra tổng độ dài các cạnh
        return base1 + base2 + 2 * Math.sqrt(Math.pow((base1 - base2) / 2, 2) + Math.pow(height, 2));
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateTrianglePerimeter(double base, double height) {
        // Giả sử tam giác là tam giác vuông để tính chu vi
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }
}
