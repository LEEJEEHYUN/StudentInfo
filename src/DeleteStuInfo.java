import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DeleteStuInfo extends FileManage{
	public void Deletestuinfo(int stu){
		String id = Integer.toString(stu);
		String strLine = "0"; 
		String content = ""; 
		int count_remain = 0;
		int count_delete = 0;
		
		try { 
			BufferedReader fileReader = new BufferedReader(new FileReader(stu_info)); 
			while ((strLine = fileReader.readLine()) != null) {
				count_remain++;
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken(); 
				if(!stu_id.equals(id)) { 
					content += strLine + "\n";
					count_delete++;
				}
			} 
			
			FileWriter filewriter = new FileWriter(stu_info); 
			filewriter.write(content); 
			filewriter.flush(); 
			filewriter.close(); 
			fileReader.close();
			if(count_remain - count_delete == 1)
				System.out.println("======== 학생의 정보가 삭제되었습니다. ========");
			else
				System.out.println("======== 입력하신 학생의 정보는 존재하지 않습니다. ========");
			System.out.println();
		} catch (IOException ioe){ 
			ioe.printStackTrace(); 
		} 
	}	
}
