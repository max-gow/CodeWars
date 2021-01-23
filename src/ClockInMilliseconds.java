public class ClockInMilliseconds {
    public static void main(String[] args) {
        System.out.println(Past(12, 32,4));

    }
    public static int Past(int h, int m, int s) {
        int result = 0;
        if (0 <= h && h <= 23 && 0 <= m && m <= 59 && 0 <= s && s <= 59) {
            result = (h * 3600 + m * 60 + s) * 1000;
        }
        return result;
    }
}
