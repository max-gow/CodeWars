import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*The Story:
Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.

Task Overview:
You have to write a function that accepts three parameters:

cap is the amount of people the bus can hold excluding the driver.
on is the number of people on the bus excluding the driver.
wait is the number of people waiting to get on to the bus excluding the driver.
If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

Usage Examples:
enough(10, 5, 5)
0 -- He can fit all 5 passengers
enough(100, 60, 50)
10 -- He can't fit 10 of the 50 waiting*/
public class EnoughSpaceBus {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть загальну кількість місць в автобусі: ");
        String cap1 = bf.readLine();
        int cap = Integer.parseInt(cap1);   //загальна кількість місць в автобусі
        System.out.print("Введіть скільки вже зайнято місць в автобусі: ");
        String on1 = bf.readLine();
        int on = Integer.parseInt(on1);     //скільки зайнято місць в автобусі
        System.out.print("Введіть скільки людей бажає зайти: ");
        String wait1 = bf.readLine();
        int wait = Integer.parseInt(wait1); //скільки хоче зайти


        int result = EnoughSpaceBus.enoughSpace(cap, on, wait);
        if (result == 0)
            System.out.println(result + " -- He can fit all " + wait + " passengers");
        else
        System.out.println(result + " -- He can't fit " + result + " of the " + wait + " passengers");

    }

    public static int enoughSpace (int cap, int on, int wait) {
        if (cap > on + wait){
            return 0;
        }
        else
        return Math.abs(cap - (on + wait));
    }
}
