import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectUtils {

	public static String ReadLine() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();	
	}

}
