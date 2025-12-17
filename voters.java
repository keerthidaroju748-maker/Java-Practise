import java.util.Scanner;

public class voters {
    static int bjp=0, congress=0, brs=0, bsp=0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of voters: ");
        int totalVoters = sc.nextInt();
        
        for(int i=0; i<totalVoters; i++) {
            System.out.print("Voter " + (i+1) + " - Age: ");
            int age = sc.nextInt();
            
            if(age < 18) {
                System.out.println("Under 18 - No vote!");
                continue;
            }
            
            System.out.print("Choose: 1-BJP 2-Congress 3-BRS 4-BSP: ");
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1: bjp++; break;
                case 2: congress++; break;
                case 3: brs++; break;
                case 4: bsp++; break;
            }
        }
        
        System.out.println("\n=== VOTING RESULTS ===");
        System.out.println("BJP: " + bjp);
        System.out.println("Congress: " + congress);
        System.out.println("BRS: " + brs);
        System.out.println("BSP: " + bsp);
        System.out.println("Total valid votes: " + (bjp+congress+brs+bsp));
sc.close();
int max = Math.max(Math.max(bjp, congress), Math.max(brs, bsp));
        System.out.println("\n=== WINNER ===");
        if(bjp == max) System.out.println("WINNER: BJP");
        else if(congress == max) System.out.println("WINNER: Congress");
        else if(brs == max) System.out.println("WINNER: BRS");
        else System.out.println("WINNER: BSP");
    }
}
