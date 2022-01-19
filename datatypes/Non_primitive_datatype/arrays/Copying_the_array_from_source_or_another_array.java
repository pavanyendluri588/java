class Copying_the_array_from_source_or_another_array
   {
     public static void main(String[] args)
         {
              //creating the orginal or source array
              char arr[]={'p','a','v','a','n','r','a','m','c','h','a','n','d','a','r'};
              
              //creating a duplicate array of size 5
              char arr_copy[]=new char[5];
              
              //copying the array starting index is 3 in source array
              //System.arraycopy(obj sorce_array_name,int sorce_start_index,obj copy_array_name,int copy_array_start_index,int copy_array_end_index);
              System.arraycopy(arr,3,arr_copy,0,5);
               
              //printing the copy array
              for(int i=0;i<arr_copy.length;i++)
                  {
                     System.out.print(arr_copy[i]);
                  } 

              //output:anram
         }
   }