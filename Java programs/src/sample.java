
public class sample {

	public static void main(String[] args)
	{
			String str="Akanksha";
			char charStr[]=str.toCharArray();
			int i,j;
			for(i=0;i<str.length();i++)
			{
				for(j=i+1;j<str.length();j++)
				{
					if(charStr[i]==charStr[j])
					{
						System.out.println(charStr[i]);
					}
				}
			}
		}
	}


