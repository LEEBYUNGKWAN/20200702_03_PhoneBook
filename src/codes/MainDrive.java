package codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		
		
		printMenu();
		
		
		
	}
	
	public static void printMenu() {
		

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
				readAllPhoneNum();
				
				
			}
			else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	
//	파일에 저장된 전화번호 목록 출력
	public static void readAllPhoneNum() {
//		파일에 저장된 데이터 => 자바 프로그램에서 활용. (File INPUT)
//		FileReader / BufferdReader 활용.
		
//		불러올 파일의 위치 지정 => 저장할때 사용하는 파일명과 동일하게
		File file = new File ("phoneBook.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
//			한줄씩 한꺼번에 불러오게 하는 클래스 => fr은 한글자씩. fr을 보조해서 한문장 로드
			BufferedReader br = new BufferedReader(fr);
			
//			모든 연락처를 불러올때 까지
			
			while (true) {
				
//				한줄 통째로 불러오기. => IOException 처리 필요
				String line = br.readLine();
				
//				불러온 내용을 검사. null인지
				if(line == null) {
					
//				더이상 불러올 내용이 없어서 null이 들ㅇ옴.
//					=>다 읽었다. => 무한반복 탈출
					
					System.out.println("연락처를 모두 읽어왔습니다");
					break;
					
				}
				
//				이 줄의 코드가 실행된다  : break를 안만났다 => 불러온 내용이null이 아님.
//				실제로 파일에 적혀있던 한줄이 line에 담겨있다.
				
				System.out.println(line);
				
			}
			
//			while 빠져나옴 : 파일을 다 읽었으니 빠져나왔다.
//			파일 사용을 종료. br부터 닫고, fr닫자.
			
			br.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			
//			읽어올 파일이 없는 경우. (삭제 or 아직 안만든 경우)
			System.out.println("불러올 파일이 없습니다.");
			System.out.println("연락처를 저장하고 다시 시도해주세요.");
			
			
//			e.printStackTrace();
		} catch (IOException e) {
			
			System.out.println("연락처를 읽어오는 중에 문제가 발생해습니다");
			e.printStackTrace();
		}
		
	}
	
	
//	전화번호 + 이름 + 생년 정보 저장 가능.
	public static void addPhoneNumToFile() {
		
		Scanner myScan = new Scanner(System.in);
		
//		이름(String) -> 폰번(String) ->생년(int) 순서대로 저장
		
		System.out.print("이름 입력 :  ");
		String name = myScan.nextLine();
		
		System.out.print("전화번호 입력 :  ");
		String phoneNum = myScan.nextLine();
		
		System.out.print("생년 입력 :  ");
		int birthYear = myScan.nextInt();
		
//		변수에 저장한 데이터를 묶어서 파일로 저장.
//		JAVA => 보조기억장치 내보내기 => 파일 출력 (SAVE)
		
//		어느 파일을 이용할지 파일명 설정.
		File phoneBookFile = new File("phoneBook.txt");
		
//		파일 SAVE =>파일 쓰기.
//		파일에 사용자정보는 (추가) 저장. => 기존내용에서 이어붙이기.
		FileWriter fw;
		try {
			fw = new FileWriter(phoneBookFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
//			실제로 bw를 이용해서 연락처 정보 저장.
			
//			저장내용 : 3가지를 한 줄로 묶어서
//			ex.조경진 ,010-5112-3237,1988 => 한줄짜리 String으로 저장.
			
			String infoStr = String.format("%s,%s,%d", name, phoneNum, birthYear);
			
//			묶인 한 줄을 파일에 기록
			bw.append(infoStr);
//			파일에 기록하고나면, 줄이 바뀌지 않는다. => System.out.print 처럼 동작
//			한줄에 한명씩만 저장 예정. => 줄을 바꿔주자.
			bw.newLine();
			
//			작업완료 => 열어둔 bw, fw를 닫아주자.
			
			bw.close();
			fw.close();
			
			System.out.println("연락처 저장이 완료되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
