public class IncrementNumbers {
    public static void main(String[] args) {
        System.out.println(pipeFix(new int[] {6,9}));
        /*int [] res = IncrementNumbers.pipeFix(new int[] {1,2,3,5,6,8,9});
        System.out.println(res);*/

    }
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length -1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = i + min;
        }
        return result;
    }
}
