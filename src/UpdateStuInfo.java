import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class UpdateStuInfo extends FileManage{
	public void Updatestuinfo(String id){
		Scanner scan = new Scanner(System.in);
		String strLine; 
		String content; 
		int count_modify = 0;
		try { 
			BufferedReader buffRead = new BufferedReader(new FileReader(stu_info)); 
			while ((strLine = buffRead.readLine()) != null) {
				if(strLine.trim().length() == 0) 
					continue;
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken(); 
				if(stu_id.equals(id)) {
					count_modify++;
					System.out.print("수정할 핸드폰 번호를 입력하세요 : ");
					String phonenum = scan.nextLine();
					System.out.println();
					String stu_name = st.nextToken();
					String stu_dept = st.nextToken();
					content += stu_id + "," + stu_name + "," + stu_dept + "," + phonenum + "\n";
				}
				else
					content += strLine + "\n"; 
			}
			FileWriter filewriter = new FileWriter(stu_info); 
			filewriter.write(content); 
			filewriter.flush(); 
			filewriter.close(); 
			buffRead.close();
			if(count_modify == 1){
				System.out.println("======== 학생의 정보가 변경되었습니다. ========");
			}
			else
				System.out.println("======== 입력하신 학생의 정보가 존재하지 않습니다. ========");
			System.out.println();
		} catch (IOException ioe){ 
			ioe.printStackTrace(); 
		} 
	}
	
}