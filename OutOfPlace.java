//package OutOfPlace;
import java.util.*;
import java.io.*;

public class OutOfPlace  
{ 
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(new File("outofplace.in"));
        int n = sc.nextInt();
        
        int[] order = new int[n];
        for(int i = 0; i < n; i++)
        {
            order[i] = sc.nextInt();
        }
        //solution
        int numSwaps = 0;
        int[] sorted = order.clone();
        Arrays.sort(sorted); // sorted copy

        for(int i = 0 ; i < n; i++)
        {
            if(order[i] != sorted[i]) //swap
            {
                numSwaps++;
            }
        }
        //output
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("outofplace.out")));
        bw.write("" + Math.max(0,numSwaps - 1));
        bw.close();
    }
}
