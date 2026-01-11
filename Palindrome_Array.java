class PalindromeArray{
    public static void main(String[]args)
    {
        int n = 5;
        int [] a = {1,2,3,2,1};
        
        boolean isPalindrome = true;
        
        for(int i=0; i<n/2; i++)
        {
            if(a[i]!=a[n-1-i]){
                isPalindrome = false;
                break;
            }
        }
        
        if(isPalindrome)
        {
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not Palindrome");
        }
    }
}
