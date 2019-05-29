import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Thread;

/**
 * The Main class that has the basic methods using String, Date, and Random Objects.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        int x = 7;
        float f = 42.3f;
        double d = 42.3;

        // execute the function called "loopTo" and pass 10 as a parameter
        loopTo(10);

        int four = 4;
        int result = multiplyByTwo(four);
        System.out.println(four + " doubled is " + result);

        System.out.println("--------------");
        System.out.println("Pluralize words");
        System.out.println("--------------");
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("--------------");
        System.out.println("Flip Coin");
        System.out.println("--------------");
        System.out.println(flipNHeads(4));


        // Command Line Clock
        System.out.println("--------------");
        System.out.println("Clock Function");
        System.out.println("--------------");

        clock();

    }

    /**
     * This accepts a value and loops through to prints out a values.
     *
     * @param max the max number to iterate through a loop.
     */
    public static void loopTo(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Loop #" + i);
        }
    }

    /**
     * Multiply by two int.
     *
     * @param n the n
     * @return the int
     */
    public static int multiplyByTwo(int n) {
        return n * 2;
    }

    /**
     * Pluralize string.
     *
     * @param name  the name
     * @param count the count
     * @return the string
     */
    public static String pluralize(String name, int count){
        String plural;
        if(count == 1){
            return name;
        }
        else{
            plural = name + "s";
            return plural;
        }
    }


    /**
     * A function that accepts a value and randomly flip heads and tails.
     *
     * @param value the value
     * @return the string
     */
    public static String flipNHeads(int value){
        Random random = new Random();

        int countHeads = 0;

        for(int i=0; i < value; i++){
            int num = random.nextInt(2);
            if(num == 0){
                System.out.println("tails");
            }
            else {
                System.out.println("heads");
                countHeads += 1;
            }
        }

        String result;
        if(countHeads == 0){
            result = "It took " + String.valueOf(value) + " flips to flip 0 heads in a row.";
        }
        else{
            result = "It took " + String.valueOf(value) + " flips to flip "+  String.valueOf(countHeads) +" heads in a row.";
        }
        return result;

    }

    /**
     * This method runs the clock in seconds.
     */
    public static void clock(){
        Thread thread = new Thread();

        try
        {
            while(true) {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

//
    }
}
