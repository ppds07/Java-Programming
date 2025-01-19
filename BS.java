package dsa;

public class BS {
	static int search(int[] arr, int target, int start, int end)
	{
		if(start>end)
		{
			return -1;
		}
		
		int middle=start+(end-start)/2;
		if(arr[middle]==target)
		{
			return middle;
		}
		if(target<arr[middle])
		{
			return search(arr, target, start, middle-1);
		}
		else
		{
			return search(arr, target, middle+1,end);
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,0};
		int target = 4;
		System.out.println(search(nums, target, 0, nums.length-1));
	}
	
	

}
