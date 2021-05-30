package InterviewQuestionsTricky;

import java.net.MalformedURLException;
import java.net.URL;

public class Compare_siteurl_with_ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			System.out.println( new URL("http://naveenautomationlabs.com").equals(new URL("http://45.130.228.5")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
