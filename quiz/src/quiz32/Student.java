package quiz32;

import java.util.Scanner;

public class Student {

	private String stuId="";
	private String name="";
	private int kor=0;
	private int eng=0;
	private int math=0;
	private int total=0;
	private double avg=0;
	private String grade="";
	private static Scanner scan = new Scanner(System.in);
	
	//학생정보를 입력받는 메서드
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국,영,수를 입력받음.
		 * 국영수는 문자열 입력시 다시 받을수 있도록 예외처리하세요
		 * 
		 */
		System.out.print("학번을 입력하세요. >");
		this.stuId=scan.next();
		System.out.print("이름을 입력하세요. >");
		this.name=scan.next();
		while(true) {
			try{
				System.out.print("국어 점수를 입력하세요. >");
				this.kor=scan.nextInt();
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		while(true) {
			try{
				System.out.print("영어 점수를 입력하세요. >");
				this.eng=scan.nextInt();
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		while(true) {
			try{
				System.out.print("수학 점수를 입력하세요. >");
				this.math=scan.nextInt();
				break;
			}catch(Exception e) {
				scan.next();
				System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");
			}
		}
		calcTotAvg();
		return this.stuId;
	}
	
	//총점, 평균, 학점을 계산하는 메서드
	public void calcTotAvg() {
		/*
		 * 합계, 평균, 등급을 나누어서 멤버변수에 저장
		 */
		this.total=this.kor+this.eng+this.math;
		this.avg=this.total/3.0;
		if(avg>=90) {this.grade="A";}
		else if(avg>=80) {this.grade="B";}
		else if(avg>=70) {this.grade="C";}
		else if(avg>=60) {this.grade="D";}
		else if(avg>=50) {this.grade="E";}
		else {this.grade="F";}
	}
	
	//학생정보 출력 메서드
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n"
				, this.stuId, this.name, this.kor, this.eng
				, this.math, this.total, this.avg, this.grade
				);
	}
	//getter, setter

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return this.kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return this.eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return this.math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return this.avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		Student.scan = scan;
	}
	

	
}
