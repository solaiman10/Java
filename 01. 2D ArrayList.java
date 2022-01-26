package lang;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimentionArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        // declaration 2D array
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        int row = r.nextInt();
        int col = r.nextInt();

        for(int i=0; i<row; i++){
            // create another list of arr[i] = [, , , ....., ]
            arr.add(new ArrayList<>());
            for(int j=0; j<col; j++){
                int data = r.nextInt();
                arr.get(i).add(data);
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
