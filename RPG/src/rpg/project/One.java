package rpg.project;

public class One {

    public String getOnePart(int n, String playerName){
        switch(n){
            case 1:
                return getOne1(playerName);
            
            case 2:
                return getOne2(playerName);
              
            case 3:
                return getOne3(playerName);
                
            case 4:
                return getOne4(playerName);
            
            case 5:
                return getOne4c1(playerName);
                
            case 6:
                return getOne4c2(playerName);
                
            case 7:
                return getOne4c1o(playerName);
                
            case 8:
                return getOne4c2o(playerName);
              
            case 9:
                return getOne5(playerName);
                
            default:
                return "Story not found";
        }
    }

    private String getOne1(String playerName) {
        return ("""
            Part 1: The Village and the Leader
                
            Nestled in the verdant embrace of rolling hills and ancient forests, our village, Willowbrook, is a serene haven away from the turmoil of the outside world. Thatched cottages dot the landscape, their chimneys curling wisps of smoke into the sky. The cobblestone paths are well-worn by generations of villagers, leading to the central square where the old oak tree stands as a silent guardian, its branches sprawling protectively over the community.
            
            Life here moves to the rhythm of the seasons. Farmers tend to their fields, children laugh and play by the brook, and the blacksmith's hammer rings out a steady beat, a comforting reminder of our industrious nature. Yet, in recent times, a shadow has crept over our peaceful home. People have started to vanish without a trace - first, it was old Thomas from the edge of the woods, then young Lila who loved to dance by the river, and most recently, my own heart's anchor, my daughter Alara.
            
            I am %s, the village leader. Born and raised here, I have always taken pride in Willowbrook's tranquility and the well-being of its people. With a sturdy frame hardened by years of labor and eyes that carry the weight of responsibility, I have vowed to protect this village with all that I am. The disappearances have shaken me to my core, and the fear in my people's eyes haunts my dreams.
            
            As the sun sets, casting a golden hue over the village, I find myself walking towards the smithy where my best friend, Garrick, is working. Garrick is a bear of a man, with muscles sculpted by years of hammering iron and a heart as big as his biceps. His laughter is a balm to our worried souls, and his wisdom, though often hidden behind a gruff exterior, is invaluable.
            "Garrick," I call out, leaning against the doorway of the smithy, "do you have a moment?"
            
            He looks up from his work, wiping sweat from his brow with a sooty rag. "For you, %s, always. What's on your mind?"
            "It's the disappearances," I say, stepping inside. "We can't ignore them any longer. I fear for our people, and I can't bear the thought of losing another soul."
            
            Garrick nods solemnly, his jovial demeanor momentarily replaced by the seriousness of our conversation. "I've been thinking the same. We need to act, %s. But what do you propose?"
            "I plan to set out and find them. We can't wait for help that may never come. I'll need you by my side, old friend."
            Garrick's eyes meet mine, and a slow grin spreads across his face. "You know I'm with you, %s. Through fire and storm, we'll find them."
            """.formatted(playerName, playerName, playerName, playerName));
    }

    private String getOne2(String playerName) {
        return ("""
            Part 2: The Call to Adventure
                
            The next morning, under the boughs of the great oak, I stand before the gathered villagers. Faces etched with worry and hope look up at me. Taking a deep breath, I begin my address.
            
            "People of Willowbrook, we have always been a close-knit community, bound by trust and love. But now, a dark cloud hangs over us. Our friends, our family, our children are missing. We cannot sit idle while our loved ones are taken from us."
            A murmur of agreement ripples through the crowd. I continue, "I have decided to embark on a journey to find them and bring them back. I cannot do this alone. I ask for your courage, your strength, and your willingness to face the unknown. Who among you will join me in this quest?"
            
            A moment of silence follows, then a hand rises from the back of the crowd. It's a young man named Bran, known more for his quiet demeanor than for acts of bravery. His eyes are determined as he steps forward.
            
            "I will go with you, %s," Bran says, his voice steady. "I may not be a warrior, but I cannot stand by while our people suffer."
            I nod, gratitude swelling in my chest. "Thank you, Bran. Together, we will face whatever dangers lie ahead and bring our people home."
            
            As the villagers disperse, preparing for the journey, I catch sight of a small figure slipping into the shadows. My little brother, Theron, always eager for adventure. I shake my head, a smile tugging at my lips. He'll have to stay behind this time.
            """.formatted(playerName));

    }

    private String getOne3(String playerName) {
        return ("""
            Part 3: Setting Out
            
            With Garrick, Bran, and the village's hopes behind me, we set forth from Willowbrook, unaware of the perils and discoveries that await us. The path ahead is fraught with danger, but our resolve is unshakable. For the sake of our village and those we love, we will not falter.
            """);

    }

    private String getOne4(String playerName) {
        return ("""
            Part 4: Into the Wilderness
                
            Leaving Willowbrook behind, we tread along a winding path that leads into the heart of the ancient forest. The familiar landscape of our village gives way to towering trees with gnarled roots and dense foliage. The air grows cooler, filled with the earthy scent of moss and the faint melody of distant streams. Sunlight filters through the canopy in dappled patterns, casting an ethereal glow on the forest floor.
            
            As we move deeper into the woods, the jungle grows thicker. Vines hang like tendrils from the branches, and the sounds of wildlife surround us - chirping birds, rustling leaves, and the occasional distant roar. Despite the beauty, a sense of foreboding lingers, a reminder of the dangers that lie ahead.
            Every so often, I catch a subtle rustling behind us, barely audible above the forest's symphony. My instincts prick with suspicion, but I dismiss it as the wind or small animals.
            Suddenly, a growl breaks the tranquility. We barely have time to react before a pack of wild dogs emerges from the underbrush, their eyes glowing with hunger and aggression. Garrick brandishes his hammer, and Bran grips his knife tightly.
            
            The first dog lunges at me, its fangs bared. 
            """.formatted(playerName, playerName));

    }
    
    private String getOne4c1(String playerName){
        return "I dodge to the right...";
    }
    
    private String getOne4c2(String playerName){
        return "I swing my sword at it...";
    }
    
    private String getOne4c1o(String playerName){
        return ("""
            I sidestep, feeling its hot breath on my arm as it misses. With a swift motion, I draw my sword and strike, the blade catching the creature's side and sending it yelping back.
            
            Garrick swings his hammer with a ferocity that matches the wild dogs' savagery, each blow resonating through the forest. Bran, though less experienced, holds his ground, slashing at a dog that tries to flank us. Blood and fur fly as we fend off the attackers, the metallic scent of blood mixing with the forest's earthy aroma.
            
            The dogs, realizing they've met formidable opponents, retreat into the shadows, their growls fading into the distance. We stand panting, adrenaline coursing through our veins, but remarkably, none of us are seriously injured - just a few scratches and bruises.
            
            A whimper catches my attention. Turning towards the sound, I see Theron stepping out from behind a tree, his face pale with fear. My heart sinks.
            "Theron!" I exclaim, more harshly than I intend. "What are you doing here?"
            He looks up at me, eyes wide and pleading. "I wanted to help, %s. I thought I could be useful."
            
            Anger and relief war within me. I stride over and kneel to his level, gripping his shoulders. "Do you realize how dangerous this is? You could have been hurt - or worse!"
            Tears well up in his eyes, and my stern expression softens. "But now that you're here, I can't send you back alone. It's too dangerous, and we can't afford to turn back."
            
            Garrick steps forward, his voice gentle. "He's got spirit, %s. He might just surprise us."
            I sigh, pulling Theron into a hug. "Alright, you can stay. But you must listen to everything I say and stay close. Understand?"
            Theron nods vigorously, his fear giving way to a determined smile. "I promise."
            
            With our new, unexpected addition, we continue our journey, more vigilant than ever. The path ahead is uncertain, but our resolve is stronger. Together, we will face whatever challenges lie in wait, driven by the hope of reuniting with our missing loved ones. 
            """.formatted(playerName, playerName));
    }
    
    private String getOne4c2o(String playerName){
        return ("""
            [Health: -5]
            I draw my sword and with all my might swing at the dog head on. The blade slashes the creature's throat and kills it. I feel a sudden warmth on my right hand. Turns out the dog had managed to sink some of its fangs into my hand. 
            
            Garrick swings his hammer with a ferocity that matches the wild dogs' savagery, each blow resonating through the forest. Bran, though less experienced, holds his ground, slashing at a dog that tries to flank us. Blood and fur fly as we fend off the attackers, the metallic scent of blood mixing with the forest's earthy aroma.
                        
            The dogs, realizing they've met formidable opponents, retreat into the shadows, their growls fading into the distance. We stand panting, adrenaline coursing through our veins, but remarkably, none of us are seriously injured - just a few scratches and bruises.
                        
            A whimper catches my attention. Turning towards the sound, I see Theron stepping out from behind a tree, his face pale with fear. My heart sinks.
            "Theron!" I exclaim, more harshly than I intend. "What are you doing here?"
            He looks up at me, eyes wide and pleading. "I wanted to help, %s. I thought I could be useful."
                        
            Anger and relief war within me. I stride over and kneel to his level, gripping his shoulders. "Do you realize how dangerous this is? You could have been hurt - or worse!"
            Tears well up in his eyes, and my stern expression softens. "But now that you're here, I can't send you back alone. It's too dangerous, and we can't afford to turn back."
                        
            Garrick steps forward, his voice gentle. "He's got spirit, %s. He might just surprise us."
            I sigh, pulling Theron into a hug. "Alright, you can stay. But you must listen to everything I say and stay close. Understand?"
            Theron nods vigorously, his fear giving way to a determined smile. "I promise."
                        
            With our new, unexpected addition, we continue our journey, more vigilant than ever. The path ahead is uncertain, but our resolve is stronger. Together, we will face whatever challenges lie in wait, driven by the hope of reuniting with our missing loved ones. 
            """.formatted(playerName, playerName));
    }

    private String getOne5(String playerName) {

        return ("""
            Setting Up Camp
            As the sun begins its descent, the forest transforms into a realm of shadows and flickering light. The sky above, visible only in fragmented glimpses through the dense canopy, is painted with hues of orange, pink, and purple. The beauty of the sunset contrasts sharply with the encroaching chill that accompanies nightfall. We need warmth, and soon.
            Finding a small clearing between sturdy trees, we decide this will be our camp for the night. Garrick and I string up hammocks and blankets, creating makeshift beds suspended above the forest floor. Theron eagerly helps, his small hands deftly tying knots, while Bran sets about gathering dry twigs and kindling for a fire.
            As darkness deepens, Bran and I venture a short distance from the camp to hunt. Moving silently through the underbrush, we spot a few rabbits. With practiced skill, Bran manages to catch two, their soft fur and small bodies a promise of sustenance for the night.
            Returning to the camp, we find Garrick has assembled a small pile of dry wood. The air is filled with the sharp scent of pine and the earthy smell of the forest floor. We settle around the unlit fire, the rabbits skinned and ready to be cooked.
            "Remember that time we tried to catch fish with our bare hands, %s?" Garrick chuckles, breaking the silence. "We ended up soaked and empty-handed."
            I laugh, shaking my head. "I do. I think we scared the fish more than they scared us."
            Theron, his eyes wide with curiosity, looks up at us. "Will I get to hear more stories like that when we find everyone?"
            A pang of sadness tugs at my heart, but I smile. "Yes, Theron. We'll have plenty of stories to share once we bring everyone back."
            """.formatted(playerName));
    }
}
