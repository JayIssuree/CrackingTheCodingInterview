class Main {
    
    public static void main(String[] args) {
        stringRotation("waterbottle", "ttlewaterbo");
        stringRotation("waterbottle", "botwatertle");
        System.out.println(solution("waterbottle", "ttlewaterbo"));
        System.out.println(solution("waterbottle", "botwatertle"));
    };

    static boolean stringRotation(String originalStr, String rotatedStr){
        if(originalStr.length() == rotatedStr.length()){
            for(int i = 0; i < originalStr.length(); i++){
                if(originalStr.charAt(i) == rotatedStr.charAt(0)){
                    int shiftedIndex = 0;
                    int originalIndex = i;
                    while(shiftedIndex < rotatedStr.length() && originalStr.charAt(originalIndex) == rotatedStr.charAt(shiftedIndex)){
                        originalIndex++;
                        shiftedIndex++;
                        if(originalIndex >= originalStr.length()){
                            originalIndex = 0;
                        };
                        if(shiftedIndex == rotatedStr.length()){
                            System.out.println("TRUE");
                            return true;
                        };
                    };
                };
            };
        };
        System.out.println("FALSE");
        return false;
    };

    static boolean solution(String stringA, String stringB){
        return(stringA.length() == stringB.length() && (stringA + stringA).contains(stringB));
    };

}
