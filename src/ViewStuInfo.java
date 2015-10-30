import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ViewStuInfo extends FileManage{
	public void Viewstuinfo(int stu){
		String id = Integer.toString(stu);
		int count_exist = 0;

		try{
			FileReader filereader = new FileReader(stu_info);
			BufferedReader buffRead = new BufferedReader(filereader);

			String contents = buffRead.readLine();

			while(contents != null){
				StringTokenizer st = new StringTokenizer(contents,",");
				String stu_id = st.nextToken();
				if(stu_id.equals(id))
				{
					count_exist++;
					String stu_name = st.nextToken();
					String stu_dept = st.nextToken();
					String stu_phone = st.nextToken();
					System.out.println("============= 학 생 정 보 =============");
					System.out.println(stu_id + "/" + stu_name + "/" + stu_dept + "/" + stu_phone);
					System.out.println();
					break;
				}
				contents = buffRead.readLine();
			}
			buffRead.close();
			filereader.close();
			
			if(count_exist == 0){
				System.out.println("======== 입력하신 학생의 정보가 존재하지 않습니다. ========");
				System.out.println();
			}
		}catch(IOException e){
			
		}
		
	}
}
