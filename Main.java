import java.util.*;

class Main 
{
  public static void main(String[] args)
  {
    possible_wagers();
  }
  
  //Calculates all wagers and probability of wager being valid
  public static void possible_wagers()
  {
    int wager_Amount = 10, wager_Value = 6, n;
    double face = 0;
    
    System.out.println("Possible Wagers: ");

    for (n = 1;  n <= wager_Amount; n++)
    {
      for (int x = 1; x <= wager_Value; x++)
      {
        switch (n)
        {
          case 1:
                    face = probabilityCalculator(1);
          break;
          case 2:
                    face = probabilityCalculator(2);
          break;
          case 3:
                    face = probabilityCalculator(3);
          break;
          case 4:
                    face = probabilityCalculator(4);
          break;
          case 5:        
                    face = probabilityCalculator(5);
          break;
          case 6:
                    face = probabilityCalculator(6);
          break;
          case 7:
                    face = probabilityCalculator(7);
          break;
          case 8:
                    face = probabilityCalculator(8);
          break;
          case 9:
                    face = probabilityCalculator(9);
          break;
          case 10:
                    face = probabilityCalculator(10);
          break;
        }
        System.out.println(n + "," + x + "   " + (1 - face)*100 + "%" );
      }
    }
  }
  
  public static double probabilityCalculator(double n)
  {
    int set, rolls, rand;
    int total = 0, grandTotal = 0, setTotal = 10000;
    
    for (set = 0; set < setTotal; set++)
    {
      rolls = 0;
      total = 0;
      for (rolls = 0; rolls < 12; rolls++)
      {
        Random dice = new Random();
        rand = dice.nextInt(6);
        if (rand == 1)
        {
          total++;
        }
      }
      if (total < n)
      {
        grandTotal++;
      }
    }
return ((double)(grandTotal) / (double)(setTotal));
  }
}