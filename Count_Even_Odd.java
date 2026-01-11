class Main
{
    public static void main(String[]args)
    {
        int n = 5;
        int [] a = {1,2,3,4,5};
        int odd = 0, even =0;
        
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                even++;
            } else
            {
                odd++;
            }
        }
        System.out.println("Even count: "+ even + "\n"+ "Odd count: "+ odd );
    }
}
