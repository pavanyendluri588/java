class Switch_statement
      {
          public static void main(String[] args)
              {
                 byte num=5;
                 switch (num)
                    {
                         //if we don't use break in switch statement means automatically next remaining statements	 are printing 
                         case 0:System.out.println("number 0");
                            break;
                         case 1:System.out.println("number 1");
                            break;
                         case 2:System.out.println("number 2");
                            break;
                         case 3:System.out.println("number 3");
                            break;
                         case 4:System.out.println("number 4");
                            break;
                         case 5:System.out.println("number 5");
                            break;
                         default:System.out.println("this is default statement");                      
                    }
              }
      }