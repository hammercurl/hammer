##Hammer – a curling game
Hammer is a free and open-source game of curling. It is written in Java using the JMonkeyEngine 3 game engine. Unlike most curling games, Hammer is meant to be played from the skip's perspective. *Strategy, tactics, and shot-calling* are the names of the game, though the player may take as much or as little control of the *execution* of the shot as he or she wishes.

##Not unuseful information
The following is intended to be guiding principles to the design of this game.
###Motivation
* *Sum up your game idea in one sentence.* A curling game from the skip's perspective.
* *Who's the target group? Are you making it for yourself or are you trying to attract the masses?* Mainly for ourselves, but useable by others who are interested in such arts.

###Game type
* *Point of view (camera)? What character(s) does the player control? (if applicable)* Point of view is a slightly moveable camera behind the playing sheet. Some positions of the camera include directly above the button and a 'standing' position.
* *Time- or turn-based?* Curling is turn-based with a possible per-team time limit; Hammer will be as well.
* *Genre, setting, background story? (If applicable)* You see, back in Scottland...

###Gameplay
* *What is the start state, what is the end state (if any)?* Start state is a menu asking the user to select the parameters for the game. The main play state is the actual curling game, which begins with a score of 0-0 at the beginning of end number 1 and ends if all ends have been played or it is mathematically impossible for one team to comeback from a deficit. The end state is a display of the scoring and possible restart of the game.
* *What resources does the player manage? How are resources gained, transformed, spent?* Not much surprise here; Eight stones per end, and a variable number of ends. Players have the option of enforcing a timer; if your time runs out, you forfeit the game.
* *How does the player interact? Define rules, challenges, game mechanics.* The player calls each of his or her shots using a broom or similar device placed over the intended aiming position. Through some mechanic (yet to be determined), the player chooses the weight of the shot. The computer or player then executes the shot. Sweeping is called on or off by the player during the shot. The ability to know if a shot is narrow, wide, heavy, or light must be in place to inform these sweeping calls. Rules and game mechanics are the standard ones in curling.
* *What state is considered winning, and what losing, or is it an open world?* Winning is having more points after the final end.

###Multi-media assets
* *Which media will you need? How will you get this content?* All visual media will be created using Blender or similar tools. Audio media will be privately recorded or downloaded from open-licensed sources.

###Interface
* *Can you achieve a high degree of input control? Even minor navigation and interaction glitches make the game unsolvable.* Control of input is limited to only a few possible actions, such as moving the broom and camera angle, adjusting weight, calling sweep on or off.
* *Decide how to reflect current status, and changes in game states. E.g. health/damage.* The current end, number of rocks thrown and/or left, the score, and time remaining (if applicable) need to always be visible on screen.
* *Decide how to reward good moves and discourage bad ones.* This is self-regulating, though a smart AI can help.
