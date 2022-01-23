class Method_syntax
   {
      //user defined functions
      //basic syntax
      /*
         return_type  method_name()
             {
                  //mrthod body
             }
      */   
         static int  addnum(int a1,int b1)
           {
               int sum=a1+b1;
            
            return sum;
           }
      public static void main(String[] args)
         {
            //main method the class execution starts from here
         //creatting a object for main
           //Main obj =new  Main();

          int x= /*obj.*/addnum(5,6);
          System.out.println("sum = " + x);
         }
   }