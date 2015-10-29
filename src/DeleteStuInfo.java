import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List; 
import java.util.StringTokenizer;


public class DeleteStuInfo extends FileManage{
	public void Deletestuinfo(int stu){
		String id = Integer.toString(stu);
		String strLine = "0"; 
		String dummy = ""; 
		List<Float> x = new ArrayList<Float>();  

		try { 
			BufferedReader fileReader = new BufferedReader(new FileReader(stu_info)); 
			int cnt = 0; 
			while ((strLine = fileReader.readLine()) != null) { 
				System.out.println(strLine);
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken(); 
				if(!stu_id.equals(id)) { 
					dummy += strLine + "\r\n"; 
					System.out.println(dummy);
				}
				strLine = fileReader.readLine();
				cnt++; 
			} 

			FileWriter fw = new FileWriter(stu_info); 
			fw.write(dummy); 
			fw.flush(); 
			fw.close(); 
			fileReader.close(); 
		} catch (IOException ioe) { 
			ioe.printStackTrace(); 
		} 
	}	
}
