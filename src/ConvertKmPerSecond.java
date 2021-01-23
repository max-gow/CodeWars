public class ConvertKmPerSecond {
    public static void main(String[] args) {
        ConvertKmPerSecond cock = new ConvertKmPerSecond();

        System.out.println(cock.cockroachSpeed(1.08));

    }
    public int cockroachSpeed(double x){
        x = x *100000;
        int a = (int)x;
        return  a / 3600;
        //return a;
    }

}
