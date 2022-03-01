class Basic_synatx_of_method_overriding
  {
      public static void main(String args[])
        {
            child_class obj = new child_class();
            obj.sum(5,6);
        }
  }
  class parent_class 
     {
                void sum(int num1, int num2)
                  {
                      System.out.println(num1 + " + " + num2 + " = " + num1+num2);
                  }
     }
class child_class extends parent_class
    {
        void sum(int num1,int num2)
           {
               System.out.println(num1 + " + " + num2 + " =  " + num1+ num2);
           }
    }