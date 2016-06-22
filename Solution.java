class Solution {
    
    int[] numbers;
    
    public boolean solution(int[] A) {

        int first=0;
        int minValue=0;
        int second=0;

        int flag=1;
        for(int i=0;i<A.length - 2 ;i++)
        {

            if(A[i] > A[i+1])
            {
                first = i;
                minValue = A[i+1];
                second = i + 1;
            }

            if(A[i] < minValue)
            {
                minValue = A[i];
                second = i;
            }
            
        }

        
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;

        numbers = A;
        numbers = sort(numbers);
        
        for(int i = 0; i < A.length; i++)
        {
            
                if(A[i] != numbers[i])
                {
                    flag=0;
                    
                }

            
        }

        if(flag==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

  public int[] sort(int[] number) {
    for(int i=0;i<number.length -1 ; i++)
        {
            for(int j=0; j < number.length -1 ;j++)
            {
                if(number[i]<number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        return number;
    
  }

 public static void main(String s[])
 {
        Solution sol = new Solution();
        int[] arr = {1,7,5,2,9};
        System.out.println(sol.solution(arr));
 }

}