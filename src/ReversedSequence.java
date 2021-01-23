public class ReversedSequence {
    public static void main(String[] args) {
        System.out.println(reverse(5));

    }

    public static int[] reverse(int n) {
        int [] res = new int[n];

            for (int i = 0; n > 0; i++) {
                res[i] = n;
                n--;

            }


        return res;
    }
}
