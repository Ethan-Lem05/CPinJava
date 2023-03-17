//package CircularBarn;

import java.util.*;
import java.io.*;
public class Main {
    // sum(number of cows per room)
    public static void main(String[] args) throws IOException
    {
        Scanner sc =  new Scanner(new File("cbarn.in"));
        
        int n = sc.nextInt();
        int[] rooms = new int[n];
        for(int i = 0; i < n; i++)
        {
            rooms[i] = sc.nextInt();
        }
        //solution
        int[] steps = new int[n];
        for(int i = 0; i < n; i++)
        {
            int totalSteps = 0;
            int relativeIndex = 0;
            for(int j = i; relativeIndex < n; j++)
            {
                totalSteps += relativeIndex*rooms[j];
                if(j == n - 1) // reset loop
                {
                    j = -1;
                }
                relativeIndex++;
            }
            steps[i] = totalSteps;
        }
        //output
        Arrays.sort(steps);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("cbarn.out")));
        bw.write("" + steps[0]);
        bw.close();
    }
}
