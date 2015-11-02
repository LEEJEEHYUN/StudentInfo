import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DeleteStuInfo extends FileManage{

	public void Deletestuinfo(String id){
		String strLine = "0"; 
		String content = ""; 
		int count_remain = 0;
		int count_delete = 0;

		try { 
			BufferedReader buffRead = new BufferedReader(new FileReader(stu_info)); 
			while ((strLine = buffRead.readLine()) != null) {
				if(strLine.trim().length() == 0) 
					continue;
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
			buffRead.close();
			if(count_remain - count_delete == 1)
				System.out.println("======== �л��� ������ �����Ǿ����ϴ�. ========");
			else
				System.out.println("======== �Է��Ͻ� �л��� ������ �������� �ʽ��ϴ�. ========");
			System.out.println();
		} catch (IOException ioe){ 
			ioe.printStackTrace(); 
		} 
	}	
}
