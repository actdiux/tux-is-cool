import animals.Fish;

/**
 * Created with IntelliJ IDEA.
 * User: gonda
 * Date: 8/14/12
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pond
{


    static final int NUMBER_OF_FISH = 3;

    Fish[] fish;

    public Pond()
    {
        fish = new Fish[NUMBER_OF_FISH];
        System.out.println( "\nCreating a Pond with fishies!" );
        fish[0] = new Fish( "finny", // Name
                16,        // Age
                35 );

        fish[1] = new Fish( "skinny", // Name
                18,        // Age
                35 );

        fish[2] = new Fish( "ginny", // Name
                36,        // Age
                55 );

        System.out.println( "\npound pond done!");

    }
}
