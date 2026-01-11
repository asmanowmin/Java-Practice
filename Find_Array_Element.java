class FindArrayElement{
    public static void main(String[]args)
    {
        int n = 5;
        int x = 3;
        int [] a = {1,2,3,4,5};
        
        for(int i=0;i<n;i++)
        {
            if(i==x)
            {
                System.out.println(a[i]);
            }
        }
    }
}
