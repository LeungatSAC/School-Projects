import java.util.*;

public class wordle {
    static String rec = "";
    static String inp = "";
    static int tr = 0;
    public static void main(String[]args){
        String[] wordList = {"about", "above", "abuse", "actor", "acute", "admit", "adopt", "adult", "after", "again", "agent", "agree", "ahead", "alarm", "album", "alert", "alike", "alive", "allow", "alone", "along", "alter", "among", "anger", "Angle", "angry", "apart", "apple", "apply", "arena", "argue", "arise", "array", "aside", "asset", "audio", "audit", "avoid", "award", "aware", "badly", "baker", "bases", "basic", "basis", "beach", "began", "begin", "begun", "being", "below", "bench", "billy", "birth", "black", "blame", "blind", "block", "blood", "board", "boost", "booth", "bound", "brain", "brand", "bread", "break", "breed", "brief", "bring", "broad", "broke", "brown", "build", "built", "buyer", "cable", "calif", "carry", "catch", "cause", "chain", "chair", "chart", "chase", "cheap", "check", "chest", "chief", "child", "china", "chose", "civil", "claim", "class", "clean", "clear", "click", "clock", "close", "coach", "coast", "could", "count", "court", "cover", "craft", "crash", "cream", "crime", "cross", "crowd", "crown", "curve", "cycle", "daily", "dance", "dated", "dealt", "death", "debut", "delay", "depth", "doing", "doubt", "dozen", "draft", "drama", "drawn", "dream", "dress", "drill", "drink", "drive", "drove", "dying", "eager", "early", "earth", "eight", "elite", "empty", "enemy", "enjoy", "enter", "entry", "equal", "error", "event", "every", "exact", "exist", "extra", "faith", "false", "fault", "fiber", "field", "fifth", "fifty", "fight", "final", "first", "fixed", "flash", "fleet", "floor", "fluid", "focus", "force", "forth", "forty", "forum", "found", "frame", "frank", "fraud", "fresh", "front", "fruit", "fully", "funny", "giant", "given", "glass", "globe", "going", "grace", "grade", "grand", "grant", "grass", "great", "green", "gross", "group", "grown", "guard", "guess", "guest", "guide", "happy", "harry", "heart", "heavy", "hence", "henry", "horse", "hotel", "house", "human", "ideal", "image", "index", "inner", "input", "issue", "japan", "jimmy", "joint", "jones", "judge", "known", "label", "large", "laser", "later", "laugh", "layer", "learn", "lease", "least", "leave", "legal", "level", "lewis", "light", "limit", "links", "lives", "local", "logic", "loose", "lower", "lucky", "lunch", "lying", "magic", "major", "maker", "march", "maria", "match", "maybe", "mayor", "meant", "media", "metal", "might", "minor", "minus", "mixed", "model", "money", "month", "moral", "motor", "mount", "mouse", "mouth", "movie", "music", "needs", "never", "newly", "night", "noise", "north", "noted", "novel", "nurse", "occur", "ocean", "offer", "often", "order", "other", "ought", "paint", "panel", "paper", "party", "peace", "peter", "phase", "phone", "photo", "piece", "pilot", "pitch", "place", "plain", "plane", "plant", "plate", "point", "pound", "power", "press", "price", "pride", "prime", "print", "prior", "prize", "proof", "proud", "prove", "queen", "quick", "quiet", "quite", "radio", "raise", "range", "rapid", "ratio", "reach", "ready", "refer", "right", "rival", "river", "robin", "roger", "roman", "rough", "round", "route", "royal", "rural", "scale", "scene", "scope", "score", "sense", "serve", "seven", "shall", "shape", "share", "sharp", "sheet", "shelf", "shell", "shift", "shirt", "shock", "shoot", "short", "shown", "sight", "since", "sixth", "sixty", "sized", "skill", "sleep", "slide", "small", "smart", "smile", "smith", "smoke", "solid", "solve", "sorry", "sound", "south", "space", "spare", "speak", "speed", "spend", "spent", "split", "spoke", "sport", "staff", "stage", "stake", "stand", "start", "state", "steam", "steel", "stick", "still", "stock", "stone", "stood", "store", "storm", "story", "strip", "stuck", "study", "stuff", "style", "sugar", "suite", "super", "sweet", "table", "taken", "taste", "taxes", "teach", "teeth", "terry", "texas", "thank", "theft", "their", "theme", "there", "these", "thick", "thing", "think", "third", "those", "three", "threw", "throw", "tight", "times", "tired", "title", "today", "topic", "total", "touch", "tough", "tower", "track", "trade", "train", "treat", "trend", "trial", "tried", "tries", "truck", "truly", "trust", "truth", "twice", "under", "undue", "union", "unity", "until", "upper", "upset", "urban", "usage", "usual", "valid", "value", "video", "virus", "visit", "vital", "voice", "waste", "watch", "water", "wheel", "where", "which", "while", "white", "whole", "whose", "woman", "women", "world", "worry", "worse", "worst", "worth", "would", "wound", "write", "wrong", "wrote", "yield", "young", "youth"
};
        Random ran=new Random();
        //choosing a random number in between 0 and the array length -1
        int randomNumber = ran.nextInt(wordList.length);
        //defining the mystery word to that chosen num
        String mW = wordList[randomNumber];
        boolean check = false;
        String space = " ";
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;
        boolean c4 = false;
        boolean c5 = false;
        Scanner sc = new Scanner(System.in);
        while (check == false){
            System.out.println("Please enter a 5 letter word");
            inp = sc.nextLine();
            if(inp.length() < 5){//too short of a string
                System.out.println("String length too short");
            }
            else if(inp.length()>5){//too long of a string
                System.out.println("String length too long");
            }
            else if (tr == 6){//out of guesses
                System.out.println("Too bad, out of tries. :(");
            }
            else if (inp.equalsIgnoreCase(mW)){//fully correct guess
                System.out.println(mW.charAt(0) + space + mW.charAt(1) + space + mW.charAt(2) + space + mW.charAt(3) + space + mW.charAt(4));
                System.out.println("End, you win!");
                check = true;
                tr = tr + 1;
                recor();
            }
            //multiple letters check (43 - 237)
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + "_" + space + "_" + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + inp.charAt(2) + space + "_" + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c3 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + "_" + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c4 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + "_" + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1) + space + inp.charAt(2) + space + "_" + space + "_");
                tr = tr + 1;
                recor();
                c2 = true;
                c3 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1) + space + "_" + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c2 = true;
                c4 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1) + space + "_" + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c2 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println("_" + space + "_" + space + inp.charAt(2) + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c3 = true;
                c4 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + "_" + space + inp.charAt(2) + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c3 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + "_" + space + "_" + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + inp.charAt(2) + space + "_" + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c3 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + inp.charAt(2) + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c3 = true;
                c4 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + inp.charAt(2) + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c3 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + "_" + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + "_" + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c4 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + "_" + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1)+ space + inp.charAt(2) + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c2 = true;
                c3 = true;
                c4 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1)+ space + "_" + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c2 = true;
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1)+ space + inp.charAt(2) + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c2 = true;
                c3 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + "_"+ space + inp.charAt(2) + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c3 = true;
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) != mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + inp.charAt(2) + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c3 = true;
                c4 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + inp.charAt(2) + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c3 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + "_" + space + inp.charAt(2) + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c3 = true;
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) == mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println(inp.charAt(0) + space + inp.charAt(1) + space + "_" + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c1 = true;
                c2 = true;
                c4 = true;
                c5 = true;
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) == mW.charAt(1) && inp.charAt(2) == mW.charAt(2) && inp.charAt(3) == mW.charAt(3) && inp.charAt(4) == mW.charAt(4)){
                System.out.println("_" + space + inp.charAt(1) + space + inp.charAt(2) + space + inp.charAt(3) + space + inp.charAt(4));
                tr = tr + 1;
                recor();
                c2 = true;
                c3 = true;
                c4 = true;
                c5 = true;
                }//correct letters that have not already been guessed in their positions (238 - 299)
            else if(inp.charAt(0) == mW.charAt(0)&& c1 != true){
                System.out.println(inp.charAt(0) + space + "_" + space + "_" + space + "_" + space + "_");
                c1 = true;
                tr = tr + 1;
                rec = rec + inp.charAt(0) + inp.charAt(1) + inp.charAt(2) + inp.charAt(3) + inp.charAt(4);
                System.out.println("Letters guessed: " + rec);
            }
            else if(inp.charAt(1) == mW.charAt(1)&& c2 != true){
                System.out.println("_" + "" + inp.charAt(1) + space + "_" + space + "_" + space + "_");
                c2 = true;
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(2) == mW.charAt(2)&& c3 != true){
                System.out.println("_" + space + "_" + space + inp.charAt(2) + space + "_" + space + "_");
                c3 = true;
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(3) == mW.charAt(3)&& c4 != true){
                System.out.println("_" + space + "_" + space + "_" + space + inp.charAt(3) + space + "_");
                c4 = true;
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(4) == mW.charAt(4)&& c5 != true){
                System.out.println("_" + space + "_" + space + "_" + space + "_" + space + inp.charAt(4));
                c5 = true;
                tr = tr + 1;
                recor();
            }//no correct letters but letters in correct places already guessed (65 -89)
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 != true&& c2 != true&& c3 != true&& c4 != true&& c5 != true){
                System.out.println("_" + space + "_" + space + "_" + space + "_" + space + "_");
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 == true&& c2 != true&& c3 != true&& c4 != true&& c5 != true){
                System.out.println(inp.charAt(0) + space + "_" + space + "_" + space + "_" + space + "_");
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 != true&& c2 == true&& c3 != true&& c4 != true&& c5 != true){
                System.out.println("_" + space + inp.charAt(1) + space + "_" + space + "_" + space + "_");
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 != true&& c2 != true&& c3 == true&& c4 != true&& c5 != true){
                System.out.println("_" + space + "_" + space + inp.charAt(2) + space + "_" + space + "_");
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 != true&& c2 != true&& c3 != true&& c4 == true&& c5 != true){
                System.out.println("_" + space + "_" + space + "_" + space + inp.charAt(3) + space + "_");
                tr = tr + 1;
                recor();
            }
            else if(inp.charAt(0) != mW.charAt(0) && inp.charAt(1) != mW.charAt(1) && inp.charAt(1) != mW.charAt(1) && inp.charAt(2) != mW.charAt(2) && inp.charAt(3) != mW.charAt(3) && inp.charAt(4) != mW.charAt(4)&& c1 != true&& c2 != true&& c3 != true&& c4 != true&& c5 == true){
                System.out.println("_" + space + "_" + space + "_" + space + "_" + space + inp.charAt(4));
                tr = tr + 1;
                recor();
            }
        }
    }
    static void recor(){
        rec = rec + inp.charAt(0) + inp.charAt(1) + inp.charAt(2) + inp.charAt(3) + inp.charAt(4);
        System.out.println("Letters guessed: " + rec);
        System.out.println("Tries left: " + (7 - tr));
    }
}
