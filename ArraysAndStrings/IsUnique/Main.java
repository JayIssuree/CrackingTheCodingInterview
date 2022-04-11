import java.util.HashMap;

class Main{

    public static void main(String[] args){
        System.out.println(isUniqe("Hello"));
        System.out.println(isUniqe("anpersumd"));
    };

    static boolean isUniqe(String string){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < string.length(); i++){
            char letter = Character.toUpperCase(string.charAt(i));
            if(map.containsKey(letter)){
                return false;
            } else {
                map.put(letter, 1);
            }
        };
        return true;
    };

};