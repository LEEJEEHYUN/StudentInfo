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
			System.out.print("원하는 메뉴를 눌러주세요( 1 : 학생 정보 추가 / 2 : 학생 정보 수정 / 3 : 학생 정보 삭제 / 4 : 학생 정보 보기) : ");
			menu_num = scan.nextInt();
			switch(menu_num){
			case 1:
				System.out.println("학생 정보를 추가하세요( 학번 , 이름 , 학과명 , 핸드폰 )");
				System.out.print("학번 : ");
				stu_id = inbr.readLine();
				System.out.print("이름 : ");
				stu_name = inbr.readLine();
				System.out.print("학과 : ");
				stu_dept = inbr.readLine();
				System.out.print("핸드폰번호 : ");
				stu_phone = inbr.readLine();
				stu_info = stu_id + "," + stu_name + "," + stu_dept + "," + stu_phone;
				addinfo.Addstuinfo(stu_info);
				break;
			case 2:
				System.out.print("수정할 학생의 학번을 입력하세요 : ");
				stu_id = inbr.readLine();
				updateinfo.Updatestuinfo(stu_id);
				break;
			case 3:
				System.out.print("삭제할 학생의 학번을 입력하세요 : ");
				stu_id = inbr.readLine();
				deleteinfo.Deletestuinfo(stu_id);
				break;
			case 4:
				System.out.print("학생의 학번을 입력하세요 : ");
				stu_id = inbr.readLine();
				viewinfo.Viewstuinfo(stu_id);
				break;
			}
		}
	}

}
