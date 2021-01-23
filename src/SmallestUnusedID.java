/*
public class SmallestUnusedID {
    public static void main(String[] args) {
        System.out.println(nextId(new int[] { 1, 2, 0, 2, 3 }));

    }

    public static int nextId(int[] ids) {
        int[] my = ids;
        int num = my.length + 1;
        for (int i = 0; i < my.length; i++) {
            if (my[i] != i)
                return i;
        }


        return 545454;
    }
}
// if (ids[] !== 0) return 0; // якщо немає 0-го елементу, повернути 0*/
