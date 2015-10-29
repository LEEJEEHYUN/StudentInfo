import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*; 
import java.util.*;

public class UpdateStuInfo extends FileManage{
	public void Updatestuinfo(int stu){
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 핸드폰 번호를 입력하세요 : ");
		String phonenum = scan.nextLine();
		System.out.println();
		String id = Integer.toString(stu);
		String strLine = "0"; 
		String dummy = ""; 

		try { 
			BufferedReader fileReader = new BufferedReader(new FileReader(stu_info)); 
			while ((strLine = fileReader.readLine()) != null) { 
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken(); 
				if(stu_id.equals(id)) { 
					String stu_name = st.nextToken();
					String stu_dept = st.nextToken();
					dummy += stu_id + "," + stu_name + "," + stu_dept + "," + phonenum + "\n";
				}
				else
					dummy += strLine + "\n"; 
			} 

			FileWriter fw = new FileWriter(stu_info); 
			fw.write(dummy); 
			fw.flush(); 
			fw.close(); 
			fileReader.close();
			System.out.println("======== 학생의 정보가 변경되었습니다. ========");
			System.out.println();
		} catch (IOException ioe){ 
			ioe.printStackTrace(); 
		} 
	}
}

