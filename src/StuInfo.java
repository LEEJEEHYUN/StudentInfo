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
			System.out.println("원하는 메뉴를 누르세요( 1 : 학생 정보 추가 / 2 : 학생 정보 수정 / 3 : 학생 정보 삭제 / 4 : 학생 정보 보기)");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.print("학생 정보를 추가하세요( 학번 , 이름 , 학과명 , 핸드폰 ) : ");
					stu_info = inbr.readLine();  
					addinfo.Addstuinfo(stu_info);
					break;
				case 2:
					System.out.println("수정할 학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					updateinfo.Updatestuinfo(stu_id);
					break;
				case 3:
					System.out.println("삭제할 학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					deleteinfo.Deletestuinfo(stu_id);
					break;
				case 4:
					System.out.println("학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					viewinfo.Viewstuinfo(stu_id);
					break;
			}
		}
	}

}
