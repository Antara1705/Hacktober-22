import java.util.*;
public class Practice5
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[5];
        System.out.println("Enter The Numbers: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j =((arr.length)-1); j>=0; j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}