import java.util.*;
class Main
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[]args)
{
    System.out.print("Enter no.of array elements: ");
    int n = sc.nextInt();
    
    int [] a = new int[n];
    
    System.out.println("Enter array elements:");
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
    
    System.out.print("Array elements: ");
    System.out.print("[");
    for(int i=0; i<n; i++)
    {
        System.out.print(a[i]);
        if(i<n-1)
        {
            System.out.print(",");
        }
    }
    System.out.print("]");
}
}
