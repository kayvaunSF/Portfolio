package Assignment4PartE;

/**
 *
 * Part E
 *
 */

import java.util.PriorityQueue;

public class SFSUOneStop {
	
   public static void display(PriorityQueue<Student> oneStopPQ, String priority) {
       System.out.println("Priority: " + priority);
      
       while (!oneStopPQ.isEmpty())
           System.out.println(oneStopPQ.poll());
       System.out.println();
   }
}
