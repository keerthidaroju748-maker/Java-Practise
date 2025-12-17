public class vowels {
   public static void main(String[] args) {
  
        String s = "Sathvikavaddepally";
     s = s.toLowerCase();
        int count = 0;
        for (int i=0; i<s.length(); i++) 
            {
                if(s.charAt(i)=='a'||(i)=='e'||(i)=='o'||(i)=='u'||(i)=='i'){
                   count++;
                }
            }
            System.out.println("Number of vowels: " +count);
    }
}
