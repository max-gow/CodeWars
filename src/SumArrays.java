//https://www.codewars.com/kata/53dc54212259ed3d4f00071c
public class SumArrays {
    public static void main(String[] args) {
        System.out.printf("%.4f", sum(new double[] {-2.389}));

    }
    public static double sum(double[] numbers) {
        double sum = 0.0;
        if (numbers.length == 0 )
            return 0;
        else {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
        }

        return sum;
    }
}
