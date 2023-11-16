public class MysteryCode {
    //Variables
    static String userInput = "programming is easy";
    static String modString = "";
    static String upperOrLower;

    public static void main(String[] args) {
        for(int i = 0; i < userInput.length(); i++){
            if(!userInput.substring(i, i+1).equals(" ")){
                modString += userInput.substring(i, i + 1);
            }
        }

        //Look at end of code
        reset();

        //For for making word alternating upper and lower case.
        for (int i = 1; i <= userInput.length(); i++) {
            upperOrLower = userInput.substring(i - 1, i);
            if (i % 2 == 0) {
                upperOrLower = upperOrLower.toUpperCase();
            } else {
                upperOrLower = upperOrLower.toLowerCase();
            }
            modString += upperOrLower + " ";
        }

        reset();

        System.out.println(userInput);

        //For for removing parts of the string
        for (int j = 0; j < userInput.length(); j++) {
            if(!userInput.substring(j, j+1).equals(" ")){
                modString += userInput.substring(j, j + 1);
            }
        }

        reset();
        System.out.println(userInput);

        //Controls output of previous for
        while (userInput.length() > 1) {
            for (int j = 0; j < userInput.length(); j+=2) {
                modString += userInput.substring(j, j + 1);
            }
            reset();
            System.out.println(userInput);
        }
    }

    //Resets variables in-between uses to avoid errors.
    public static void reset() {
        userInput = modString;
        modString = "";
    }
}
