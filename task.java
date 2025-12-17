public class task {

    public static String generateUsername(String fullName) {
        String processed = fullName.toLowerCase().replace(" ", ".");
        StringBuilder result = new StringBuilder("");
        for (char c : processed.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String name = "Keerthi Daroju";
        String username = generateUsername(name);
        System.out.println("Original name: " + name);
        System.out.println("Username: " + username);
    }
}