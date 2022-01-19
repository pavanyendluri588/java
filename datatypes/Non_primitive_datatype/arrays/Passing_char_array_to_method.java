class Passing_char_array_to_method
    {
      public static void array_string_printer(char arry1[])
         {
              for(char i:arry1)
                  {
                        System.out.println(i);
                  }
         }
      public static void main(String[] args)
         {
          char arry[]={'a','b','m','o','g'};
          array_string_printer(arry);
         }
    }