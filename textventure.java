import java.util.*;//importing any libraries that may or may not be used
import java.io.*;
public class textventure {//declaring all global variables
        static String input="";
        static int memories, puts, check, first, fc = 0;
        static int room = 1;
        static boolean p1check, p2check, p3check, p4check, p5check = false;
        static int mp = 3;
        static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){//declaring main line
        while (memories < 20){//keep game running regardless of any failures or errors
        if (room == 1 && first == 0){
            intro();
            first = 1;
        }
         while (room == 1){//setting up which room the character is in, dorm
                input = sc.nextLine();//checking for input, bottom text is for failsafe so that the user can only use set words, ignorecase to prevent issues with captial letters
                if (!input.equalsIgnoreCase("help")&&!input.equalsIgnoreCase("north")&&!input.equalsIgnoreCase("south")&&!input.equalsIgnoreCase("east")&&!input.equalsIgnoreCase("west")&&!input.equalsIgnoreCase("look")&&!input.equalsIgnoreCase("memory tool")&&!input.equalsIgnoreCase("examine desk")&&!input.equalsIgnoreCase("memory")){
                    System.out.println("\033[3mPlease input a valid command, for a list of valid commands type in help.\033[0m");
                    puts = puts + 1;
                }
                else if (input.equalsIgnoreCase("help")){
                    System.out.println("\033[3mMovement: North, South, East, and West\033[0m");
                    System.out.println("\033[3mActions: Look, Memory, examine (item)\033[0m");
                    puts = puts + 1;
                    }
                else if (input.equalsIgnoreCase("north")){
                    System.out.println("You walk into the wall, what are you thinking?");
                    puts = puts + 1;
                }
                else if (input.equalsIgnoreCase("south")){
                    System.out.println("You walk into the wall, what are you thinking?");
                    puts = puts + 1;
                }
                    else if (input.equalsIgnoreCase("west")){
                    System.out.println("You walk into the wall, what are you thinking?");
                    puts = puts + 1;
                }   
                else if (memories >= 2 && input.equalsIgnoreCase("east")){
                    System.out.println("You go through the door, walking into a hallway with many others rooms. You look through a window to your south, you see a window that looks into the endless depths of the galaxy.");
                    puts = puts + 1;
                    room = 2;
                }
                else if (memories != 1 && input.equalsIgnoreCase("east")){
                    System.out.println("You can't approach the door, it's like walking into a wall.");
                    System.out.println("\033[3mSomething calls to you from your desk, you might want to examine that.\033[0m");
                }
                else if (input.equalsIgnoreCase("look")){
                    System.out.println("You're in a sparsely decorated room, the bed you woke up on is behind you, with a plain white desk in front. There seems to be a door to your right.");
                    if (memories < 1){
                        System.out.println("Something seems to resonate within you when you look at the desk, almost as if you need to get a closer look, something that is on the tip of your tongue.");
                    }
                }
                else if (input.equalsIgnoreCase("examine desk")){
                    System.out.println("Your desk seems to have something on it, a tool of some sorts, why does it resonate with you?");
                    check = 1;
                }
                else if (input.equalsIgnoreCase("memory tool")&&check == 1){
                    System.out.println("\033[3mYou seem to almost synchronize with your lost thoughts, like grabbing something you can't see.\033[0m");
                        if(memories == 0){
                            pZero();
                        }
                        else{
                            pOne();
                            System.out.println("\033[3mIn a flash of light you see what you recognize to be yourself, fixing a small robot, which hops off your desk after it becomes functional, going about it's duties, you seem happy.\033[0m");
                    }
                }
                else if (input.equalsIgnoreCase("memory")){
                    System.out.println("Nothing seems to resonate around here, maybe take a look around?");
                }
            }
          while (room == 2){//same wordings as room 1, dorm hallway
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("help")&&!input.equalsIgnoreCase("north")&&!input.equalsIgnoreCase("south")&&!input.equalsIgnoreCase("east")&&!input.equalsIgnoreCase("west")&&!input.equalsIgnoreCase("look")&&!input.equalsIgnoreCase("memory")){
                System.out.println("\033[3mPlease input a valid command, for a list of valid commands type in help.\033[0m");
                puts = puts + 1;
            }
            if (input.equalsIgnoreCase("look")){
                System.out.println("You look around the hallway, every door except yours seems to be locked, to your south seems to be some window seating area, to your north seems to be a central hub area.");
            }
            if (input.equalsIgnoreCase("west")){
                System.out.println("You go back into you're room.");
                room = 1;
            }
            if (input.equalsIgnoreCase("north")){
                System.out.println("You walk into a wide open area, there seems to be many people going around their duties, with your fractured memories you seem to remember a few of the jobs that they are doing.");
                room = 3;
            }
            if (input.equalsIgnoreCase("south")){
                System.out.println("You walk into a room furnished with cozy chairs and a holographic fireplace. It feels like the type of place you could doze off as you gaze into the endless abyss.");
                room = 4;
            }
            if (input.equalsIgnoreCase("memory")){
                System.out.println("You try to remember something but nothing seems to click.");
            }
          }
         while (room == 3){//same wordings as room 1, central crossroad
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("help")&&!input.equalsIgnoreCase("north")&&!input.equalsIgnoreCase("south")&&!input.equalsIgnoreCase("east")&&!input.equalsIgnoreCase("west")&&!input.equalsIgnoreCase("look")&&!input.equalsIgnoreCase("memory")&&!input.equalsIgnoreCase("examine")&&!input.equalsIgnoreCase("examine robot")){
                System.out.println("\033[3mPlease input a valid command, for a list of valid commands type in help.\033[0m");
                puts = puts + 1;
            }
            else if (input.equalsIgnoreCase("look")){
                System.out.println("You look around, there are many different routes to go, with many people moving around here and there, all looking like they are in a rush.");
                System.out.println("There seems to be many robots around as well, with some having directions and maps.");
            }
            else if(input.equalsIgnoreCase("south")){
                System.out.println("You walk into the dormintory hallways. To your north is a wide open hall, to your south is a furnished recreational room.");
                room = 2;
            }
            else if (input.equalsIgnoreCase("examine")){
                System.out.println("There isn't much to look at right now.");
            }
            else if(input.equalsIgnoreCase("examine robot")){
                System.out.println("You walk over to a robot, to see if you can get a general idea of where you are.");
                System.out.println("Robot: Good afternoon sir! My name is Tech, an artifical intelligence system. How may I help you?");
                System.out.println("...");
                System.out.println("Tech: I see, coming from my databanks, here is a map of our current location!");
                System.out.println("On the brightly lit screen in front of you it shows a map of the surrounding area, if you head east you will find a the central command area, to your left you will find the engine room and storage, and to the north you see what seems to be a mess hall.");
                System.out.println("Your vision seems to flicker a little bit.");
                if(memories == 0){
                    pZero();
                }
                pTwo();
                System.out.println("You come back to your senses, the robot is still showing you the screen.");
                System.out.println("You remember the layout of the ship, mess hall north, storage and engine left, and armory and medical right");
                memories = memories + 1;
                System.out.println("Memories: " + memories);
                if (memories == 5){
                    System.out.println("Suddenly you remember something, the mirage starts to fall, what is on your mind?");
                    if (fc == 0){
                        System.out.println("Your head barely contains this information, you look up and find yourself stranded on a desert planet, where you go from here you do not know.");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 1 && 5 > fc){
                        System.out.println("You breakdown, you can't handle the information overload, what is going on?");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 5){
                        System.out.println("You go insane from the information, the world shatters and you don't understand anything else.");
                        System.out.println("End");
                        System.exit(0);
                    }
                }
            }
            else if(input.equalsIgnoreCase("east")){
                System.out.println("You walk into a boiling engine room. Mechanics and technicians are moving between, the power source for this ship seems to be some sort of gem.");
                System.out.println("There seems to be a storage room in the back of this hallway, something resonates within you.");
                room = 4;
            }
            else if (input.equalsIgnoreCase("west")){
                System.out.println("You walk into a long hallway, many robot are going in and out of the doors here, to your west seems to be a large door with a red cross on it, to your east is another large door with a large sword symbol on it. Straight head is a command center, seeming to be where the ship is being piloted.");
                room = 7;
            }
            else if(input.equalsIgnoreCase("north")){
                System.out.println("You walk into a loud mess hall, many people having conversations with each other. There seems to be some commotion going on in the corner though. Many people are choosing to ignore it.");
                room = 6;
            }
         }
        while (room == 4){//same wordings as room 1, relax room
            if (!input.equalsIgnoreCase("help")&&!input.equalsIgnoreCase("north")&&!input.equalsIgnoreCase("south")&&!input.equalsIgnoreCase("east")&&!input.equalsIgnoreCase("west")&&!input.equalsIgnoreCase("look")&&!input.equalsIgnoreCase("memory")&&!input.equalsIgnoreCase("examine")){
                System.out.println("\033[3mPlease input a valid command, for a list of valid commands type in help.\033[0m");
                puts = puts + 1;
            }
            else if (input.equalsIgnoreCase("examine")){
                System.out.println("There isn't much to look at right now.");
            }
            else if (input.equalsIgnoreCase("look")){
                System.out.println("Quite a few plush couches line the room, with a fake fireplace spewing heat. It seems to remind you of something, but you can't seem to recall what, though the \033[3mfireplace\033[0m seems to beckon to you.");
                System.out.println("To the east seems to be a central control room, and to the north the dormitory hallways.");
            }
            else if(input.equalsIgnoreCase("examine fireplace")){
                System.out.println("The arcing flames seem to move towards you as you approach them. They envelop you in their light.");
                pTre();
                System.out.println("You remember you were head engineer of this ship, what happened though to make you lose your memories?");
                memories = memories + 1;
                System.out.println("Memories: " + memories);
                if(memories == 0){
                    pZero();
                }
                if (memories == 5){
                    System.out.println("Suddenly you remember something, the mirage starts to fall, what is on your mind?");
                    if (fc == 0){
                        System.out.println("Your head barely contains this information, you look up and find yourself stranded on a desert planet, where you go from here you do not know.");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 1 && 5 > fc){
                        System.out.println("You breakdown, you can't handle the information overload, what is going on?");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 5){
                        System.out.println("You go insane from the information, the world shatters and you don't understand anything else.");
                        System.out.println("End");
                        System.exit(0);
                    }
                }
            }
            else if (input.equalsIgnoreCase("north")){
                System.out.println("You walk into the dormitory hallways, the room gets colder.");
                room = 2;
            }
            else if (input.equalsIgnoreCase("east")){
                System.out.println("You walk into a central control room, though it seems like everyone is busy doing their different jobs.");
                room = 7;
            }
        }
        while (room == 7){
            if (!input.equalsIgnoreCase("help")&&!input.equalsIgnoreCase("north")&&!input.equalsIgnoreCase("south")&&!input.equalsIgnoreCase("east")&&!input.equalsIgnoreCase("west")&&!input.equalsIgnoreCase("look")&&!input.equalsIgnoreCase("memory")&&!input.equalsIgnoreCase("examine")){
                System.out.println("\033[3mPlease input a valid command, for a list of valid commands type in help.\033[0m");
                puts = puts + 1;
            }
            else if (input.equalsIgnoreCase("examine")){
                System.out.println("There isn't much to look at right now.");
            }
            else if (input.equalsIgnoreCase("look")){
                System.out.println("The entire area is bustling with people, though you seem to remember doing something here. The consoles look familliar, the gears seems to spin inside your head.");
            }
            else if(input.equalsIgnoreCase("examine console")){
                System.out.println("You examine the console and it's systems, you've worked with this before but, how?");
                pFou();
                System.out.println("You remember that you created the weapons system, it was a marvel, no one could stop you, though what was it used for?");
                if(memories == 0){
                    pZero();
                }
                if (memories == 5){
                    System.out.println("Suddenly you remember something, the mirage starts to fall, what is on your mind?");
                    if (fc == 0){
                        System.out.println("Your head barely contains this information, you look up and find yourself stranded on a desert planet, where you go from here you do not know.");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 1 && 5 > fc){
                        System.out.println("You breakdown, you can't handle the information overload, what is going on?");
                        System.out.println("End");
                        System.exit(0);
                    }
                    else if (fc > 5){
                        System.out.println("You go insane from the information, the world shatters and you don't understand anything else.");
                        System.out.println("End");
                        System.exit(0);
                    }
                }
                else if(input.equalsIgnoreCase("west")){
                    System.out.println("You walk into the room outside the command center");
                    room = 3;
                }
            }
        }
    }
 }








//methods
    public static void intro(){//the opening, just made in case I want to change some text
        System.out.println("You wake up in a white chamber, it looks like a bedroom, who are you again?");
        System.out.println("\033[3mType in help to get a list of commands.\033[0m");
    }
    static void pZero(){//tutorial to the main mechanic of this game
        System.out.println("Welcome to the memory void, a place where you reconstruct memories.");
        System.out.println("When reconstructing memories, it is important to be careful, and navigate properly, otherwise you might damage yourself in the process.");
        System.out.println("Let's begin shall we.");
        System.out.println("When rebuilding memories, you must type in the correct word to procede either onto the next stage or into the memory based on information given.");
        System.out.println("Let's try it out.");
        System.out.println("You see a round object, it is one side of a cylidner... it is a _ _ _ _ _ _");
        while (memories < 1){
        input = sc.nextLine();
        if (input.equalsIgnoreCase("circle")){
            System.out.println("That is correct, now you understand the basics of this, there can be multiple stages in the future, but that is neither here nor now.");
            System.out.println("Now reexamine the object would you please.");
            memories = 1;
        }else System.out.println("That is an incorrect statement, please try again.");
        }
    }
    static void pOne(){//the first official puzzle, meant to teach the basics
        boolean c1 = false;//checks to insure that user goes through each question, isolated inside the method
        boolean c2 = false;
        boolean c3 = false;
        System.out.println("You approach the tool, looking into the blue light.");
        System.out.println("You are pulled into the fragments, and within you see a statement.");
        while (p1check == false ){//check to ensure that puzzle is only able to be done once to prevent memory duping
            while (c1 == false){
            System.out.println("A mechanichal being, it lives, but only on motors, it is a _ _ _ _ _");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("robot")){
                c1 = true;
            }else {
                System.out.println("That isn't correct, a piece of memory chips.");
                mp = mp - 1;//mp system for end game to check how many times questions were failed and give ending.
                System.out.println("Mental HP: " + mp);
                if (mp == 0){
                    System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                    fc = fc + 1;
                    mp = 3;
                }
                }
            }
            while (c2 == false){//same code as c1
                System.out.println("That is correct, but this mechanichal being is injured, and a tool is needed, you need to _ _ _ it.");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("fix")){
                    c2 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
            while (c3 == false){//same code as c1 with added memory for area completion
                System.out.println("Yes it needs to be fixed, and after you fix it, you feel _ _ _ _ _.(Relating to joy and contentment.)");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("happy")){
                    System.out.println("The pieces fall into place, you feel a part of you regained.");
                    memories = memories + 1;
                    System.out.println("Memories: " + memories);
                    p1check = true;
                    c3 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
        }
    }
    static void pTwo(){//the second puzzle
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        System.out.println("You lose yourself in thought, looking into the blue light.");
        System.out.println("You are pulled into the fragments, and within you see a statement.");
        while (p2check == false ){
            while (c1 == false){
            System.out.println("You were fresh on the ship, you were _ _ _ to the ship. (for the first time)");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("new")){
                c1 = true;
            }else {
                System.out.println("That isn't correct, a piece of memory chips.");
                mp = mp - 1;
                System.out.println("Mental HP: " + mp);
                if (mp == 0){
                    System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                    fc = fc + 1;
                    mp = 3;
                }
                }
            }
            while (c2 == false){
                System.out.println("That is correct, and you were looking for directions, and _ _ _ _ came up to you.(Name of the robot)");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("tech")){
                    c2 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
            while (c3 == false){
                System.out.println("Yes, Tech came to help you, and he showed you _ _ _ _ _ _ _ _ _ _. (a course along which someone or something moves, plural)");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("directions")){
                    System.out.println("The pieces fall into place, you feel a part of you regained.");
                    p2check = true;
                    c3 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
        }
    }
    static void pTre(){//the third puzzle
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        System.out.println("You lose yourself in thought, looking into the red light.");
        System.out.println("You are pulled into the fragments, and within you see a statement.");
        while (p3check == false ){
            while (c1 == false){
            System.out.println("You sat here, it was a space you went to when you needed a quiet space. It really was a home away from home.");
            System.out.println("You did get homesick sometimes, there was only so long you could go with or without everyone you knew.");
            System.out.println("That was okay though, this place acted as a safe _ _ _ _ _. (a place of safety or refuge) ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("haven")){
                c1 = true;
            }else {
                System.out.println("That isn't correct, a piece of memory chips.");
                mp = mp - 1;
                System.out.println("Mental HP: " + mp);
                if (mp == 0){
                    System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                    fc = fc + 1;
                    mp = 3;
                }
                }
            }
            while (c2 == false){
                System.out.println("You would lose yourself in books, from every planet and area discovered.");
                System.out.println("It was because of this that you managed to create new ideas and ascend the ranks of the ship.");
                System.out.println("You managed to create some amazing _ _ _ _ _ _ _ _ _ _ that helped many people on the ship. (A discovery of mechanichal nature)");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("inventions")){
                    c2 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
            while (c3 == false){
                System.out.println("It was because of this that you managed to become head _ _ _ _ _ _ _ _ of the ship. (a person who designs, builds, or maintains machines)");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("engineer")){
                    System.out.println("The pieces fall into place, you feel a part of you regained.");
                    memories = memories + 1;
                    System.out.println("Memories: " + memories);
                    p3check = true;
                    c3 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
        }
    }
    static void pFou(){//the fourth puzzle
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        String input2 = "";
        System.out.println("You lose yourself in thought, looking into the blinking lights.");
        System.out.println("You are pulled into the fragments, and within you see a statement.");
        while (p4check == false ){
            while (c1 == false){
            System.out.println("You designed these systems, though you don't remember how. You had to design this from ground up, and you of course it controls the whole _ _ _ _ _ _ _ _ _ . (The area you are on)");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("spaceship")){
                c1 = true;
            }else {
                System.out.println("That isn't correct, a piece of memory chips.");
                mp = mp - 1;
                System.out.println("Mental HP: " + mp);
                if (mp == 0){
                    System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                    fc = fc + 1;
                    mp = 3;
                }
                }
            }
            while (c2 == false){
                System.out.println("But you were not just simple ship consoles though, you also created the _ _ _ _ _ _ _ of this ship.");
                if (input.equalsIgnoreCase("weapons")){
                    c2 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
            while (c3 == false){
                System.out.println("You managed to create the weapons, but you also made the ships security.");
                System.out.println("You had to make sure no one took control of the ship though, so you also made the _ _ _ _ _ _ _  _ _ _ _ _ _(item from last question + something that manages and is a chain of command.)");
                input = sc.next();
                input2 = sc.next();
                if(input.equalsIgnoreCase("weapons")&&input2.equalsIgnoreCase("system")){
                    System.out.println("The pieces fall into place, you feel a part of you regained.");
                    memories = memories + 1;
                    System.out.println("Memories: " + memories);
                    p4check = true;
                    c3 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
        }
    } 
    static void pFive(){//the fourth puzzle
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        System.out.println("You have a revelation, this was a warship. Though what was it for?");
        System.out.println("You are pulled into the fragments, and within you see a statement.");
        while (p4check == false ){
            while (c1 == false){
            System.out.println("Head engineer, weapons system specialist, robot creation, how did you lost your memories?");
            System.out.println("You damaged yourself, and you have _ _ _ _ _ _ _ (Loss of memory)");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("amnesia")){
                c1 = true;
            }else {
                System.out.println("That isn't correct, a piece of memory chips.");
                mp = mp - 1;
                System.out.println("Mental HP: " + mp);
                if (mp == 0){
                    System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                    fc = fc + 1;
                    mp = 3;
                }
                }
            }
            while (c2 == false){
                System.out.println("Yes, you had amnesia, but it was due to a crash.");
                System.out.println("The ship was trying to conquerer _ _ _ _ _ _ _");
                if (input.equalsIgnoreCase("planets")){
                    c2 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
            while (c3 == false){
                System.out.println("Yes, you were conquering planets, but then a fight happened, you got boarded, and then you _ _ _ _ _ _ _.");
                input = sc.nextLine();
                if(input.equalsIgnoreCase("crashed")){
                    System.out.println("Yes, you crashed, and this place, it is not... it is not real.");
                    System.out.println("The mirage crumbles, and you see for what the ship really is, it is a hollow shell, it was always empty.");
                    memories = memories + 1;
                    System.out.println("Memories: " + memories);
                    p4check = true;
                    c3 = true;
                }else {
                    System.out.println("That isn't correct, a piece of memory chips.");
                    mp = mp - 1;
                    System.out.println("Mental HP: " + mp);
                    if (mp == 0){
                        System.out.println("Something hurts in your head, you clutch your head, but slowly pick the pieces back up.");
                        fc = fc + 1;
                        mp = 3;
                    }
                }
            }
        }
    }               
}

   
