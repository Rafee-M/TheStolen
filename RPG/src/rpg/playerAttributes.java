package rpg;

/**
 *
 * @author Rafee-M
 */
public class playerAttributes {
    
    //variables
    
    //player direct stats
    private String name;
    private int maxHealth = 50;
    private int health = 50;
    private int maxDamage = 10;
    
    //inventory
    private int healthPotion = 3;
    private int healthPotionHeal = 20;
    
    //player attributes
    private int abilityPoints = 10;
    private int strength = 0;
    private int stamina = 0;
    private int intelligence = 0;
    private int charisma = 0;
    
    //empty constructor
    public playerAttributes(){
        
    }
    //setters - direct stats
    public void setName(String name){
        this.name = name;
    }
    public void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }
    public void setHealth(int health){
        this.health = health;
    } 
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }
    //setters - inventory
    public void setHealthPotion(){
        this.healthPotion++;
    }
    
    //setters - player attributes
    public void setStrength(){
        if(this.abilityPoints > 0){
            this.strength++;
            this.abilityPoints --;
        }
    }
    public void setCharisma(){
        if(this.abilityPoints > 0){
            this.charisma++;
            this.abilityPoints --;
        }
    }
    public void setStamina(){
        if(this.abilityPoints > 0){
            this.stamina++;
            this.abilityPoints --;
        }
    }
    public void setIntelligence(){
        if(this.abilityPoints > 0){
            this.intelligence++;
            this.abilityPoints --;
        }
    }
    
    //getters - direct stats
    public String getName(){
        return this.name;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public int getHealth(){
        return this.health;
    }
    public int getMaxDamage(){
        return this.maxDamage;
    }
    //getters - inventory
    public int getHealthPotion(){
        return this.healthPotion;
    }
    
    //getters - attriutes
    public int getStrength(){
        return this.strength;
    }
    public int getCharisma(){
        return this.maxHealth;
    }
    public int getStamina(){
        return this.stamina;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    
    
}
