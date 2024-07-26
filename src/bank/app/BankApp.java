package bank.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
		public static void main(String[] args) {
			
			
			boolean run = true;
			while (run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료");
				System.out.println("--------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(scanner.nextLine());
				if (selectNo == 1) {
						createAccount();
				} else if (selectNo == 2) {
						accountList();
				} else if (selectNo == 3) {
						deposit();
				} else if (selectNo == 4) {
						withdraw();
				} else if (selectNo == 5) {
						run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		private static void createAccount() {
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			System.out.print("계좌주 : ");
			String owner = scanner.nextLine();
			System.out.print("초기입금액 : ");
			int balance = Integer.parseInt(scanner.nextLine());
			Account account = new Account(ano, owner, balance);
			accounts.add(account);
			System.out.println("계좌가 생성 되었습니다.");
			
			
		}
		private static void accountList() {
			if (accounts.isEmpty()) {
				System.out.println("계좌가 존재하지않습니다.");
				return;
			}
			
			System.out.println("----------계좌 목록--------------");
			for (Account account : accounts) {
	            System.out.println("계좌번호: " + account.getano() + ", 계좌주: " + account.getowner() + ", 잔액: " + account.getbalance());
	        }
	        System.out.println();
			
			
		}
		private static void deposit() {
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			Account account = findAccount(ano);
			if (accounts == null) {
				System.out.println("계좌를 찾을수 없습니다.");
				return;
			}
			System.out.print("예금액 : ");
			int amount = Integer.parseInt(scanner.nextLine());
			account.setbalance(account.getbalance() + amount);
			System.out.println("예금이 성공되었습니다.");			
			
		}
		private static void withdraw() {
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			Account account = findAccount(ano);
			if (accounts == null) {
				System.out.println("계좌를 찾을수 없습니다.");
				return;
			}
			System.out.print("출금액 : ");
			int amount = Integer.parseInt(scanner.nextLine());
			account.setbalance(account.getbalance() - amount);
			System.out.println("출금이 성공되었습니다.");
			
		}
		private static Account findAccount(String ano) {
			for (Account account : accounts) {
				if (account.getano().equals(ano)) {
					return account;
				}
			}
			return null;
			
		}

}
