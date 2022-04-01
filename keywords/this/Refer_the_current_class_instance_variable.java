class Refer_the_current_class_instance_variable
   {
       public static void main(String args[])
         {
             Student_details obj1 = new Student_details();
             Student_details obj2 = new Student_details();
             obj1.put_details("pavan",13,"9110564858","A+");
             obj1.get_details();
             obj2.put_details("prudhvi",0,"9347308435","o-");
             obj2.get_details();  
         }
   }
class Student_details
   {
      int roll_no;
      String contact_number;
      String name;
      String blood_group;
     
      void put_details(String name,int roll_no,String contact_number,String blood_group)
         {
              //this.name this will refer the current class instance variable name
              this.name= name;
              this.roll_no = roll_no;
              this.contact_number = contact_number;
              this.blood_group= blood_group;
         }

     void get_details()
         {
              System.out.println("name :" + name );
              System.out.println("roll number :" + roll_no);
              System.out.println("contact number :" + contact_number);
              System.out.println("blood group :" + blood_group);
              System.out.println("==========================================");

         }



  }