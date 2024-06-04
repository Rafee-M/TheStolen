package rpg;

/**
 *
 * @author Rafee-M
 */
public class playerAttributes {

    //variables
    //player direct stats
    public String name;
    private int health = 10;

//    //inventory
//    private int healthPotion = 3;
//    private int healthPotionHeal = 20;
//    
//    //player attributes
//    private int abilityPoints = 10;
//    private int strength = 0;
//    private int intelligence = 0;
    //empty constructor
    public playerAttributes() {
    }

    //setters - direct stats
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //getters - direct stats
    public String getName() {
        return this.name;
    }

    int getHealth() {
        return this.health;
    }

}
