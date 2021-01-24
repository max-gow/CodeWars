//Write a function called repeat_str which repeats the given string src exactly count times.
public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(4, "Hello"));

    }
    public static String repeatStr(final int repeat, final String string) {
        /*String res = "";
        for (int i = 0; i < repeat; i++){   //не очень хорошая практика
            res = res + string;
        }
        return res;*/

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
