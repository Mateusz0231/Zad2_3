import java.util.Scanner;

 
public class Main {
 
  
    public static String upperCase(String napis)
  {
      String duze=""; 
      char znak;    
      int kod;
      for (int i = 0 ; i < napis.length() ; i++)   
      {
          znak = napis.charAt(i);  
          kod = (int) znak; 
 
         
          if (kod >=97 && kod <=122)
          {
              kod = kod - 32;
              znak = (char)kod; 
          
          duze = duze + znak; 
            
            }
    
        return duze;
       
      }     
  }
  public static String lowerCase(String napis2)
  {
    
    String male="";
      char znak1;    
      int kod1;
    for (int i = 0 ; i < napis2.length() ; i++)   
      {
          znak1 = napis2.charAt(i);  
          kod1 = (int) znak1; 
     if(kod1 >=122 && kod1 <=97)
          {
    
              kod1 = kod1 - 32;
              znak1 = (char)kod1; 
          
          male = male + znak1; 
            
            }
         return male;
        }
  }
    
 
    public static void main(String[] args) 
  {
    Scanner napis1 = new Scanner(System.in);
     System.out.println("Podaj napis");
       String napis = napis1.next();
       String napis2 = napis1.next();
       napis = upperCase(napis);
       napis2 =lowerCase(napis);
       System.out.println(napis);
   }
}