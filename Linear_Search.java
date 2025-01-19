package dsa;

public class Linear_Search {
	
	public static void main(String[] args)
	{
		int[] nums = {22,55,66,85,263,2,95,6,2};
		System.out.println(linearsearch(nums,88));
	}
	
	static int linearsearch(int[] arr, int target)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
}
