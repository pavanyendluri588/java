class  Vowel_or_Consonant_checker
   {
      public static void main(String[] args)
        {
            String alp = "intermediate";
            switch (alp)
               {
                   case "Beginner":System.out.println("level-1");
                       break;
                   case "intermediate":System.out.println("level-2");
                       break;
                   case "Expert":System.out.println("level-3");
                       break;
                   default :System.out.println("level-0");
               }
        }
   }