import java.util.*;
class Word
{
    String s;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
    }
    public void display()
    {
        int x=0;
        s=s+" ";
        
      int l = s.length();
      for(int i=0; i<l; i++)
      {
        if( s.charAt(i) == ' ' ) 
        {
            System.out.println(s.substring(x,i));
            x=i+1;
        }  
    }
    }
    public static void main(String[] args) {
        Word obj=new Word();
        obj.input();
        obj.display();
    }
}
    

