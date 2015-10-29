import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ViewStuInfo extends FileManage{
	public void Viewstuinfo(int stu){
		String id = Integer.toString(stu);
		try{
			FileReader fr = new FileReader(stu_info);
			BufferedReader buffRead = new BufferedReader(fr);

			String contents = buffRead.readLine();

			while(contents != null){
				StringTokenizer st = new StringTokenizer(contents,",");
				String stu_id = st.nextToken();
				if(stu_id.equals(id))
				{
					String stu_name = st.nextToken();
					String stu_dept = st.nextToken();
					String stu_phone = st.nextToken();
					System.out.println(stu_id + stu_name + stu_dept + stu_phone);
					break;
				}
				contents = buffRead.readLine();
			}
		}catch(IOException e){

		}
	}
}
