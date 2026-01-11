class SmallestElement
{
    public static void main(String[]args)
    {
        int n = 5;
        int [] a = {13,47,60,21,8};
        int min = a[0];
        for(int i=0; i<n; i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.print("Smallest element:"+ min);
    }
}
