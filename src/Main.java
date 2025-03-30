//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.area(5);
        System.out.println("Area of circle: " + area);


        // Calculator
        Calculator calculator = new Calculator();
        // Using the methods from Calculator class
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);



        }



}