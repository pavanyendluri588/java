class Real_time_getting_the_interest_of_different_banks
   {
       public static void main(String[] args)
          {
                sbi_bank sbi = new sbi_bank();
                icici_bank icici = new icici_bank();
                boroda_bank boroda = new boroda_bank();
                bank_of_panjab panjab = new bank_of_panjab();
                bank_of_tamilnadu tamil = new bank_of_tamilnadu();

                System.out.println("SBI bank interst : " + sbi.getInterestRate());
                System.out.println("ICICI bank interst : " + icici.getInterestRate());
                System.out.println("BORODA bank interst : " + boroda.getInterestRate());
                System.out.println("Bank_OF_PANJAB bank interst :" + panjab.getInterestRate());
                System.out.println("Bank_of_TAMILNADU bank interst :" + tamil.getInterestRate());
          }
   }
class Bank 
   {
     int getInterestRate(){return 0;}
   }
class sbi_bank extends Bank
   {
    int getInterestRate(){return 2;}
   }
class icici_bank extends Bank
  {
   int getInterestRate(){return 4;}
  }
class boroda_bank extends Bank
  {
    int getInterestRate(){return 8;}
  }
class bank_of_panjab extends Bank
   {
      int getInterestRate(){return 1;}
   }
   class bank_of_tamilnadu extends Bank
     {
        int getInterestRate(){return 6;}
     }