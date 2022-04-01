class Refer_the_current_class_method
   {
        public static void main(String args[])
           {
               method_check_with_this obj = new method_check_with_this();
              obj.n();
           }
   }
class method_check_with_this
   {

     void m()
       {
          System.out.println("---------->>this is method m()");
       }

     void n()
       {
          System.out.println("this  is method n()");
            //m() is same with this.m()
            System.out.println("this is m() method without this\n===========================");
            m();
            System.out.println("=====================\nthis is this.m() method without this\n================================");
           this.m();
           System.out.println("=================================");
            
       }
   }