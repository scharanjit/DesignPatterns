package datastructure.memorymanagement;


/**
 * Input : blockSize[]   = {100, 500, 200, 300, 600};
 * processSize[] = {212, 417, 112, 426};
 * Output:
 * Process No.	Process Size	Block no.
 *      1		    212		        2
 *      2		    417		        5
 *      3		    112		        2
 *      4		    426		    Not Allocated
 * Its advantage is that it is the fastest search as it searches only
 * the first block i.e. enough to assign a process.
 * It may problems of not allowing processes to take space even if
 * it was possible to allocate. Consider the above example, process number 4
 * (of size 426) does not get memory. However it was possible to allocate memory
 * if we had allocated using best fit allocation [block number 4 (of size 300) to
 * process 1, block number 2 to process 2, block number 3 to process 3 and block
 * number 5 to process 4].
 */
public class FirstFitAlgoMemManagement {

    // Method to allocate memory to blocks as per First fit
    // algorithm
    static void firstFit(int blockSize[], int m, int processSize[],
                         int n) {
        // Stores block id of the block allocated to a
        // process
        int allocation[] = new int[n];

        // Initially no block is assigned to any process
        for (int i = 0; i < allocation.length; i++)
            allocation[i] = -1;

        // pick each process and find suitable blocks
        // according to its size ad assign to it
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (blockSize[j] >= processSize[i]) {
                    // allocate block j to p[i] process
                    allocation[i] = j;

                    // Reduce available memory in this block.
                    blockSize[j] -= processSize[i];

                    break;
                }
            }
        }

        System.out.println("\nProcess No.\tProcess Size\tBlock no.");
        for (int i = 0; i < n; i++) {
            System.out.print("   " + (i + 1) + "\t\t" + processSize[i] + "\t\t");
            if (allocation[i] != -1)
                System.out.print(allocation[i] + 1);
            else
                System.out.print("Not Allocated");
            System.out.println();
        }
    }

    // Driver Method
    public static void main(String[] args) {
        int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int m = blockSize.length;
        int n = processSize.length;

        firstFit(blockSize, m, processSize, n);
    }
}
