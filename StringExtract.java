public class StringExtract {
    public static void main(String[] args) {
        String str = "t6hj3ui";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

     if (Character.isLetter(ch)) {
      result.append(ch);
           } 
      else if (Character.isDigit(ch)) {
        int count = Character.getNumericValue(ch);
              if (result.length() > 0) {
             char prevChar = result.charAt(result.length() - 1);
        
          for (int j = 0; j < count; j++) {
        result.append(prevChar);
 }
    }
 }
      }

        System.out.print(result.toString());
    }
}
