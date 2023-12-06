// Basic Java Program

public class Main {
    public static void main(String[] args) {
        // make test calls to your methods here
        
    }



    /**
     * Sees if you and your date can get a seat at a resteraunt.
     * @param you a variable that givse the stylishness of you.
     * @param date a varaible that gives the stylishness of your date.
     * @return A number 0, 1, 2 0 being no, 1 being maybe, and 2 being yes.
     */
    public int dateFashion(int you, int date) {
        int intRestaurant;
        if (you >= 8 && date >= 3 || you >= 3 && date >= 8){
          intRestaurant = 2;
        }
        else if (date <= 2 || you <= 2){
          intRestaurant = 0;
        }
        else {
          intRestaurant = 1;
        }
        
        return intRestaurant;        
      }
      

      /**
       * A Adds the sum of two given numbers if the sum is between 10 and 19 then output 20;
       * @param a is the first amount
       * @param b is the second amount
       * @return the sum of the two amounts or 20 if the sum is between 10 and 19
       */
      public int sortaSum(int a, int b) {
        int intSum;
        if ((a + b) >= 10 && (a + b) <= 19){
          intSum = 20;
        }
        else{
          intSum = a + b;
        }
        return intSum;
      }
      
      /**
       * A code to double every character in the sentence
       * @param str is the sentence
       * @return the sentence with dobuel the letters.
       */
      public String doubleChar(String str) {
        String strDoubleChar = "";
        for (int i = 0; i < str.length(); i++){
          
          strDoubleChar = strDoubleChar + Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
          
          
         
        }
        
         return strDoubleChar;
      }
      
      /**
       * Returns the count of the word "co_e" in the sentence.
       * @param str is the sentence
       * @return the count.
       */
      public int countCode(String str) {
        int intCount = 0;
        for (int i = 0; i < str.length() - 3; i++){
          if (Character.toString(str.charAt(i)).equals("c") && Character.toString(str.charAt(i + 1)).equals("o") && Character.toString(str.charAt(i + 3)).equals("e")){
            intCount++;
          }
        }
        return intCount;
      }
      
      /**
       * Returns true or false if "b_b" is in the sentence
       * @param str is the sentence
       * @return true or false
       */
      public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++){
          if (Character.toString(str.charAt(i)).equals("b") && Character.toString(str.charAt(i + 2)).equals("b")){
            return true;
          }
          
        }
        return false;
        
      }
      
      /**
       * Repeats the given sentence in the given amount and substring.
       * @param str is the sentence
       * @param n is the amount
       * @return the sentence repeated user inputted
       */
      public String repeatEnd(String str, int n) {
        String strRepeat = "";
        int intLength = str.length();
        
        for (int i = 1; i <= n; i++){
          strRepeat += str.substring(intLength - n);
        }
        
        return strRepeat;
      }
      
      /**
       * 
       * @param str
       * @param n
       * @return
       */
      public boolean prefixAgain(String str, int n) {
        String strPrefix = str.substring(0, n);
        for (int i =n; i <= str.length() - n; i++){
          if (str.substring(i, i + n).equals(strPrefix)){
            return true;
            
          }
        }
        return false;
        
      }
      
      
    
}
