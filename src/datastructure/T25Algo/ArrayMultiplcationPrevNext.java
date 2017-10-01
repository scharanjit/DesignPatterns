package datastructure.T25Algo;


/**
 * Given an array of integers, update every element with multiplication
 * of previous and next elements with following exceptions.
 a) First element is replaced by multiplication of first and second.
 b) Last element is replaced by multiplication of last and second last.

 Input: arr[] = {2, 3, 4, 5, 6}
 Output: arr[] = {6, 8, 15, 24, 30}

 // We get the above output using following
 // arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}

 Time Complexity :O(N)
 Space Complexity :O(1
 */
public class ArrayMultiplcationPrevNext {


    public void multiply(int[] arr){

        if(arr.length<1)
            return;
        int prev=arr[0];
        arr[0]=arr[0]*arr[1];

        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i];
            arr[i]=prev*arr[i+1];
            prev=curr;
        }

        arr[arr.length-1]=prev*arr[arr.length-1];

    }

    public static void main(String[] args) {
        ArrayMultiplcationPrevNext arrayMultiplcationPrevNext= new ArrayMultiplcationPrevNext();

        int arrM[]={1,2,3,4,5,6};
        for(int i=0;i< arrM.length;i++){
            System.out.print(arrM[i]+" ");
        }
        System.out.println();
        arrayMultiplcationPrevNext.multiply(arrM);

        for(int i=0;i< arrM.length;i++){
            System.out.print(arrM[i]+" ");
        }

    }


}
