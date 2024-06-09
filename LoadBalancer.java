public class LoadBalancer {
    public static void main(String[] args) {
        String[] tasks = {"task1_light", "task2_heavy", "task3_light", "task4_heavy"};

        //Split tasks pairwise to balance the load
        String[] server1 = new String[tasks.length / 2]; //to hold the tasks for each server1
        String[] server2 = new String[tasks.length / 2]; //to hold the tasks for each server2

/*Task distribution: The loop iterates over the tasks array.
 * Tasks are assigned to server1 if the index is even and -
 * to server 2 if the index is odd.
 */
        for(int i = 0; i < tasks.length; i++) {
            if (i % 2 == 0) {
                server1[i/2] = tasks[i];
            }else {
                server2[i/2] = tasks[i];
            }
        }
        //Output tasks for each server
        System.out.println("Server 1 tasks: " + java.util.Arrays.toString(server1));
        System.out.println("Server 2 tasks: " + java.util.Arrays.toString(server2));
    }
    //Method to swap pairs in the array
    public static void swapPairs(String[] strings) {
        int length = strings.length;
        for (int i = 0; i<length -1; i +=2) {
            String temp = strings[i];
            strings[i] = strings[i+1];
            strings[i+1] = temp;   
        }
    }  
}
