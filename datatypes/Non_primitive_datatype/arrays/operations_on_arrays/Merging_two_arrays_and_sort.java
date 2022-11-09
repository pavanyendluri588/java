class Merging_two_arrays_and_sort
{
    int[] merg_two_arr_and_sort(int arr1[],int arr2[])
    {
    	int arr3_size= arr1.length+arr2.length;
    	int arr3[]= new int[arr3_size];
    	for(int i=0;i<arr1.length;i++){
    		arr3[i]=arr1[i];
    	}
    	int count=0;
    	for(int i = arr1.length;i<arr3.length;i++)
    	{
    		arr3[i]=arr2[count];
    		count=count+1;;
    	}
    	return sort(arr3);
    }
	public static void main(String args[])
	{
		Merging_two_arrays_and_sort obj =new Merging_two_arrays_and_sort();
         int arr1[]=new int[5];
         arr1[0]=1;
         arr1[1]=2;
         arr1[2]=3;
         arr1[3]=4;
         int arr2[] = new int[5];
         arr2[0]=6;
         arr2[1]=7;
         arr2[2]=8;
         arr2[3]=9;
         arr2[4]=10;
         for(int i:obj.merg_two_arr_and_sort(arr1,arr2))
         	System.out.println(i);
	}
}