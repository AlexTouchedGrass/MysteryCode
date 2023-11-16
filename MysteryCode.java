
public class MysteryCode {
    public static void main(String[] args) {

          String userInput = "programming is easy";
          String b = "";
          String c;

          for(int i = 0; i < userInput.length(); i++){
              if(!userInput.substring(i, i+1).equals(" ")){
                  b += userInput.substring(i, i + 1);
              }
          }

          userInput = b;
          b = "";

          for (int i = 1; i <= userInput.length(); i++) {
              c = userInput.substring(i - 1, i);
              if (i % 2 == 0) {
                   c = c.toUpperCase();
              } else {
                  c = c.toLowerCase();
              }
              b += c + " ";
          }

          userInput = b;
          b = "";

          System.out.println(userInput);

          for (int j = 0; j < userInput.length(); j++) {
              if(!userInput.substring(j, j+1).equals(" ")){
                  b += userInput.substring(j, j + 1);
              }
          }

          userInput = b;
          b = "";

          System.out.println(userInput);

          while (userInput.length() > 1) {
              for (int j = 0; j < userInput.length(); j+=2) {
                  b += userInput.substring(j, j + 1);
              }
              userInput = b;
              b = "";
              System.out.println(userInput);
          }
    }
}
