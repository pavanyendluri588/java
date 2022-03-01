class types_of_method_overriding
    {
        public static void main(String[] args)
           {
               //tee is three types of  overloading
               /*
                   1.overriding using the parameters
                   2.overriding using the datatype
                   3.overriding using the order of the parameters
               */

               //creating a object for the using_prameters_overriding and accessing the methods
               Using_prameters_overriding obj1 = new Using_prameters_overriding();
               System.out.println("sum of 3+4:" + obj1.sum(3,4));
               System.out.println("sum of 3+4+5:" + obj1.sum(3,4,5));
               System.out.println("sum of 3+4+5+6:" + obj1.sum(3,4,5,6));

               //creating a object for the Using_datatypes_overriding and accessing the methods
               Using_datatypes_overriding obj2 = new Using_datatypes_overriding();
               System.out.println("the method are overrided by using the datatypes or return types here datatype is int type:" + obj2.me(1));
               System.out.println("the method are overrided bu using the datatypes or return types here datatype is float type:" + obj2.me(3333.3223));
            
                //creating the object using the Using_the_order_of_parameters_overriding

            Using_the_order_of_parameters_overriding obj3 = new Using_the_order_of_parameters_overriding();
            obj3.me(20,"pavan yendluri");
            obj3.me("prudhvi yendluri",16); 
           
           }
    }
class Using_prameters_overriding
    {
           int sum(int a,int b)
           {
                  return a + b;
           }
           int sum(int a,int b,int c){
               return a + b + c;
           }
           int sum(int a,int b,int c,int d){
               return a + b + c + d;
           }
    }

class Using_datatypes_overriding
    {
        int me(int a)
        {
            System.out.println("this is me method of int return type in the class  using_datatypes_overloding");
            return a;
        }
        double me(double a)
          {
              System.out.println("this is me method of float return type in the class using_datatypes_overriding");
             return a;
          }

    }

class Using_the_order_of_parameters_overriding
     {
         void me(int age,String name){
            System.out.println("this is me method of parameters  order int ,string ");     
        }
        void me(String name,int age)
        {
            System.out.println("this is me method of parameters order string ,int");
        }
     }