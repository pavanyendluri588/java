class super_in_instance_variable
{
       public static void main(String[] args)
           {
                dog obj = new dog();
                //System.out.println("name:"+obj.name);
                //System.out.print("\nsuper:name:"+obj.super.name);
                obj.color();


           }
}
public class animal
{
     String name="Animal.......";
}
public class dog extends animal
{
      String name="dog............";
      void color()
         {
               System.out.println("name:"+name);
               System.out.println("super:name:"+super.name);
         }
}
