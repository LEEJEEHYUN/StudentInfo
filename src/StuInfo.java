import java.io.*; 
import java.util.*;

public class StuInfo {
	public static void main(String[] args) throws Exception
	{
		int menu_num , stu_id, stu_phone;
		String stu_name, stu_dept;
		AddStuInfo addinfo = new AddStuInfo();
		UpdateStuInfo updateinfo = new UpdateStuInfo();
		DeleteStuInfo deleteinfo = new DeleteStuInfo();
		ViewStuInfo viewinfo = new ViewStuInfo();
		
		String stu_info;
		//InputStreamReader insr = new InputStreamReader(System.in);
		//BufferedReader inbr = new BufferedReader(insr);
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("���ϴ� �޴��� �����ּ���( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ����) : ");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.println("�л� ������ �߰��ϼ���( �й� , �̸� , �а��� , �ڵ��� )");
					System.out.print("�й� : ");
					stu_id = scan.nextInt();
					System.out.print("�̸� : ");
					stu_name = scan.next();
					System.out.print("�а� : ");
					stu_dept = scan.next();
					System.out.print("�ڵ�����ȣ : ");
					stu_phone = scan.nextInt();
					stu_info = stu_id + "," + stu_name + "," + stu_dept + "," + stu_phone;  
					addinfo.Addstuinfo(stu_info);
					break;
				case 2:
					System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
					stu_id = scan.nextInt();
					updateinfo.Updatestuinfo(stu_id);
					break;
				case 3:
					System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
					stu_id = scan.nextInt();
					deleteinfo.Deletestuinfo(stu_id);
					break;
				case 4:
					System.out.print("�л��� �й��� �Է��ϼ��� : ");
					stu_id = scan.nextInt();
					viewinfo.Viewstuinfo(stu_id);
					break;
			}
		}
	}

}
