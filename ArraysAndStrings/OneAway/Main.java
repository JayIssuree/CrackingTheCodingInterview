import java.util.function.BiConsumer;

import javax.print.event.PrintEvent;

public class Main {
    
    public static void main(String[] args){
        String A = "palel";
        String B = "lapel";
        System.out.println(oneAway(A, B));
    }

    static boolean oneAway(String stringA, String stringB){
        if(isWithinLength(stringA, stringB)){
            int bIndex = 0;
            int aIndex = 0;
            int differenceCount = 0;
            while(aIndex < stringA.length() && bIndex < stringB.length()){
                if(stringA.charAt(aIndex) != stringB.charAt(bIndex)){
                    differenceCount++;
                    if(differenceCount > 1){
                        return false;
                    }
                    if(stringA.length() > stringB.length()){
                        aIndex++;
                    } else if(stringB.length() > stringA.length()){
                        bIndex++;
                    } else {
                        aIndex++;
                        bIndex++;
                    }
                } else {
                    aIndex++;
                    bIndex++;
                };
            };
        };
        return true;
    };

    static boolean isWithinLength(String stringA, String stringB){
        int aLength = stringA.length();
        int bLength = stringB.length();
        return bLength == aLength || bLength == aLength + 1 || bLength == aLength - 1;
    };

}