class Sysntax_of_method_overloading
    {
         public static void main(String[] args)
            {
                /*
                 method overloading means the class having the multiple methods with the same name with differenet parameters is known as method overloading
                 */
                A obj1 = new A();
                System.out.println("sum of 3+4 = " + obj1.sum(3,4));
                System.out.println("sum of 3+4+5+6 = " + obj1.sum(3,4,5,6));
            }
    }
class A
    {
        int sum(int a,int b){
             return a + b;
        }
        int sum(int a,int b,int c,int d){
            return a + b + c + d;
        }
    }