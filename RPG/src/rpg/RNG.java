package rpg;

/**
 *
 * @author Rafee-M
 */

import java.util.Random;

public class RNG {
    // Method to generate random damage
    
    public int generate(){        
        Random rand = new Random();
        return rand.nextInt(21);
    }

}
