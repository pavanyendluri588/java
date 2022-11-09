class Search_on_array
{
	 int search(int arr[],int target){
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==target){
				return 1;
			}

		}
	    return -1;
	}
	public static void main (String args[])
	{
		int i=2;
		int[] arr= new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		for (int j=0;j< arr.length;j++)
		{
			if (arr[j]==i){
				System.out.println("item found");
			}

		}

	    //passing array to the function 
	    Search_on_array a = new Search_on_array();
	    int ab= a.search(arr,2);
	    System.out.println(ab);

	}
	
}