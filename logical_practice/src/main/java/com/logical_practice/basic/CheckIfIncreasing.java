package com.logical_practice.basic;

//Write a program to convert the given array into ascending order. Note: We only allow a maximum of 2 changes and don't do the element same as both side elements(at that time return false)
public class CheckIfIncreasing {

  static boolean checkIfIncreasing(int arr[],int arr_len)
  {
      int n = arr_len;
      int change = 0;
      if(arr[0] > arr[1])
      {
          arr[0] = arr[1] / 2;
          change++;
      }
      for(int i = 1;i < n - 1;i++)
      {
          if((arr[i-1] < arr[i] && arr[i+1] < arr[i]) || 
          (arr[i-1] > arr[i] && arr[i+1] > arr[i]))
          {
              arr[i] = (arr[i-1] + arr[i+1]) / 2;
              if(arr[i] == arr[i-1] || arr[i] == arr[i+1])
              {
                  return false;
              }
              change++;
          }
      }
      if(arr[n-1] < arr[n-2])
          change++;
      //Here we checked the number of changes count is less than 2 or max
      if(change > 2)
          return false;
      return true;
  }
	public static void main(String[] args) 
	{
	    int arr[] = {1,3,2,4,4,5,5};
	    int arr_len = arr.length;
		System.out.println(checkIfIncreasing(arr,arr_len));
	}
}

