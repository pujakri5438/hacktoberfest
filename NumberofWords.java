import java.util.*;
import java.io.*; 
import java.util.Arrays; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
class NumberofWords extends Thread
{
    public void run()
    {
        try
        {
      File f1=new File("poem.txt");
      String[] words=null;
      int wc=0;
      FileReader fr = new FileReader(f1);
      BufferedReader br = new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null)
      {
         words=s.split(" ");
         for(int i=0;i<words.length;i++)
         words[i]=words[i].toLowerCase();
         if(words.length!=1)
         wc=wc+words.length;
      }
      fr.close();
      System.out.println("Words:" +wc);
    }
    catch (FileNotFoundException e) 
            {
                e.printStackTrace();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
    }
}
class NumberofVowels extends Thread
{
    public void run()
    {
        try
        {
      File f1=new File("poem.txt");
      String[] words=null;
      int vowels=0;
      FileReader fr = new FileReader(f1);
      BufferedReader br = new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null)
      {
         words=s.split(" "); 
         for (int i = 0; i < s.length(); ++i) 
         {
            char ch = s.charAt(i);
      
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
              ++vowels;
            }
        } 
      }
      fr.close();
     System.out.println("\nVowels:" +vowels); 
       }
       catch (FileNotFoundException e) 
            {
                e.printStackTrace();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            } 
    }
}
class Ass_08
{
     public static void main(String[] args) throws IOException 
     {
     new NumberofWords().start();
     new NumberofVowels().start();
     }
}
