import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindromPermutation("tact coa"));
        System.out.println(isPalindromPermutation("not a palindrome"));
    };

    static boolean isPalindromPermutation(String str){
        char[] charArray = str.replaceAll(" ", "").toCharArray();
        HashMap<Character, Integer> frequencies = convertToHash(charArray);
        int oddCount = 0;
        for(Integer frequency : frequencies.values()){
            if(frequency % 2 != 0){
                oddCount++;
                if(oddCount > 1){
                    break;
                }
            };
        };
        if(isEven(charArray)){
            return oddCount == 0;
        } else {
            return oddCount == 1;
        }
    };

    static boolean isEven(char[] characters){
        return characters.length % 2 == 0;
    };

    static HashMap<Character, Integer> convertToHash(char[] characters){
        HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
        for(int i = 0; i < characters.length; i++){
            char character = characters[i];
            if(characterFrequencies.containsKey(character)){
                int frequency = characterFrequencies.get(character);
                characterFrequencies.put(character, frequency + 1);
            } else {
                characterFrequencies.put(character, 1);
            };
        };
        return characterFrequencies;    
    };

}