//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 11, Exercise 3
public class OnlineNewspaperSubscription extends NewspaperSubscription
{
   public void setAddress(String a)
   {
      boolean hasAtSign = false;
      address = a;
      for(int x = 0; x < a.length(); ++x)
         if(a.charAt(x) == '@')
            hasAtSign = true;
      if(hasAtSign)
         rate = 9.00;
      else
      {
         rate = 0;
         System.out.print("\nAddress must contain an at-sign (@)   ");
      }
   }

}
