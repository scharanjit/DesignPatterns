package datastructure.greedyalgo;

/*
Any garbage collection algorithm must perform 2 basic operations.
One, it should be able to detect all the unreachable objects and
secondly, it must reclaim the heap space used by the garbage objects and
make the space available again to the program.
The above operations are performed by Mark and Sweep Algorithm in two phases:
1) Mark phase
2) Sweep phase
 */
public class MarkSweepAlgo {
    public static void main(String[] args) {

    }
}
//Disadvantages
//fragmentation 12 are empty needed 10 but they are in small fragments
//It freezes the current executing program

/*
Advantages of Mark and Sweep Algorithm

It handles the case with cyclic references, even in case of a cycle,
this algorithm never ends up in an infinite loop.
There are no additional overheads incurred during the execution of the algorithm.
Disadvantages of Mark and Sweep Algorithm

The main disadvantage of the mark-and-sweep approach is the fact
 that that normal program execution is suspended while the garbage
  collection algorithm runs.
Other disadvantage is that, after the Mark and Sweep Algorithm is run
 several times on a program, reachable objects end up being separated by many,
 small unused memory regions.
 */