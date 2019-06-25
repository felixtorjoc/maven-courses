package ro.itschool.mvnbase;

public class CheckIfStringIsPalindrome {

    public boolean checkIfPalindrome(String theString){
        String stringNoSpace = theString.replaceAll("\\s+", "");
        char[] theCharArray = stringNoSpace.toCharArray();
        boolean control=true;

        for (int i=0; i<theCharArray.length; i++){
            if (theCharArray[i] != theCharArray[theCharArray.length - i-1]){
                control=false;
            }
        }
        return control;
    }
}
