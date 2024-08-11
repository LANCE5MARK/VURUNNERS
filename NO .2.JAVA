public class Runner {
   public static void main(String[] args) {
      // Given data
      String[] names = {
         "Elena",
         "Thomas",
         "Hamilton",
         "Suzie",
         "Phil",
         "Matt",
         "Alex",
         "Emma",
         "John",
         "James",
         "Jane",
         "Emily",
         "Daniel",
         "Neda",
         "Aaron",
         "Kate"
      };
      int[] times = {
         341,
         273,
         278,
         329,
         445,
         402,
         388,
         275,
         243,
         334,
         412,
         393,
         299,
         343,
         317,
         265
      };

      // Find the fastest runner
      int fastestRunnerIndex = findFastestRunner(names, times);
      String fastestRunnerName = names[fastestRunnerIndex];
      int fastestRunnerTime = times[fastestRunnerIndex];
      System.out.println("Fastest runner: " + fastestRunnerName + " with a time of " + fastestRunnerTime + " minutes");

      // Find the second fastest runner
      int secondFastestRunnerIndex = findSecondFastestRunner(names, times);
      String secondFastestRunnerName = names[secondFastestRunnerIndex];
      int secondFastestRunnerTime = times[secondFastestRunnerIndex];
      System.out.println("Second fastest runner: " + secondFastestRunnerName + " with a time of " + secondFastestRunnerTime + " minutes");
   }

   public static int findFastestRunner(String[] names, int[] times) {
      int fastestRunnerIndex = 0;
      for (int i = 1; i < times.length; i++) {
         if (times[i] < times[fastestRunnerIndex]) {
            fastestRunnerIndex = i;
         }
      }
      return fastestRunnerIndex;
   }

   public static int findSecondFastestRunner(String[] names, int[] times) {
      int secondFastestRunnerIndex = 0;
      for (int i = 1; i < times.length; i++) {
         if (times[i] < times[secondFastestRunnerIndex]) {
            secondFastestRunnerIndex = i;
         }
      }
      return secondFastestRunnerIndex;
   }
}