package rpg.project;

/**
 *
 * @author Rafee-M
 */

public class Four {

    public String getFourPart(int n, String playerName) {
        switch (n) {
            case 1:
                return getFourChoice1();

            case 2:
                return getFourChoice2();

            case 3:
                return getFourA1();

            case 4:
                return getFourA2(playerName);

            case 5:
                return getFourB(playerName);

            case 6:
                return getFourC1();

            case 7:
                return getFourC2(playerName);
            
            case 8:
                return getFourD1();
                
            case 9:
                return getFourD2(playerName);
                
            default:
                return "Story not found";
        }
    }

    private String getFourChoice1() {
        return ("""
            "I trust my blade more than any other"
            """);
    }

    private String getFourChoice2() {
        return ("""
            "Very well. We will trade"
            """);
    }

    //4A(1)
    private String getFourA1() {
        return ("""              
        I shake my head. "I trust this blade more than any other. Thank you, but no."
        Seeing my resolve, Alaric nods reluctantly. "Very well, then. Safe travels to you all."

        He mounts his mule and continues down the path, disappearing into the forest. We resume our journey, the encounter a brief distraction from our mission.
        """);
    }

    //4A(2)
    private String getFourA2(String playerName) {
        return ("""              
        The next day dawns with a sense of foreboding. As we navigate through a rocky terrain, the air grows tense, and my instincts prick with unease. Suddenly, from behind the rocks and trees, a group of bandits ambushes us. They are armed and vicious, eyes gleaming with malice.
        "To arms!" I shout, drawing my sword as the bandits close in.

        The clash is immediate and fierce. Garrick swings his hammer with brute force, Bran fights with agility and determination, and I find myself locked in combat with a particularly skilled bandit. Our weapons clash, the ring of steel echoing through the forest. Despite my skill, the bandit's relentless attacks push me to my limits.
        Theron, armed with a small dagger, tries to help but is quickly overwhelmed by the chaos. In the midst of the battle, I see him struggling, fear etched on his young face.
        "Theron, stay back!" I shout, but my voice is drowned by the sounds of combat.
        The fight rages on, and we begin to gain the upper hand. Garrick and Bran take down several bandits, and I manage to wound my opponent. But then, a chilling cry pierces the air-Theron's voice, full of pain and fear.

        I turn just in time to see a bandit strike him down. "No!" I scream, my heart shattering. Fueled by a surge of rage and despair, I fight with renewed ferocity, cutting down the remaining bandits until the last one falls.
        The battle ends, but the victory is hollow. I rush to Theron's side, dropping to my knees beside his motionless body. His eyes are closed, his face pale. A deep wound bleeds from his chest, and I know immediately that he's gone.
        "Theron... no," I whisper, tears blurring my vision. I cradle him in my arms, grief consuming me.

        Garrick and Bran stand silently, their faces grim. Garrick places a hand on my shoulder, his voice heavy with sorrow. "Elric, I'm so sorry."
        We bury Theron in a quiet spot beneath a large oak tree, marking his grave with a simple stone. My heart aches with the loss, and the weight of our quest feels heavier than ever. But I know we must press on. For Theron, and for all those we've set out to save.
        With renewed resolve and heavy hearts, we continue our journey, the memory of Theron fueling our determination to see this quest through to the end.
        """.formatted(playerName));
    }
    
    //4B
    private String getFourB(String playerName) {
        return ("""                
        "This sword has been in my family for generations," I say, hesitating. "It's more than just a weapon to me."
        Alaric shrugs, feigning indifference. "Its value is sentimental, I'm sure. But in battle, sentiment doesn't count for much. A more powerful weapon could save your life."

        After a moment of contemplation, I reluctantly agree. We exchange the sword for a gleaming new blade that Alaric assures me is far superior. With a nod and a sly smile, he takes my ancestral sword and disappears into the forest.
        The next day, we press on, the memory of the trade lingering in my mind. As the sun climbs high, casting dappled light through the canopy, we suddenly find ourselves ambushed. Bandits emerge from the shadows, their weapons drawn and eyes filled with malice.
        "Defend yourselves!" I shout, drawing the new blade.

        The fight is fierce. Garrick's hammer swings with deadly force, and Bran's knife flashes in the sunlight. I engage a bandit, but the new sword feels awkward in my hand, its balance unfamiliar. I struggle to fend off my attacker, narrowly avoiding a blow that could have been fatal.
        """.formatted(playerName, playerName, playerName));
    }

    //4C(1)
    private String getFourC1() {
        return ("""
        After a moment of internal struggle, I nod. "Very well. We will trade."

        Alaric grins, his eyes flashing with triumph. We exchange weapons, and he leaves with my ancestral sword tucked away in his pack, disappearing into the jungle.
        """);
    }

    //4C(2)
    private String getFourC2(String playerName) {
        return ("""
        The next day, we continue our journey, the new sword at my side feeling unfamiliar and awkward. The forest grows denser, and the path becomes harder to discern. Suddenly, we are ambushed by a group of bandits, emerging from the shadows with weapons drawn.
        "Prepare yourselves!" I shout, drawing my new sword. Garrick, Bran, and Theron quickly ready their weapons, forming a defensive circle around Kael.
        The battle is fierce. The bandits are skilled and relentless, their attacks coordinated and brutal. I swing my sword, but it feels unbalanced in my hand, its unfamiliar weight causing me to falter. A bandit takes advantage of my hesitation, landing a blow that forces me to my knees.
        
        At that moment, Alaric steps from the shadows, joining the bandits. He sneers, pointing at me. "This mercenary betrayed me! His so-called ancestral sword is nothing but an ordinary blade!"
        "Alaric, you deceived us!" I shout, struggling to rise. "The sword is valuable because of its history, not magic."
        "History means nothing in a fight," Alaric retorts, drawing his own blade. "But you, %s, have chosen poorly."

        The battle rages on. Garrick's hammer swings with deadly precision, while Bran fights valiantly with his knife. Theron, though young, displays surprising courage, fending off attackers with swift strikes. Kael, though weak, manages to help by using the environment to his advantage, tripping bandits and creating distractions.
        I face Alaric, our swords clashing in a brutal dance. His skill is formidable, but I draw upon my years of training and the determination to protect my friends and family. Despite the unfamiliar sword, I manage to hold my ground.
        
        With a final surge of strength, I parry Alaric's attack and disarm him, sending his weapon flying into the underbrush. Garrick and Bran subdue the remaining bandits, and soon, the clearing is silent except for the heavy breathing of the combatants.
        Alaric lies on the ground, defeated. "You have no idea what you've done," he hisses. "That sword could have made you invincible."
        "Power doesn't come from the weapon," I say, my voice steady. "It comes from the heart and the will to protect those you care about."

        With the bandits defeated and Alaric subdued, we bind the remaining enemies and gather ourselves. The forest seems to breathe a sigh of relief, the tension of the battle dissipating into the cool air, and the ancestral sword back in my possession.
        As we tend to our wounds and prepare to move on, I reflect on the lesson learned. Trust must be earned, and true strength lies not in the weapons we wield but in the bonds we share and the courage within.
        Our journey continues, with renewed resolve and the knowledge that together, we can overcome any obstacle that stands in our way.
        
        """.formatted(playerName, playerName, playerName));
    }

    //4D(1)
    private String getFourD1() {
        return("""
            "It's not for sale," I say firmly, my voice leaving no room for argument.
            Alaric shrugs, packing up his wares. "Very well, your loss. But should you change your mind, I travel these woods often. Farewell, travelers."
            We watch him disappear into the forest, a sense of unease lingering after his departure.
            """);
    }

    //4D(2)
    private String getFourD2(String playerName) {
        return("""
            The next day, as we traverse a narrow path flanked by dense underbrush, we hear a sudden rustling followed by harsh voices. A group of bandits bursts from the trees, weapons drawn and eyes filled with malice.
            "Hand over your valuables, and no one gets hurt," their leader growls, brandishing a crude sword.

            We ready ourselves, drawing our weapons. The air crackles with tension as the bandits advance. The fight begins with a clash of steel, the sound reverberating through the forest.
            Garrick swings his hammer with brute force, fending off two bandits at once. Bran moves swiftly, his knife flashing in the sunlight as he parries and counters. Kael, though still weak, manages to hold his own with a dagger we gave him.
            I face the bandit leader, our swords meeting in a flurry of strikes and parries. His attacks are wild but powerful, each blow forcing me to give ground. My ancestral sword, though old, moves with the grace and precision instilled by years of practice.
            
            "Your fancy sword won't save you," the bandit leader sneers, pushing me back.
            Gritting my teeth, I focus, waiting for the right moment. He swings wildly, leaving himself open. I sidestep and deliver a quick slash to his side, drawing blood. Enraged, he lunges again, but I parry and counter with a thrust to his shoulder.
            Meanwhile, Garrick lets out a roar, his hammer smashing into the chest of one bandit, sending him sprawling. Bran ducks under a swing and drives his knife into his opponent's thigh, incapacitating him.
            Theron, armed with a small but sharp knife, stays close to Kael, his eyes wide with a mix of fear and determination.
            The bandit leader staggers back, clutching his wounded shoulder. "Retreat!" he shouts, and the remaining bandits flee into the woods.
            We stand, panting and bloodied but victorious. The bandits are gone, leaving us to catch our breath and tend to our wounds. Theron rushes to my side, his eyes filled with worry.
            "Are you alright, %s?"

            I nod, sheathing my sword. "I'm fine. Just a scratch."
            Garrick claps me on the back, his usual grin returning. "Well fought, my friend. They didn't know what hit them."
            Kael, though pale and exhausted, manages a weak smile. "You saved me again. Thank you."
            "Let's move on," I say, looking around warily. "We need to find a safer place to rest."
            With renewed determination, we continue our journey, the challenges we face only strengthening our resolve to find and rescue our missing loved ones.
            """.formatted(playerName, playerName, playerName, playerName, playerName));
    }
}
