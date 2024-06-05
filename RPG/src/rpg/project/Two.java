package rpg.project;

/**
 *
 * @author Rafee-M
 */

public class Two {

    public String getTwoPart(int n, String playerName) {
        switch (n) {
            case 1:
                return getTwo1();

            case 2:
                return getTwo1c1(playerName);

            case 3:
                return getTwo1c2(playerName);

            case 4:
                return getTwo1c1o(playerName);

            case 5:
                return getTwo1c2o(playerName);
               
            case 6:
                return getTwo2(playerName);
                
            case 7:
                return getTwo3(playerName); //Part 6

            default:
                return "Story not found";
        }
    }

    private String getTwo1() {
        return ("""
            As we went deeper into the night, it got colder and colder. My fingers got numb and my legs were barely working. Everyone else was shivering as well. We wouldn't survive the night out in the cold.
                
            It was imperative that we set up camp somewhere. But we needed to decide on where to set camp
            """);
    }

    private String getTwo1c1(String playerName) {
        return ("""
            Right in front. There is some foliage, but would be quicker.
            """);
    }

    private String getTwo1c2(String playerName) {
        return ("""
            Find a more open space. More time spent in the cold.
            """);
    }

    private String getTwo1c2o(String playerName) {
        return ("""
            We choose a safe, clear spot away from the dense foliage to set up our campfire.
            
            "Watch closely, Theron," I say, kneeling beside the pile of kindling. "This is how you start a fire without flint."
            I take out a small, well-worn fire bow, a tool passed down through generations. Placing the bowstring around a spindle and setting the spindle in a notch on a fireboard, I begin to spin it rapidly. The friction generates heat, and soon, a wisp of smoke curls up from the wood.
            
            "Now, we gently blow on it," I explain, leaning close to the ember that has formed. "Careful not to scatter it."
            With a few careful breaths, the ember glows brighter, catching onto the dry leaves and twigs. The tiny flame flickers to life, and with some careful nurturing, it grows into a warm, steady fire.
            "Impressive as always, %s," Garrick says with a grin, adding larger branches to the flames.
            
            As we finish our meal, the forest around us grows darker, the firelight casting dancing shadows on the trees. One by one, we climb into our hammocks, the fatigue of the day's journey finally catching up with us.
            "Goodnight, everyone," I say softly, gazing up at the slivers of starry sky visible through the canopy.
            "Goodnight, %s," they reply in unison.
            
            And with that, we drift into sleep, surrounded by the sounds of the forest and the warmth of the fire, ready to face whatever challenges tomorrow brings.
            """.formatted(playerName, playerName));
    }

    private String getTwo1c1o(String playerName) {
        return ("""
            Garrick pulls out a flint and steel, striking them together to create sparks. The dry twigs catch, and soon a small flame begins to dance. The fire grows, its warmth a welcome comfort against the encroaching cold.
            But as the fire consumes the twigs, it spreads to the surrounding underbrush, faster than we anticipated. Panic seizes us as flames leap to the low-hanging branches, igniting the dry leaves. The forest, so serene and protective, turns hostile in an instant.

            "Quick, get water!" I shout, but it's too late. The fire spreads with terrifying speed, fueled by the dry forest floor and the thick canopy above. Smoke billows around us, stinging our eyes and filling our lungs with acrid fumes.
            In the chaos, I lose sight of Theron. "Theron! Garrick! Bran!" I call out, but my voice is swallowed by the roar of the flames.

            The fire surrounds us, a blazing inferno that consumes everything in its path. Garrick's cries of pain pierce the air, followed by a horrifying silence. I stumble through the smoke, trying to find my friends, my brother, but the heat is unbearable. My skin blisters, and every breath is agony.
            Despair grips me as I realize there is no escape. In my final moments, I fall to my knees, the flames closing in. Through the haze of pain and smoke, I send a silent prayer to the heavens.

            "Alara, my daughter, may you be safe. I failed to save you, but may your spirit find peace."
            The fire engulfs me, and darkness overtakes my vision. Our quest ends in tragedy, the forest reclaiming us in a fiery embrace.
            """.formatted(playerName));
    }
    
    private String getTwo2(String playerName) {
        return ("""
            Part 6: The Dungeon and the Stranger
                
            The morning sun filters through the dense foliage, casting dappled patterns of light on the forest floor. The air is fresh with the scent of dew and earth, and the sounds of chirping birds greet us as we wake. After a quick wash in a nearby stream, we pack up our hammocks and blankets, ensuring we leave no trace of our camp.
            
            For breakfast, we gather some known fruits from the trees-juicy oranges and sweet berries that provide a refreshing start to our day. With our stomachs full and spirits lifted, we continue our journey through the jungle.
            
            As we push deeper into the forest, the trees grow taller and the underbrush thicker, making the path harder to navigate. Suddenly, we stumble upon an area where the trees seem to part slightly, revealing what appears to be an ancient, overgrown structure. Vines and moss cling to the crumbling stone walls, and an eerie silence hangs in the air.
            
            "Look there," Bran says, pointing towards a barely visible entrance obscured by foliage. "That looks like an old dungeon."
            Curiosity and a sense of foreboding wash over us. As we approach the entrance, a faint, desperate cry for help echoes from within, barely audible but unmistakable.
            "We have to see who's in there," I say, drawing my sword. Garrick and Bran tighten their grips on their weapons, and even Theron's face hardens with resolve.
            
            We step cautiously into the dungeon, the darkness swallowing us as we leave the sunlight behind. The air inside is damp and cool, carrying the musty scent of decay and neglect. Our footsteps echo on the stone floor as we move deeper, guided by the occasional flicker of torchlight from sconces lining the walls.
            
            The walls are adorned with faded carvings and moss, and the ceiling drips with moisture. The narrow corridors twist and turn, leading us deeper into the maze-like structure. The cries for help grow louder, guiding us towards their source.
            At last, we enter a dimly lit chamber. In the corner, chained to the wall, is a man in a dire state. His clothes are tattered and filthy, his skin pale and bruised, and his eyes hollow with exhaustion and pain. Dried blood stains his face and hands, and his breath comes in ragged gasps.
            
            Garrick and I rush to his side, while Bran keeps watch. "Who are you?" I ask gently, starting to work on the chains that bind him.
            """.formatted(playerName));
    }
    
    private String getTwo3(String playerName) {
        return ("""
            Part 6: The Dungeon and the Stranger

            "My name is Kael," the man whispers, his voice hoarse. "I was taken by bandits... left here to die when they abandoned this place."
            
            "You're safe now," Garrick reassures him, using his strength to break the chains. Kael collapses into our arms, too weak to stand.
            As we help Kael out of the dungeon, he tells us his story in broken fragments. "I was a merchant... traveling to a nearby town. The bandits ambushed us, killed my companions. They... they brought me here, thinking they could ransom me. But when no one came, they left me to rot."
            
            His eyes fill with tears, a mix of relief and lingering fear. "I thought I'd never see the light of day again."
            "You're safe now, Kael," I say firmly. "We'll get you out of here and back to safety."
            Once outside, we find a small clearing where we can tend to Kael's wounds and give him water and some of our remaining fruit. The fresh air and sunlight seem to revive him slightly, though he remains weak and unsteady.
                
            With Kael regaining some of his strength, I start discussing whether or not we should bring him with us or find some shelter for him nearby.    
            """.formatted(playerName));
    }
    
    
}
