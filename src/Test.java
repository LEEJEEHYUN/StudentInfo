import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class StuInfo {
	public void AddStuInfo(int id, String name, String dept, int phone){
	}
	public void UpdateStuInfo(int id, String name, String dept, int phone){
	}
	public void DeleteStuInfo(int id, String name, String dept, int phone){
	}
}
public class Test{
	public static void main(String[] args)
	{
		int menu_num;
		int stu_id, stu_phonenum;
		String stu_name, stu_dept;
		StuInfo student = new StuInfo();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���ϴ� �޴��� ��������( 1 : �л� ���� �߰� / 2 : �л� ���� ���� / 3 : �л� ���� ���� / 4 : �л� ���� ����");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.println("�л� ������ �߰��ϼ���( �й� / �̸� / �а��� / �ڵ��� )");
					stu_id = scan.nextInt();
					//stu_name =
					//stu_dept =
					//stu_phonenum = scan.nextInt(); q
					//student.AddStuInfo(stu_id, stu_name, stu_dept, stu_phonenum);
				case 2:
			}
		}
	}
}
