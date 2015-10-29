import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileManage {
File stu_info = new File("stu_info");

	public void reader(String id){
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
	public void input(String str) {
		int fileLen = fileLength(stu_info);
		String fileOut = output(stu_info);
		
		try
		{
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(stu_info));
			
			buffWrite.write(fileOut,0,fileLen);
			if (fileLen != 0) {
				buffWrite.newLine();
			}
			buffWrite.write(str,0,str.length());
			buffWrite.flush();
			
			buffWrite.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	static int fileLength(File file) {
		int b,count = 0;
		try
		{		
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
			while ((b = buffRead.read()) != -1) {
				count++;
			}
			buffRead.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return count;
	}
	static String output(File file) {
		//File file = new File("stu_info");
		int b;
		String fileContent = "";
		try	{			
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
				while ((b = buffRead.read()) != -1) {
					fileContent += (char)b;
				}
				buffRead.close();	
			}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return fileContent;	
	}

}
