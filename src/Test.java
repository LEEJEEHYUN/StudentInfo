import java.io.*; 
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class StuInfo {
	public void AddStuInfo(int id, String name, String dept, int phone){
	}
	public void UpdateStuInfo(int id){
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
		int stu_id, stu_phonenum;
		String stu_name, stu_dept;
		StuInfo student = new StuInfo();
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("원하는 메뉴를 누르세요( 1 : 학생 정보 추가 / 2 : 학생 정보 수정 / 3 : 학생 정보 삭제 / 4 : 학생 정보 보기)");
			menu_num = scan.nextInt();
			switch(menu_num){
				case 1:
					System.out.println("학생 정보를 추가하세요( 학번 / 이름 / 학과명 / 핸드폰 )");
					stu_id = scan.nextInt();
					stu_name = inbr.readLine(); 
					stu_dept = inbr.readLine(); 
					stu_phonenum = scan.nextInt(); 
					student.AddStuInfo(stu_id, stu_name, stu_dept, stu_phonenum);
				case 2:
					System.out.println("수정할 학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					student.UpdateStuInfo(stu_id);
				case 3:
					System.out.println("삭제할 학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					student.DeleteStuInfo(stu_id);
				case 4:
					System.out.println("학생의 학번을 입력하세요");
					stu_id = scan.nextInt();
					student.ViewStuInfo(stu_id);
			}
		}
	}
}
