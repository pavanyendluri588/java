class inserting_at_end
{
	String inserting_at_end(int arr[],int orginal_size,int num)
	{
          if (orginal_size == arr.length)
          	  return "insertion is not possible";

          arr[arr.length-1]=num;
          for (int i:arr)
          	System.out.println(i);
          return "insertion is completed";
	}

	public static void main(String args[])
	{
       inserting_at_end obj = new inserting_at_end();
       int arr[]= new int[5];
       arr[0]=2;
       arr[1]=3;
       arr[2]=4;
       System.out.print(obj.inserting_at_end(arr,3,5));
	}
}