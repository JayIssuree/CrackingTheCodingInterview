class Main {

    public static void main(String[] args){
        String string = "Mr John Smith    ";
        char[] charArray = string.toCharArray();
        System.out.println(URLify(charArray, 13));
        replaceSpaces(charArray, 13);
        System.out.println(charArray);
    };

    static String URLify(char[] array, int trueStringLength){
        String answer = "";
        for(int i = 0; i < trueStringLength; i++){
            if(array[i] == ' '){
                answer += "%20";
            } else {
                answer += array[i];
            };
        };
        return answer;
    };

    static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0;
        int index;
        int i = 0;
        for(i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            };
        };
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length){
            str[trueLength] = '\0';
        };
        for(i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            };
        };
    };

}