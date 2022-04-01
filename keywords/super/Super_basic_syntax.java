class Super_basic_syntax
   {
        public static void main(String args[])
           {
               Child_class obj = new Child_class() ;
               System.out.println("child class object name obj \nobj.name:" + obj.name);
               System.out.println("obj.super.name:" + obj.name);

              //calling the child class function
       	      obj.printing_parent_class_variable_using_super_keyword();
           }
   }

class Parent_class
   {
     String name = "this is parent class";
   }
class Child_class extends Parent_class
   {
      String name = "this is child class";
      void printing_parent_class_variable_using_super_keyword()
         {
              System.out.println("this is from the child class function: name " + name);
              System.out.println("this is from the child class function but useing the super keyword: super.name " + super.name);
         }
   }
class Mini_child_class extends Child_class
   {
       String name = "this is mini child class";
   }
