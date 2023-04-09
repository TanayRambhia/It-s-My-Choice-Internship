// Java program to find maximum product subarray

import java.io.*;
class Product {
	public static void main(String[] args)
	{
		int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
		int result = arr[0];
		int n = arr.length;

		for (int i = 0; i < n; i++)
		{
			int mul = arr[i];
			// traversing in current subarray
			for (int j = i + 1; j < n; j++)
			{
				// updating result every time to keep an eye over the maximum product
				result = Math.max(result, mul);
				mul *= arr[j];
			}
			// updating the result for (n-1)th index.
			result = Math.max(result, mul);
		}
		System.out.println("Maximum Sub array product is "+ result);
	}
}

