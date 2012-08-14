package animals;

import animals.parts.Beak;
import animals.parts.Eye;
import animals.parts.Foot;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Penguin extends Animal
{
    Eye  leftEye;
    Eye  rightEye;
    Foot rightFoot;
    Foot leftFoot;
    Beak beak;

    boolean isHungry;

    public Penguin( String name,
                    int age,
                    int weight,
                    String rightEyeColor,
                    String leftEyeColor,
                    float rightFootLength,
                    float leftFootLength,
                    float beakLength )
    {
        super( name, age, weight );
        System.out.println( "\tPenguin()" );

        isHungry = true;

        // Construct new objects from parameters
        leftEye   = new Eye(  leftEyeColor    );
        rightEye  = new Eye(  rightEyeColor   );
        rightFoot = new Foot( leftFootLength  );
        leftFoot  = new Foot( rightFootLength );
        beak      = new Beak( beakLength      );
    }

    public void waddle()
    {
        System.out.println( "\t" + name + " is waddling." );
        leftFoot.moveForward();
        rightFoot.moveForward();
    }
    public boolean isDead ()
    {
        if ( weight == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public void swim()
    {

        if ( weight > 50 )
        {
            System.out.println( "\t" + name + " is swimming.  " + weight );
            weight -= 50;
            rightFoot.flap();
            leftFoot.flap();
        }
        else
        {
            System.out.println( "\t" + name + " can not swim - weighs " + weight );
        }

    }

    public void eat( Fish fish )
    {
        System.out.println( "\t" + name + " is eating fish " + fish.name );
        weight += 0.75 * fish.weight;
        isHungry = false;
    }

    @Override
    public String toString()
    {
        return "Penguin { " +
               "name = "       + name      +
               ", age = "      + age       +
               ", weight = "   + weight    +
               ", right eye "  + rightEye  +
               ", left eye "   + leftEye   +
               ", right foot " + rightFoot +
               ", left foot "  + leftFoot  +
               ", Beak "       + beak      +
               ", isHungry = " + isHungry  +
               " }";
    }
}
