class  this_example1
   {
    public static void main(String args[])
         {
            /*
            this keyword is user to refer the current class instance variable
         if the instance variable  and parameters are not same means no need to use the this keyword
             */
                 Demo obj = new Demo("pavan",19);
                 obj.display();
                 Demo obj1 = new Demo("prudhvi",20);
                 obj1.display();


              //without this keyword
              /*
              
               */

              Without_this_keyword obj3 = new Without_this_keyword("LPU",13);
              obj3.display();
              Without_this_keyword obj4 = new Without_this_keyword("CUT",26);
              obj4.display();
         }
   }
class Demo 
    {

      String name;
      int age;
       Demo (String name, int age)
         {
            /*
            this keyword is used to refer the current class instance variable
             */
            this.name = name;;
            this.age = age;
         }

         void display()
            {
               System.out.println("Name : " + name + "\nAge : " + age); 
            }
    }
class Without_this_keyword
    {

      String collage_name;
      int roll_no;
       Without_this_keyword (String collage_name, int roll_no)
         {
            /*
            where the values is just store the variable inside the constructor function  those are not refer the instance variable
             */
            collage_name = collage_name;
            roll_no = roll_no;
         }

         void display()
            {
               System.out.println("collage_name : " + collage_name + "\n roll_no : " + roll_no); 
            }
    }