
class Instance_variable {
      public static void main(String[] args)
          {
             
            //creating the object for class "A"
            A obj_a = new A("pavan",19,59,911056);
            
            System.out.println(obj_a.name);
            System.out.println(obj_a.age);
            System.out.println(obj_a.height);
            //System.out.println(obj_a.phone_number); phone_number is a variable that cannot be accessed outside of the class because of the access modifier is private.
          
            
            //creating the object for class "B"
            B obj_b = new B();
            System.out.println("printing address of the object obj_b            : " + obj_b);
            System.out.println("default value of the int instance variable      : " + obj_b.i);
            System.out.println("default value of the long instance variable     : " + obj_b.l);
            System.out.println("default value of the double instance variable   : " + obj_b.d);
            System.out.println("default value of the short instance variable    : " + obj_b.sh);
            System.out.println("default value of the boolean instance variable  : " + obj_b.b);
            System.out.println("default value of the float instance variable    : " + obj_b.f);
            System.out.println("default value of the String instance variable   : " + obj_b.st);
            System.out.println("default value of the char instance variable     : " + obj_b.c);

          } 
}

class A
  {
     //declaring the instance variables
     
     public String name;  //public instance variable
     int age;   //default instance variable
     protected int height; //protected instance variable
     private  int phone_number;  //private instance variable

     //creating constructor and assigning values to the instance variables
     A (String n, int a, int h,int p)
        {
          name = n;
          age = a;
          height = h;
          phone_number = p;
        }
     
     /*//creating the instance variables using the access modifiers
     public int public_var_int;
     default int default_var_int;
     protected int protected_var_int;
     private int private_var_int;
     */
     
     public void public_sum(int a,int b)
        {
        System.out.printf("the sum of the two numbers {} + {} = {}",a,b,a+b);
        }

       void default_sum(int a,int b)
        {
        System.out.printf("the sum of the two numbers {} + {} = {}",a,b,a+b);
        }

      protected void protected_sum(int a,int b)
        {
        System.out.printf("the sum of the two numbers {} + {} = {}",a,b,a+b);
        }

      private void private_sum(int a,int b)
        {
        System.out.printf("the sum of the two numbers {} + {} = {}",a,b,a+b);
        }
    
  }

class B
   {
     int i;
     long l;
     short sh;
     double d;
     float f;
     boolean b;
     String st;
     char c;


     B(){

     }
   }


  


