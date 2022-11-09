class Inserting_array_element_at_req_index
{
	int inserting(int arr[],int orginal_size,int tindex, int tnum)
	{
		   System.out.println("arr.length"+arr.length);
           if (orginal_size == arr.length-1){
           	return arr.length;

           }
           for (int i=orginal_size;i>tindex;i--){
           	 arr[i]=arr[i-1];
           }
           arr[tindex]=tnum;
           for(int i: arr){
           	System.out.println(i);
           }
           return tindex;
	}

	public static void main(String[] args)
	{
       Inserting_array_element_at_req_index obj = new Inserting_array_element_at_req_index();
       int arr[]= new int[5];
       arr[0]=2;
       arr[1]=3;
       arr[2]=4;
       System.out.println(obj.inserting(arr,3,3,5));
	}
}