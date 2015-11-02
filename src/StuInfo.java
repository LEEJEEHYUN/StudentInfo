import java.io.*; 
import java.util.*;

public class StuInfo {
	public static void main(String[] args) throws Exception
	{
		int menu_num;
		String stu_id, stu_name, stu_dept, stu_phone;
		String stu_info;
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);
		AddStuInfo addinfo = new AddStuInfo();
		UpdateStuInfo updateinfo = new UpdateStuInfo();
		DeleteStuInfo deleteinfo = new DeleteStuInfo();
		ViewStuInfo viewinfo = new ViewStuInfo();

		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("���ϴ� �޴��� �����ּ���( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ����) : ");
			menu_num = scan.nextInt();
			switch(menu_num){
			case 1:
				System.out.println("�л� ������ �߰��ϼ���( �й� , �̸� , �а��� , �ڵ��� )");
				System.out.print("�й� : ");
				stu_id = inbr.readLine();
				System.out.print("�̸� : ");
				stu_name = inbr.readLine();
				System.out.print("�а� : ");
				stu_dept = inbr.readLine();
				System.out.print("�ڵ�����ȣ : ");
				stu_phone = inbr.readLine();
				stu_info = stu_id + "," + stu_name + "," + stu_dept + "," + stu_phone;
				addinfo.Addstuinfo(stu_info);
				break;
			case 2:
				System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
				stu_id = inbr.readLine();
				updateinfo.Updatestuinfo(stu_id);
				break;
			case 3:
				System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
				stu_id = inbr.readLine();
				deleteinfo.Deletestuinfo(stu_id);
				break;
			case 4:
				System.out.print("�л��� �й��� �Է��ϼ��� : ");
				stu_id = inbr.readLine();
				viewinfo.Viewstuinfo(stu_id);
				break;
			}
		}
	}

}
