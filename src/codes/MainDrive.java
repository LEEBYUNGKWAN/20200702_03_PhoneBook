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
//				전화번호 추가 기능 구현 필요
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

}
