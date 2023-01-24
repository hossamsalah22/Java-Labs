import java.util.StringTokenizer;

class Task04{
  public static void main(String args[]){
    String sentence = "iti stands for iti information technology iti institute";
	String word = "iti ";
	int count = 0;
	StringTokenizer words = new StringTokenizer(sentence);
	while (words.hasMoreTokens()) {
			String s;
			if(!(s=words.nextToken()).equals("iti"))
			System.out.println("Number Of Ocurrence = " + s);
     }
	 
  }
}