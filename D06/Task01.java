import java.util.*;

class Task01 {

    static Map<Character, ArrayList<String>> dictionary = new HashMap<>();

    public void storeWord(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
		ArrayList<String> wordList;
        if (dictionary.get(firstChar) == null) { // Check if char allready Exists
            wordList = new ArrayList<>();
        } else {
            wordList = dictionary.get(firstChar);
        } 
		wordList.add(word);
		Collections.sort(wordList);
		dictionary.put(firstChar, wordList);
    }

    public void printAllDictionary() {
        for (Map.Entry<Character, ArrayList<String>> set : dictionary.entrySet()) {
            System.out.println(set.getKey() + "=" + set.getValue());
        }
    }

    public void printListForSpecificChar(Character character) {
        ArrayList<String> list = dictionary.get(character);
        System.out.println(character + "=" + list);
    }

    public static void main(String args[]) {
        Task01 dict = new Task01();
        dict.storeWord("hossam");
        dict.storeWord("Nader");
        dict.storeWord("Ahmed");
        dict.storeWord("ali");
        dict.storeWord("mahmoud");
        dict.storeWord("ramy");
        dict.storeWord("basem");

        //if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                dict.storeWord(args[i]);
            }
            dict.printAllDictionary();
            System.out.println("#######################################");
            System.out.println("List For Specific Char");
            dict.printListForSpecificChar('a');
            dict.printListForSpecificChar('g');
        //} else {
            //System.out.println("Please enter some strings First ");
        //}
    }
}
