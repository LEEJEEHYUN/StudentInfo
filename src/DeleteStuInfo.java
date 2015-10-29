import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DeleteStuInfo extends FileManage{
	public void Deletestuinfo(int stu){
		String id = Integer.toString(stu);
		String strLine = "0"; 
		String dummy = ""; 

		try { 
			BufferedReader fileReader = new BufferedReader(new FileReader(stu_info)); 
			while ((strLine = fileReader.readLine()) != null) { 
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken(); 
				if(!stu_id.equals(id)) { 
					dummy += strLine + "\n"; 
				}
			} 

			FileWriter fw = new FileWriter(stu_info); 
			fw.write(dummy); 
			fw.flush(); 
			fw.close(); 
			fileReader.close();
			System.out.println("======== 학생의 정보가 삭제되었습니다. ========");
			System.out.println();
		} catch (IOException ioe){ 
			ioe.printStackTrace(); 
		} 
	}	
}
