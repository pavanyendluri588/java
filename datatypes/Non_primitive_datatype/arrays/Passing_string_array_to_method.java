class Passing_string_array_to_method
    {
      public static void array_string_printer(String arry1[])
         {
              for(String i:arry1)
                  {
                        System.out.println(i);
                  }
         }
      public static void main(String[] args)
         {
          String arry[]={"apple","banana","mango","orange","grapes"};
          array_string_printer(arry);
         }
    }