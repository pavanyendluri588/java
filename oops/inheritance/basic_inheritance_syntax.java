
class Basic_inheritance_syntax
    {
       public static void main(String[] args)
           {
               //creating the object for the Bicycle class ,object name is bic_obj1
              Bicycle bic_obj1 = new Bicycle(40,78324,"atlas",2,"green",4);
              //displaying the properties of the Bicycle
              bic_obj1.display();

             //creating the object for the Mountain_bike class ,object name is mon_obj1
              Mountain_bike  mon_obj1 = new Mountain_bike (90,2433,"tata",1,"orange",5);
              //displaying the properties of the mountain bike
              mon_obj1.display();
           }
    }
class Two_wheler
     { 
       int maxspeed;
       int model_no;
       String company;
       int no_of_seats;
       Two_wheler(int maxspeed,int model_no,String company,int no_of_seats)
           {
                this.maxspeed=maxspeed;
                this.model_no=model_no;
                this.company=company;
                this.no_of_seats=no_of_seats;
           }
      
     }
class Mountain_bike extends Two_wheler 
    {
             String color;
             int rating;
             
             //creating the constructor
             Mountain_bike (int maxspeed,int model_no,String company,int no_of_seats,String color,int rating)
                {
                  //invoking the values form the parent class using the super() method
                  super(maxspeed , model_no , company , no_of_seats);

                  this.color=color;
                  this.rating=rating;
                }


        void display()
        {
          System.out.println("mountainbike maxspeed : " + maxspeed);
          System.out.println("mountainbike model_no : " + model_no);
          System.out.println("mountainbike company " + company);
          System.out.println("mountainbike no of seats : " + no_of_seats);
          System.out.println("mountainbike color : " + color);
          System.out.println("mountainbike rating : " + rating);
          System.out.println("=========================================================");
        }
    }

class Bicycle extends 	Two_wheler 
    {
        String color;
             int rating;
             
             //creating the constructor
             Bicycle (int maxspeed,int model_no,String company,int no_of_seats,String color,int rating)
                {
                  //invoking the values form the parent class using the super() method
                  super(maxspeed,model_no,company,no_of_seats);
                  this.color=color;
                  this.rating=rating;
                }
             	        


        void display()
        {
             
          System.out.println("bicycle maxspeed : " + maxspeed);
          System.out.println("bicycle model_no : " + model_no);
          System.out.println("bicycle sompany " + company);
          System.out.println("bicycle no of seats : " + no_of_seats);
          System.out.println("bicycle color : " + color);
          System.out.println("bicycle rating : " + rating);
          System.out.println("=========================================================");
        }
    }