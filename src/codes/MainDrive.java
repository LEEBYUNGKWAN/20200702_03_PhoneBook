package codes;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		
		
		printMenu();
		
		public static void printMenu() {
			
			
		}
		
//		Git과 연동해서 전화번호부 만들 예정
		Scanner myScan =  new Scanner(System.in);
		
		while (true) {
			
			System.out.println("******전화번호부******");
		    System.out.println("1) 전화번호 추가등록");
		    System.out.println("2) 전체 전화번호 목록 조회");
		    System.out.println("0 프로그램 종료.");
		    System.out.println("====================");
			
			System.out.print("메뉴 선택:  ");
			int inputMenu = myScan.nextInt();
			
			if(inputMenu ==0) {
//				프로그램 종료 해야함. => 무한반복 탈출.
				System.out.println("전화번호부를 종료합니다..");
				break;
			}
			else if (inputMenu ==1) {
//				전화번호 등록기능 실행
				addPhoneNumToFile();
			}
			else if(inputMenu ==2) {
//				전화번호 전체 조회 기능 구현 필요
			}
			else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
//	전화번호 + 이름 + 생년 정보 저장 가능.
	public static void addPhoneNumToFile() {
		
		Scanner myScan = new Scanner(System.in);
		
//		이름(String) -> 폰번(String) ->생년(int) 순서대로 저장
		
		System.out.println("이름 입력 :  ");
		String name = myScan.nextLine();
		
		System.out.println("전화번호 입력 :  ");
		String phoneNum = myScan.nextLine();
		
		System.out.println("생년 입력 :  ");
		int birthYear = myScan.nextInt();
		
//		변수에 저장한 데이터를 묶어서 파일로 저장.
//		JAVA => 보조기억장치 내보내기 => 파일 출력 (SAVE)
		
	}

}
