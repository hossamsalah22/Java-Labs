import java.util.*;

class Task01 {

    static Map<Integer, ArrayList<String>> dictionary;

    public Task01() {
        dictionary = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            dictionary.put(i + 97, new ArrayList<String>());
        }
    }

    public void storeWords(String newWord) {
        int firstChar = Character.toLowerCase(newWord.charAt(0));
        ArrayList<String> tmp = dictionary.get(firstChar);
        tmp.add(newWord);
        Collections.sort(tmp);
        dictionary.put(firstChar, tmp);
    }

    public void printAllDictionary() {
        for (Map.Entry<Integer, ArrayList<String>> set : dictionary.entrySet()) {
            char ch = (char) set.getKey().intValue();
            System.out.println(ch + ":" + set.getValue());
        }
    }

    public void printSpecificChar(Character character) {
        int charKey = Character.toLowerCase(character);
        ArrayList<String> list = dictionary.get(charKey);
        char ch = (char) character;
        System.out.println(ch + ":" + list);
    }

    public static void main(String args[]) {
        Task01 dict = new Task01();
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                dict.storeWords(args[i]);
            }
            dict.printAllDictionary();
            dict.printSpecificChar('a');
        } else {
            System.out.println("Please enter some strings First ");
        }
    }
}
