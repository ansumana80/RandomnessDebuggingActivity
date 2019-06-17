import java.util.Random;
public class RandomGenerator
{
    public static void main(String[] args) {

        Random rnd = new Random();

        int x = 1 + rnd.nextInt(10);

        for(int i=1; i<=10; i++);

        System.out.println("My  random number is:" +x);

        System.out.println( "Here are some numbers from 1 to 6!" );
        System.out.print( 1 + rnd.nextInt(6) + " " );
        System.out.print( 1 + rnd.nextInt(6) + " " );
        System.out.print( 1 + rnd.nextInt(6) + " " );
        System.out.print( 1 + rnd.nextInt(6) + " " );
        System.out.print( 1 + rnd.nextInt(6) + " " );
        System.out.print( 1 + rnd.nextInt(6) + " " );

    }

}
