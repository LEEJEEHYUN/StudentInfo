import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileManage {
	File stu_info = new File("stu_info");

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
		int read,file_count = 0;
		
		try
		{		
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
			while ((read = buffRead.read()) != -1) {
				file_count++;
			}
			buffRead.close();		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return file_count;
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
