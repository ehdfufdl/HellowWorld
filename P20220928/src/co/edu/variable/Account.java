package co.edu.variable;

public class Account {
	private String accNo; // ���¹�ȣ. �δܾ��� ����: 2��° �ܾ��� ù��° ���ڴ� �빮��.
	private String owner; // ������
	private int balance; //���ݾ�.
	
	// setter, getter ����.
	void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	String getAccNo() {
		return this.accNo;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
	String getOwner() {
		return this.owner;
	}
	void setBalace(int balance) {
		this.balance = balance;
	}
	int getBalance() {
		return this.balance;
	}
	
}
