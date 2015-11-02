import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AddStuInfo extends FileManage{
	public void Addstuinfo(String stu_information){
		int fileLen = fileLength(stu_info); 
		String fileOut = output(stu_info); 
		try
		{
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(stu_info));

			buffWrite.write(fileOut,0,fileLen);
			if (fileLen != 0) {
				buffWrite.newLine();
			}
			buffWrite.write(stu_information,0,stu_information.length());
			buffWrite.flush();
			buffWrite.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("======== 입력하신 학생의 정보가 입력되었습니다. ========");
		System.out.println();
	}

	static int fileLength(File file) {
		int read, content_count = 0;
		try
		{		
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
			while ((read = buffRead.read()) != -1) {
				content_count++;
			}
			buffRead.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return content_count;
	}
	static String output(File file) {
		int read;
		String fileContent = "";
		try	{			
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
			while ((read = buffRead.read()) != -1) {
				fileContent += (char)read;
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