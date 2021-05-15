
public class Char_To_String2 
{
		public static void main(String[] args) 
		{
			char[] ch= {'a', 'j', 'a', 'y'};
			//Using built-in class 
			System.out.println(ch);
			System.out.println(ch.length);
			
			String s1=new String();
			System.out.println(s1.length());
			System.out.println(s1);
			for(int i=0;i<ch.length;i++)
			{
				s1=s1+ch[i];
			}
			System.out.println(s1);
			System.out.println(s1.length());
		 }

}
