

class AnonymousDemo
{
    public static void main (String[] args) {
        
        Age o1 = new Age(){
            void getAge()
            {
                System.out.println("Age " +x);
            }
            
        };
        o1.getAge();
        
         Age o2 = new Age(){
            void getAge()
            {
                System.out.println("Blue");
            }
            
        };
        o2.getAge();
        
    }
}
class Age{
    
    int x = 23;
    void getAge()
    {
        System.out.println("Hello");
    }
    
}