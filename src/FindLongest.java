public class FindLongest {
    public static void main(String[] args) {
        System.out.println(findLongest("Take me to tinseltown with you"));
    }

    public static int findLongest(String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

    }