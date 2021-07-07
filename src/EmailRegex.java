import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class EmailRegex {
        public static void main(String[] args) {
            String email = "abc@bridgelabz.com";
              String regex = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            boolean result = matcher.matches();
            if(result)
                System.out.println("Vaild Email");
            else
                System.out.println("InVaild Email");
        }
    }