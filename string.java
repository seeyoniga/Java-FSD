
public class string{
	public static void concat1(String str)
	{
		str = str + "SEEYONIGA";
	}
	public static void concat2(StringBuilder str1)
	{
		str1.append("PRINCE");
	}
	public static void concat3(StringBuffer str2)
	{
		str2.append("PRINCE");
	}
	public static void main(String[] args)
	{
		
		String str = "SEEYONIGA";
		concat1(str);
		System.out.println("String: " + str);
		StringBuilder str1 = new StringBuilder("SEEYONIGA");
		concat2(str1);
		System.out.println("StringBuilder: " + str1);
		StringBuffer str2 = new StringBuffer("SEEYONIGA");
		concat3(str2);
		System.out.println("StringBuffer: " + str2);
	}
}

