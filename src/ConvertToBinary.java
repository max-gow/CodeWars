//Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.
public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(5));

    }
    public static int toBinary (int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}
