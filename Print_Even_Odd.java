class Main
{
    public static void main(String[]args)
    {
        int n = 5;
        int [] a = {1,2,3,4,5};
        
        String even = " ", odd = " ";
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
                even += a[i]+ " ";
            else
                odd += a[i]+ " ";
        }
        System.out.println("Even elements:"+even);
        System.out.println("Odd elements:"+odd);
    }
}
