import java.util.HashMap;

class Main{

    public static void main(String[] args){
        System.out.println(checkPermutation("ABCDEFGHIJ", "HGBFIAJEDC"));
        System.out.println(checkPermutation("ABCDEFGHIJ", "HGGBFIAJEDCJ"));
    };

    static boolean checkPermutation(String stringA, String stringB){
        if(stringA.length() != stringB.length()){
            return false;
        };
        HashMap<Character, Integer> stringACharacterFrequencies = translateStringToHash(stringA);
        for(int j = 0; j < stringB.length(); j++){
            Character character = stringB.charAt(j);
            if(!stringACharacterFrequencies.containsKey(character)){
                return false;
            } else {
                int freq = stringACharacterFrequencies.get(character);
                if(freq < 0){
                    return false;
                } else {
                    stringACharacterFrequencies.put(character, freq - 1);
                };
            };
        };
        return true;
    };

    static HashMap<Character, Integer> translateStringToHash(String string){
        HashMap<Character, Integer> stringCharacterFrequencies = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++){
            Character character = string.charAt(i);
            if(stringCharacterFrequencies.containsKey(character)){
                int freq = stringCharacterFrequencies.get(character);
                stringCharacterFrequencies.put(character, freq + 1);
            } else {
                stringCharacterFrequencies.put(character, 0);
            }
        };
        return stringCharacterFrequencies;
    };

}