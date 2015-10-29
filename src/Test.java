import java.io.*; 
import java.util.*;
//import java.io.FileInputStream;

class StuInfo {
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
	//	File file = new File("stu_info");
		int b;
		String fileContent = "";
		try	{			
			BufferedReader buffRead = new BufferedReader(new FileReader(file));
				while ((b = buffRead.read()) != -1) {
					fileContent += (char)b;
				}
			//	System.out.println(fileContent);
				buffRead.close();	
			}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return fileContent;	
	}

	public void AddStuInfo(String stu_info){
		this.input(stu_info);
		System.out.println("�л��� ������ �ԷµǾ����ϴ�.");
	}
	public void UpdateStuInfo(int id){
		int buffer;
		String find_id = ""+ id;
		String fileContent ="";
		try{
			File aFile = new File("stu_info");
			
			BufferedReader reader = new BufferedReader(new FileReader(aFile));
			String line =" ";
			while((line=reader.readLine())!=null){
				if (line.indexOf(find_id) == -1){
					break;
				}
				else{
					// ��ȭ��ȣ�� �ִ��ε����� ã��.System.out.println(line);
				}
			}
			reader.close(); 
		}
		catch(Exception ex){
			
		}
	}
	public void DeleteStuInfo(int id){
	}
	public void ViewStuInfo(int id){
		
	}
}
public class Test{
	public static void main(String[] args) throws Exception
	{
		int menu_num;
		int stu_id;
		String stu_info;
		StuInfo student = new StuInfo();
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���ϴ� �޴��� ��������( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ����)");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.println("�л� ������ �߰��ϼ���( �й� / �̸� / �а��� / �ڵ��� )");
					stu_info = inbr.readLine();  
					student.AddStuInfo(stu_info);
					break;
				case 2:
					System.out.println("������ �л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					student.UpdateStuInfo(stu_id);
					break;
				case 3:
					System.out.println("������ �л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					student.DeleteStuInfo(stu_id);
					break;
				case 4:
					System.out.println("�л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					student.ViewStuInfo(stu_id);
					break;
			}
		}
	}
}
