package rpg;
/**
 *
 * @author Rafee-M
 */
import java.util.Random;

public class RNG {
    // Method to generate random damage
    public int generateRandomDamage(playerAttributes player) {
        Random rand = new Random();
        // Random damage between 1 and maxDamage value from playerAttributes object
        int damage = rand.nextInt(player.getMaxDamage()) + 1;
        return damage;
    }

    // Method to generate random healing by potion
    public int generateRandomHealing(playerAttributes player) {
        Random rand = new Random();
        // Random healing between 1 and healthPotionHeal value from playerAttributes object
        int healing = rand.nextInt(player.getHealthPotionHeal()) + 1;
        return healing;
    }
}
