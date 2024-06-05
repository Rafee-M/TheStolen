package rpg.project;

/**
 *
 * @author Rafee-M
 */

public class Three {

    public String getThreePart(int n, String playerName) {
        switch (n) {
            case 1:
                return getThree1c1();

            case 2:
                return getThree1c2();

            case 3:
                return getThree1c1o(playerName);

            case 4:
                return getThree1c2o(playerName);

            case 5:
                return getThree2a(playerName);

            case 6:
                return getThree2b(playerName);

            default:
                return "Story not found";
        }
    }

    private String getThree1c1() {
        return ("""
            "We don't take him with us
            """);
    }

    private String getThree1c2() {
        return ("""
            "We take him with us
            """);
    }

    private String getThree1c1o(String playerName) {
        return ("""
        "We can't take him with us on our quest," I say, looking to Garrick and Bran. "But we can't leave him here either."
        Garrick nods. "There's a hunter's cabin not far from here. It's a safe place where he can recover."

        We help Kael to the cabin, a small, sturdy structure nestled in a secluded part of the forest. Inside, it's cozy and well-stocked with basic supplies. We lay him on a cot and make sure he's comfortable.
        "Stay here and rest," I tell Kael, placing a blanket over him. "We'll alert the villagers about your location when we return. You'll be safe here until then."
        
        Kael's eyes fill with gratitude. "I don't know how to thank you. You've saved my life."
        "We're just doing what's right," I reply, squeezing his shoulder reassuringly.

        With Kael safe, we step back into the forest, the sun now high in the sky. Our mission is far from over, but our resolve is stronger than ever. As we continue our journey, the memory of the abandoned dungeon and the rescued stranger fuels our determination to find and save our missing loved ones.
        Together, we move forward, ready to face whatever challenges lie ahead, driven by the hope of bringing light to the darkness that threatens our village.
        """.formatted(playerName));
    }

    private String getThree1c2o(String playerName) {
        return ("""
        "We can't leave him here," Bran says, looking at the state Kael is in. "He needs proper care."
        "We'll take him with us," I decide. "Until we can find a safe place for him to recover."

        Theron steps forward, offering Kael his blanket. "Here, this will keep you warm."
        Kael looks at us with gratitude, his eyes glistening. "Thank you... I owe you my life."

        With Kael now part of our group, we resume our journey, moving more slowly to accommodate his weakened state. The path ahead is uncertain and fraught with danger, but together, we press on, driven by the hope of reuniting with our loved ones and determined to help anyone we encounter along the way.
        """.formatted(playerName));
    }

    private String getThree2a(String playerName) {
        return ("""
        Part 7: The Merchant and the Bandits
                
       With renewed determination, we continue our journey through the dense forest. The canopy above becomes a patchwork of light and shadow, the sun filtering through the leaves, guiding our way. Our progress is considerable, the path becoming more familiar with each step as we move closer to our goal.
        On the second day, as we traverse a narrow path flanked by towering trees, a stranger appears. He is a merchant, leading a mule laden with an array of merchandise-glinting weapons, colorful fabrics, and various trinkets. His eyes light up as he spots us, and he approaches with a practiced smile.
        
        "Greetings, travelers," he calls out, stopping a few paces away. "I am Alaric, a humble merchant. Might I interest you in some of my fine wares? Finest weapons this side of the kingdom."
        I nod politely. "We are on an important quest, Alaric, but we might take a look."
        He steps closer, displaying an assortment of swords, daggers, and bows. "These weapons are of the highest quality. Perfect for brave adventurers like yourselves. Especially you, good sir," he says, eyeing my sword. "But I couldn't help but notice that fine blade you carry. Perhaps you'd consider an exchange?"
        
        I glance down at my sword, an ancestral blade handed down through generations of my family. Its hilt is adorned with intricate engravings, the pommel set with a small, glimmering gem. The blade itself is sharp and well-maintained, bearing the marks of countless battles and the legacy of my forebears.
        "This sword has been with my family for centuries," I say, my voice firm. "It's more than just a weapon; it's a part of who I am. No other blade could replace it."
        Alaric's smile falters slightly, but he persists. "Surely, a modern weapon, crafted with the latest techniques, would serve you better? That sword, though fine, is old. Perhaps not as reliable in these dangerous times", he says as his eyes linger on the sword.
        """.formatted(playerName));
    }

    private String getThree2b(String playerName) {
        return ("""
        Part 7: The Merchant and the Bandits
           
        With Kael still recuperating, our progress through the jungle is slow but steady. We take frequent breaks, ensuring he has time to rest and regain his strength. The forest around us is a mix of dense undergrowth and towering trees, with occasional clearings where we can see the sky. The air is filled with the sounds of chirping birds and rustling leaves, a reminder of the life teeming in this wild place.
        On the second day, as we take a break in one such clearing, a stranger appears on the path. He is a merchant, dressed in fine yet practical clothing, carrying a large pack filled with various goods. His eyes gleam with a cunning light as he approaches us.
        
        "Good day, travelers!" he calls out. "I am Alaric, a humble merchant. I couldn't help but notice your fine weapons. Might I take a closer look?"
        He steps closer, eyeing our gear appreciatively. His gaze lingers on the sword at my side-an ancestral blade passed down through generations of my family. Its hilt is intricately carved with ancient runes, and the blade, though worn, still holds a sharp edge. This sword has seen many battles and is a symbol of my lineage and leadership.
        
        "Ah, what a magnificent sword," Alaric exclaims, pretending to downplay its value. "But, if I may be so bold, I have weapons that might serve you better on your journey. Perhaps we could make a trade?"
        I hesitate, feeling a pang of unease. "This sword has been in my family for generations. It's more than just a weapon to me."
        
       "Of course, of course," Alaric says smoothly. "But consider this-my blades are enchanted, forged with the finest materials. Your sword, while historic, may not offer the same advantages in the battles ahead."
        Reluctantly, I examine his wares. Alaric grins, spreading his arms wide to showcase his merchandise. "Weapons of the finest craftsmanship! This axe can cleave through armor like butter, and this dagger is said to be enchanted. All I ask in exchange is that old sword of yours. It seems of little value compared to what I can offer."
        His words make me uneasy, but his wares are impressive. My companions exchange uncertain glances, and I feel a tug of doubt. Reluctantly, I draw my sword, its weight familiar and comforting. His weapons are indeed finely crafted, glinting with a promise of strength and reliability. 
        """.formatted(playerName));
    }

}
