class Main {
    
    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("abcdefghij"));
    };

    static StringBuilder stringCompression(String string){
        int indexFrom = 0;
        int indexTo = 0;
        char currentChar = string.charAt(indexFrom);
        int charCount = 0;
        StringBuilder result = new StringBuilder();
        while(indexTo < string.length()){
            if(currentChar == string.charAt(indexTo)){
                charCount++;
                indexTo++;
            } else {
                result.append(currentChar + Integer.toString(charCount));
                indexFrom = indexTo;
                currentChar = string.charAt(indexFrom);
                charCount = 0;
            };
            if(result.length() > string.length()){
                return new StringBuilder(string);
            }
        };
        result.append(currentChar + Integer.toString(charCount));
        return result;
    };

}
