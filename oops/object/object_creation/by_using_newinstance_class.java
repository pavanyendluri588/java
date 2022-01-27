class By_using_newinstance_class 
   {
      public static void main(String args[])  
         {
             //createing object using the newinstance class
             //Class c=Class.forName("Student");
             //Student obj = (Student)c.newInstance();
 
              Object obj=Class.forName("Student").newInstance();
             
             //initalisation of data to obj
             obj.input_data(1111,"pavan");
             obj.display_data();
  
         }
   }

class Student
    {
       int id; 
       String name;
        public void input_data(int i,String n)
         {
            id=i;
            name = n;
         }
       public void display_data()
         {
             System.out.println("id : "+ id + "\nname : " + name);
         }
    }