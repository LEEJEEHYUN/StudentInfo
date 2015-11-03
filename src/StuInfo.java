import java.io.*; 
import java.util.*;

public class StuInfo {
	public static void main(String[] args) throws Exception
	{
		int menu_num, condition=1;
		String stu_id, stu_name, stu_dept, stu_phone;
		String stu_info;
		InputStreamReader inputstream = new InputStreamReader(System.in);
		BufferedReader inputbuffer = new BufferedReader(inputstream);
		AddStuInfo addinfo = new AddStuInfo();
		UpdateStuInfo updateinfo = new UpdateStuInfo();
		DeleteStuInfo deleteinfo = new DeleteStuInfo();
		ViewStuInfo viewinfo = new ViewStuInfo();

		Scanner scan = new Scanner(System.in);
		while(condition == 1){
			System.out.print("���ϴ� �޴��� �����ּ���( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ���� / 0 : ����) : ");
			menu_num = scan.nextInt();
			switch(menu_num){
			case 0:
				condition = 0;
				System.out.println("=========== ���α׷��� ����Ǿ����ϴ�. ===========");
				break;
			case 1:
				System.out.println("�л� ������ �߰��ϼ���( �й� , �̸� , �а��� , �ڵ��� )");
				System.out.print("�й� : ");
				stu_id = inputbuffer.readLine();
				System.out.print("�̸� : ");
				stu_name = inputbuffer.readLine();
				System.out.print("�а� : ");
				stu_dept = inputbuffer.readLine();
				System.out.print("�ڵ�����ȣ : ");
				stu_phone = inputbuffer.readLine();
				stu_info = stu_id + "," + stu_name + "," + stu_dept + "," + stu_phone;
				addinfo.Addstuinfo(stu_info);
				break;
			case 2:
				System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
				stu_id = inputbuffer.readLine();
				updateinfo.Updatestuinfo(stu_id);
				break;
			case 3:
				System.out.print("������ �л��� �й��� �Է��ϼ��� : ");
				stu_id = inputbuffer.readLine();
				deleteinfo.Deletestuinfo(stu_id);
				break;
			case 4:
				System.out.print("�л��� �й��� �Է��ϼ��� : ");
				stu_id = inputbuffer.readLine();
				viewinfo.Viewstuinfo(stu_id);
				break;
			}
		}
	}
}