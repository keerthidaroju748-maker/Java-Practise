public class palindrome {
    public static void main(String[] args) {
        String original = "civic";
        StringBuilder sb = new StringBuilder(original);
        
        if (original.equals(sb.reverse().toString())) {
            System.out.println("Palindrome");
        }
         else {
            System.out.println("Not Palindrome"); 
        }
    }
}

