class Task03 {
	public static void main (String args[]){
		String sentence = "iti stands for iti information technology iti institute";
		String word = "iti";
		int count = 0;
		int i = 0;
		while(sentence.indexOf(word, i) != -1){
			i = sentence.indexOf(word, i) + 1;
			count++;
		}
		System.out.println(count);
	}
}