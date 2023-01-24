import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task05 {
	public static void main(String args[])
	{
		String numRange = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" + "\\." 
              + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" + "\\." 
              + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" + "\\." 
              + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        
		if(args.length == 1) {
			if(Pattern.compile(numRange).matcher(args[0]).matches()){
				System.out.println("Valid Ip: ");
				String arr[] = args[0].split("\\.");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			} else {
				System.out.print("Invalid Ip address");
			}	
		}
	}
}