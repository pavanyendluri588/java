class Using_this_keyword_th_invoke_or_call_the_current_class_method
   {
       //no difference in invoking the method with or without this keyword .
     public static void main (String[] args)
        {
            demo obj = new demo();
            obj.n();
            demo1 obj1 = new demo1();
            obj1.n();
        }
   }
class demo
   {
       void m(){
            System.out.println("m method in the demo class");
       }
       void n(){
           this.m();
           System.out.println("n method in the demo class");
       }
   } 
class demo1
   {
       //without using this keyword in method  
       void m(){
            System.out.println("m method in the demo class");
       }
       void n(){
           m();
           System.out.println("n method in the demo class");
       }
   }