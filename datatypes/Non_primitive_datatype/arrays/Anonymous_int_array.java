class Anonymous_int_array
    {
      static void method(int arry[])
         {
             for(int i:arry)
                 {
                      System.out.println(i);
                 }
             
         }
      public static void main(String[] main)
         {
             /*
             //syntax of declareing a anonymous array
             method_or_function_nmae(new datatype[]{values});
             */
             method(new int[]{1,2,3,4,5,6,7,8,9,10});
         }
    }