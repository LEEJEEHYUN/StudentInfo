import java.io.*; 
import java.util.*;

public class StuInfo {
	public static void main(String[] args) throws Exception
	{
		int menu_num , stu_id;
		AddStuInfo addinfo = new AddStuInfo();
		UpdateStuInfo updateinfo = new UpdateStuInfo();
		DeleteStuInfo deleteinfo = new DeleteStuInfo();
		ViewStuInfo viewinfo = new ViewStuInfo();
		
		String stu_info;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���ϴ� �޴��� ��������( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ����)");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.print("�л� ������ �߰��ϼ���( �й� , �̸� , �а��� , �ڵ��� ) : ");
					stu_info = inbr.readLine();  
					addinfo.Addstuinfo(stu_info);
					break;
				case 2:
					System.out.println("������ �л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					updateinfo.Updatestuinfo(stu_id);
					break;
				case 3:
					System.out.println("������ �л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					deleteinfo.Deletestuinfo(stu_id);
					break;
				case 4:
					System.out.println("�л��� �й��� �Է��ϼ���");
					stu_id = scan.nextInt();
					viewinfo.Viewstuinfo(stu_id);
					break;
			}
		}
	}

}
