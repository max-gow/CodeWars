public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1,2,3,4,5}));

    }
    public static int sum(int[] arr){
        int s = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                s = s + arr[i];     // якщо елемент масиву > 0 добавити цей елемент до суми
            }
        }
        return s;
    }
}
