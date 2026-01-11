class LargestElement
{
    public static void main(String[]args)
    {
        int n = 5;
        int [] a = {13,47,60,21,8};
        int max = a[0];
        for(int i=0; i<n; i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.print("Largest element:"+ max);
    }
}
