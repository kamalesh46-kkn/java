class stringtest2
{
	public static void main(String arg[]) 
	{
		String s1 = "I Love java";
		String s2;
		int i;
		String s3 = "java";
		String s4 = "JAVA";
		s2 = s1.toLowerCase();
		System.out.println(s2);
		s2 = s1.toUpperCase();
		System.out.println(s2);
		s2 = s1.replace('o','i');
		System.out.println(s2);
		s2=s1.trim();
		System.out.println(s2);
		s2=s1.substring(2);
		System.out.println(s2);
		s2=s1.substring(2,6);
		System.out.println(s2);
		i=s1.indexOf('L');
		System.out.println(i);
		i=s1.indexOf('a',9);
		System.out.println(i);
		System.out.println(s2);
		i=s1.length();
		System.out.println(i);		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.charAt(2));
		System.out.println(s4.compareTo(s3));
	}
}