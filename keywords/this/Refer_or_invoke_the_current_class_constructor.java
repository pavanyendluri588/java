class Refer_or_invoke_the_current_class_constructor
   {
        public static void main(String args[])
           {
               Normal_class  obj = new  Normal_class();
           }
   }
class Normal_class
   {
      Normal_class()
         {
              
             System.out.println("this is the constructor");
         }
      Normal_class(int x)
         {
             this();
             System.out.println("this is the constructor of one parameter");
         }


     //calling the class constructor using this
    
/*
         {
             System.out.println("this is in the Normal_Class class constructor  invoking using the using the thhis keyword");
         }
*/
   }