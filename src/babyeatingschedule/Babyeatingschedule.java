
package babyeatingschedule;
public class Babyeatingschedule {

       public static void main(String[] args) {
 
        double totalPorridge = 2.0; // in liters
        double totalMilk = 2.0; // in liters
       
        double halfCup = 0.5; // half cup is 0.5 liters
        double porridgeFeedingTime = 45; // in minutes
        double milkFeedingTime = 30; // in minutes
       
        double totalTime = 0;

        while (totalPorridge > 0 || totalMilk > 0) {
            if (totalPorridge > 0) {
                totalPorridge -= halfCup;
                totalTime += porridgeFeedingTime;
            }

            if (totalMilk > 0) {
                totalMilk -= halfCup;
                totalTime += milkFeedingTime;
            }
        }

        System.out.println("Total time taken for the baby to finish both the porridge and milk: " + totalTime + " minutes");
    }
}

       
    
    

