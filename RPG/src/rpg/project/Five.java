package rpg.project;

public class Five {

    public String getFivePart(int n, String playerName) {
        switch (n) {
            case 4:
                return getFiveA(playerName);

            case 5:
                return getFiveBB(playerName);

            case 7:
                return getFiveCB(playerName);

            case 9:
                return getFiveC(playerName);
                
            default:
                return "FATAL ERROR: Story not found";
        }
    }
    
    public String getFiveA(String playerName){
        return("""
            The days following Theron's death are shrouded in a haze of grief and melancholy. The once vibrant forest now feels oppressive, its colors muted and the air heavy with sorrow. Every step forward is a painful reminder of the loss we've suffered. My heart feels like a leaden weight in my chest, and the world around me seems dim and distant.
            Garrick and Bran remain close, their presence a silent comfort, but their own grief mirrors mine. We travel in a somber silence, the memories of Theron haunting every moment.

            As we continue, the forest begins to change. Without us noticing at first, the path grows darker, the trees gnarled and twisted. A palpable sense of dread hangs in the air, as if the very ground is tainted by dark magic. Shadows dance unnaturally, and the once comforting sounds of the forest are replaced by eerie whispers and the rustling of unseen creatures.
            The leaves on the trees turn a sickly shade of black, and the air grows colder, biting at our skin. The feeling of being watched intensifies with every step, and an unspoken fear grips us all.
            Suddenly, we find ourselves in a clearing, the ground scorched and barren. Before us stands a creature of nightmare - a massive, hulking figure with scales as black as obsidian and eyes that burn with a malevolent red glow. Its wings are leathery and bat-like, and its claws glint with deadly sharpness. The air crackles with dark energy as it steps forward, its gaze locked onto me.
            
            "You've come far, %s," the creature hisses, its voice like the grinding of stones. "But this is where your journey ends."
            I grip my sword tightly, feeling its familiar weight. "Who are you, and why do you seek my life?"

            The creature's eyes narrow. "I am Kaldor, a guardian of ancient power. That sword you carry is an ancient relic, bound to the souls of its bearers. To someone like me, it offers immense power - but only if I use it to kill you."
            The realization strikes me like a blow. "You want my sword? Over my dead body."
            "Exactly," Kaldor snarls, a sinister grin spreading across its face. "And that is precisely how I intend to take it."

            Kaldor lunges at me, its claws crackling with dark magic. I parry with my sword, the clash sending a shockwave through the air. Garrick and Bran leap to my defense, but Kaldor's magic restrains them, binding them with tendrils of shadow.
            "%s!" Garrick struggles against the dark bonds. "We can't break free!"
            Kaldor laughs, a sound devoid of any mirth. "Your friends are powerless against me. This fight is between you and me."

            I fight with everything I have, but Kaldor's strength and dark magic are overwhelming. It conjures bolts of shadow that sear my flesh, and its claws leave deep gashes in my armor. I dodge and strike, my sword flashing in the dim light, but the creature is relentless.
            In the midst of the chaos, Bran steps forward, his eyes gleaming with a strange light. "%s," he says, his voice cold and detached. "It's time for this charade to end."
            I freeze, confusion and betrayal flooding through me. "Bran, what are you doing?"

            "I've led you here," Bran admits, a cruel smile on his lips. "Kaldor promised me power and safety in exchange for your life."
            My heart sinks. "You betrayed us... and Theron?"
            "The villagers are dead," Bran continues, his tone matter-of-fact. "They died long before we set out. This was all a ploy to draw you out."
            Kaldor's laughter echoes through the clearing. "Indeed. A shame you didn't exchange your sword with the merchant. Your death could have been painless."

            Rage and despair boil within me. I see the faces of Theron, my daughter, and all the loved ones I've lost. The guilt and anger ignite something primal inside me. With a roar, I unleash my fury, attacking Kaldor with a ferocity I didn't know I possessed.
            The battle becomes a blur of steel and shadow. Kaldor counters my every move with dark magic, but my rage fuels me. I fight not just for my life, but for the memory of those I've lost.
            Garrick breaks free from his restraints, charging at Bran with his hammer. "You traitor!" he bellows, swinging with deadly precision. Bran tries to defend himself, but Garrick's fury is unmatched. They clash violently, the sounds of their fight mingling with mine.
            
            Kaldor's magic wounds me deeply, but I press on, my sword glowing with a strange, ancient light. I manage to land a few critical blows, but the creature is relentless.
            """.formatted(playerName, playerName, playerName, playerName));
    }
    
    public String getFiveBB(String playerName){
        return("""
            
            In the midst of the chaos, a familiar figure appears-Alaric, the merchant. His eyes glint with betrayal as he joins the bandits, brandishing my ancestral sword.
            "You've betrayed me, %s!" he shouts. "This sword is worthless, not the relic you claimed it to be."
            Shock and anger surge through me. "You tricked me, Alaric! That sword is priceless!"
            "Not anymore," he sneers, advancing on me.

            We clash, the ring of steel echoing through the forest. Alaric is skilled, but his overconfidence is his weakness. With Garrick and Bran at my side, we push back the bandits. However, the fight takes a deadly toll.
            In the chaos, one of our own falls. It is Theron, my little brother, his eyes wide with shock as a bandit's blade strikes him down. My heart wrenches in my chest as I rush to his side, but it's too late. The light fades from his eyes, leaving only an unbearable void.
            Fueled by rage and sorrow, we fight with renewed ferocity. Eventually, we overcome the bandits, and Alaric is defeated, collapsing to the ground with a look of disbelief.
            
            We gather around Theron's lifeless form. The weight of our loss is heavy, the forest eerily silent in the aftermath of the fight. We bury him beneath a towering oak, marking his grave with stones and a makeshift cross.
            "I'm sorry, Theron," I whisper, tears mingling with the dirt. "I should have protected you."
            Garrick places a comforting hand on my shoulder. "He was brave, %s. He followed us because he believed in what we're doing."
            
            With heavy hearts, we collect our belongings. Despite the grief, we must continue. The quest to save our village is more urgent than ever, and we will honor Theron's memory by pressing on, determined to bring our loved ones home.
            As we move forward, the shadow of loss lingers, but so does the resolve to see our mission through. Together, we face the unknown, stronger in our unity and driven by the memory of those we've lost.
            """.formatted(playerName, playerName, playerName, playerName));
    }
    
    public String getFiveCB(String playerName){
        return("""
            
            Part 8: Betrayal and Redemption
            The jungle's thick canopy shields us from the harsh midday sun as we continue our journey. The path is arduous, but the thought of rescuing our loved ones keeps us moving forward. Suddenly, through the dense foliage, I see a familiar face-my daughter, Alara. My heart leaps with hope.
            "Alara!" I shout, rushing forward. But as I approach, the figure vanishes, dissolving into the shadows. It was nothing more than a trick of the light, a cruel illusion.
            Garrick places a reassuring hand on my shoulder. "We'll find her, %s. Don't let this discourage you."
            I nod, steeling myself. We must press on.
            After hours of trekking, we come across a clearing that emanates an ominous aura. Hidden among the trees is a dilapidated building, shrouded in darkness despite the daylight. We cautiously approach, hearing faint cries for help from within.
            "It's them," Garrick whispers, his eyes wide with recognition. "The villagers... and your daughter. They're in there."
            We ready our weapons and burst into the building. Inside, the air is thick with the smell of damp and decay. In a large, dimly lit room, we find a group of villagers, including Alara, bound and guarded by a band of menacing abductors.
            "Let them go!" I shout, brandishing my sword. The abductors snarl and rush at us, weapons drawn.
            The room erupts into chaos. Garrick's hammer swings with thunderous force, taking down several abductors with each blow. Theron fights bravely by my side, his determination unwavering despite the odds. Kael, though still weak, manages to aid us with quick, strategic strikes.""".formatted(playerName, playerName, playerName, playerName));
    }
    
    public String getFiveC(String playerName){
        return("""
            Part 8: The Final Confrontation
            As we continue down the path, a sense of unease begins to creep over us. The forest, once vibrant and full of life, starts to change. The air grows colder, and a strange fog rolls in, obscuring the way ahead. The trees seem twisted and gnarled, their branches clawing at the sky like skeletal hands. Shadows move unnaturally, and the usual sounds of wildlife are replaced by an eerie silence.
            The very ground beneath our feet feels different, as if infused with a dark, malevolent energy. The atmosphere is thick with a sense of impending doom, and we can't shake the feeling that we are being watched.
            "Something's not right," Garrick mutters, his eyes scanning the surroundings warily.

            Suddenly, the path opens into a clearing, and we come face to face with a mythical creature of terrifying proportions. It stands over ten feet tall, its body a grotesque fusion of muscle and dark, scaly armor. Its eyes glow with an unholy light, and its fanged maw drips with venom. Massive wings extend from its back, and clawed hands crackle with dark magic.
            "So, you've come at last," the creature hisses, its voice echoing with a sinister power. "I've been waiting for you, %s."
            "Who... what are you?" I ask, gripping my ancestral sword tightly.

            "I am Kaldor, the Devourer of Souls," it replies. "And I am here to claim what is rightfully mine-your life, and the power of your sword"
            Kaldor's eyes gleam with malevolent intent. "That sword is an ancient relic, capable of immense power, but only for the one who takes it in blood. As its current owner, it is but a fraction of what it could be. But if I were to kill you with it, its true power would be mine."
            Before we can react, Kaldor raises its claws, and dark magic surges forth, binding Garrick, Bran, and Theron in place. They struggle against the invisible restraints, unable to move or speak.
            "%s, look out!" Garrick manages to shout, his voice strained.

            Kaldor lunges at me, and I barely manage to parry its attack. The force of the blow sends me staggering back. The creature's strength is immense, and its dark magic makes it even more formidable. Our swords clash, sparks flying with each strike, but I know I'm at a disadvantage.
            Just as the battle intensifies, Kael steps forward, his eyes cold and calculating. "Kaldor, I've brought him to you as promised."
            I stare at Kael, disbelief and anger flooding my senses. "You... you betrayed us!"

            Kael smirks, his demeanor shifting from the helpless victim we rescued to a cunning traitor. "Indeed. It was all a ruse to draw you out. The missing villagers are already safe in their homes. There was never any real threat to their lives."
            Kaldor chuckles darkly. "And you refused Alaric's offer to trade, which would have given you a painless death. Such a pity."
            Rage boils within me. "You used us! You put my friends' lives in danger for your greed!"

            "Enough talk," Kaldor snarls. "It's time to end this."

            Fueled by betrayal and anger, something within me snaps. A primal, almost beastly power surges through my veins, and I launch myself at Kaldor with renewed fury. Our blades clash again and again, the air filled with the sound of ringing steel and the crackle of dark magic.
            Garrick, driven by sheer willpower, breaks free from the magical restraints. He charges at Kael, his hammer swinging with deadly precision. "You traitor! This ends now!"

            Kael, caught off guard, tries to defend himself, but Garrick's blows are relentless. Their fight becomes a violent blur, but my focus remains on Kaldor.
            Kaldor conjures a dark spell, sending tendrils of shadow towards me. I slash through them, my sword glowing with a faint, ancient light. The power of my ancestors courses through me, guiding my strikes. With each blow, I push Kaldor back, our battle a whirlwind of fury and determination.
            "Your power is nothing compared to mine!" Kaldor roars, but I can sense its desperation.""".formatted(playerName, playerName, playerName, playerName));
    }
}
