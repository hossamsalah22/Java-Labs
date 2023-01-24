class Task02 {
	public static void main(String args[]){
		String sentence = "iti stands for iti information technology iti institute";
		String word = "iti";
		String a[] = sentence.split(" ");
		int ocurrence = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (word.equals(a[i]))
				ocurrence++;
		}
		System.out.println("Number of ocurrence for " + word + " Are: " + ocurrence);
	}
}
