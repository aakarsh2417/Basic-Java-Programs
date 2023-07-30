class StringFunctions
{
 public static void main(String args[])
 {
 String s="Hello World";
 String s1=" What's up";
 System.out.println(s.length());
 System.out.println(s.charAt(1));
 System.out.println(s.substring(0,5));
 System.out.println(s.concat(s1));
 System.out.println(s.indexOf('o'));
 System.out.println(s.equals(s1));
 System.out.println(s.compareTo(s1));
 System.out.println(s1.trim());
 System.out.println(s.replace('l','a'));
 System.out.println(s.toUpperCase());
 System.out.println(s.toLowerCase()); 
 }
}
