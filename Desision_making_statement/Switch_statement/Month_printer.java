class Month_printer
    {
        public static void main(String[] args)
           {
               byte month_number=4;
               String name;
               switch(month_number)
                  {
                      case 1:name="january";
                         break;
                      case 2:name="Febuary";
                         break;
                      case 3:name="March";
                         break;
                      case 4:name="April";
                         break;
                      case 5:name="May";
                         break;
                      case 6:name="June";
                         break;
                      case 7:name="July";
                         break;
                      case 8:name="August";
                         break;
                      case 9:name="September";
                         break;
                      case 10:name="October";
                         break;
                      case 11:name="November";
                         break;
                      case 12:name="December";
                         break;
                      default:name="january";  
                  }
               System.out.println("month name:" + name);
           }
    }