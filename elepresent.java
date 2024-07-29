import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int x[]=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
        {
            x[i]=t.nextInt();
        }
        int val=t.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==val)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Elusive Artifact Found!");
        }
        else
        {
            System.out.println("Elusive Artifact Not Found!");
        }
    }
}
