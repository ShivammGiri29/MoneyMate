package UTILITY;

public class AccountNumberGenerator {
    public static String generateAccountNumber() {
        long accNo = 1000000000L + (long)(Math.random() * 9000000000L); 
        return String.valueOf(accNo);
    }


}
