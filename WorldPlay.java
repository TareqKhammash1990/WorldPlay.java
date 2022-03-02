
/**
 * Write a description of WorldPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.lang.Object;
public class WorldPlay 
{
   
   public boolean isVowel(char ch)
   {
        boolean condition = false;
        char c = Character.toLowerCase(ch);
        System.out.println(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            condition = true;
        }
        else
        {
            condition = false;
        }
        return condition;
   }
   public String replaceVowels(String phrase, char ch)
   {
        String phrase1 = phrase.toLowerCase();
        StringBuilder sb = new StringBuilder(phrase1);
        
        for (int k=0 ; k <phrase.length(); k++)
        {
            if(isVowel(sb.charAt(k)))
            {
                sb.setCharAt(k,ch);
            }
        }
        String s = sb.toString();
        return s;
   } 
   public String emphasize(String phrase, char ch)
   {
       char c = Character.toLowerCase(ch);
       StringBuilder sb = new StringBuilder(phrase);
       
       for(int i = 0; i<phrase.length() ; i++)
       {
           if(Character.toLowerCase(sb.charAt(i)) == c)
           {
               if(i%2 ==0)
               {
                   sb.setCharAt(i,'*');
               }
               else
               {
                   sb.setCharAt(i,'+');
               }
           }
           
       }
       String s = sb.toString();
       return s;
   }    
   public void testVowel()
   {
        boolean condition = isVowel('f');
        System.out.println(condition);
        condition = isVowel('a');
        System.out.println(condition);
        condition = isVowel('A');
        System.out.println(condition);
        condition = isVowel('F');
        System.out.println(condition);
    }

}
