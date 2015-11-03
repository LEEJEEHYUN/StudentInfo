import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ViewStuInfo extends FileManage{
	public void Viewstuinfo(String id){
		int count_exist = 0;
		String strLine;
		try{
			BufferedReader buffRead = new BufferedReader(new FileReader(stu_info));
			while((strLine=buffRead.readLine()) != null){
				if(strLine.trim().length() == 0) 
					continue;
				StringTokenizer st = new StringTokenizer(strLine,",");
				String stu_id = st.nextToken();
				if(stu_id.equals(id))
				{
					count_exist++;
					String stu_name = st.nextToken();
					String stu_dept = st.nextToken();
					String stu_phone = st.nextToken();
					System.out.println("============= �� �� �� �� =============");
					System.out.println(stu_id + "/" + stu_name + "/" + stu_dept + "/" + stu_phone);
					System.out.println();
					break;
				}
			}
			buffRead.close();
			if(count_exist == 0){
				System.out.println("======== �Է��Ͻ� �л��� ������ �������� �ʽ��ϴ�. ========");
				System.out.println();
			}
		}catch(IOException ioe){
			ioe.printStackTrace(); 
		}
	}
	
}