class Static_variable
     {
        public static void main(String[] args)
        {
            Common_values obj1 = new Common_values(73246372,"pavan ram chandar",23);
            /*
            initialise only once and use n times in n objects  of same class 
            */
            obj1.collage_name = "Lovely professional university";
            obj1.display();
            Common_values obj2 = new Common_values(87436728,"prudhvi ram chandar",25);
            obj2.display();
            Common_values obj3 = new Common_values(42342342,"harsha ram chandar",27);
            obj3.display(); 
        }
     }
class Common_values 
    {
      static String  collage_name; //static  variable is used for memory management ,static variable is stored on the static memory
      int id,roll_no;
      String name;
      Common_values (int i,String n,int r)
         {
            id=i;
            name=n;
            roll_no=r;
         }
      public void display()
       {
         System.out.println(" Name : " + name + " Roll no : "  + roll_no + " Collage name : " + collage_name);
       }
    }