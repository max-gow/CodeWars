//Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.
public class AreaSquare {
    public static void main(String[] args) {
        //System.out.printf("%.2f", squareArea(14.05)); // обрізає до 2 знаків після коми
        System.out.println(squareArea(14.05));

    }
    public static double squareArea(double A) {

        double radius = (A*4) / (2*Math.PI); // визначаем радіус кола(радіус буде стороною квадрату)
        double square = radius * radius;
        return Math.round(square * 100) / 100; // обрізає знаки після коми
    }
}
//0.00000000000001
//r = 1.2732395447351628