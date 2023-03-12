package assignments;


public class BankDetailClassObj {


String name;
String address;
long mobile;
String email;
String website;
String[] AccountType = new String[4];
int interestRate;

public void Details() {
	System.out.println("Know about bank");
}

public void Search() {
	System.out.println("Search Online");
}  

public void Creation() {
	System.out.println("Creat an account");
}

public void FDCreation() {
	System.out.println("Create an FD");
}
public void information() {
	System.out.println("Bank Name : "+name);
	System.out.println("Bank Address : "+address);
	System.out.println("Bank Mobile : "+mobile);
	System.out.println("Bank Email : "+email);
	for (String AccountType : AccountType) {
		System.out.println(AccountType);
	}
}



	public static void main(String[] args) {
		BankDetailClassObj ocanra =new BankDetailClassObj();
		ocanra.name ="canra";
		ocanra.address ="PKT";
		ocanra.mobile=787687899898775l;
		ocanra.email="canra@pkt.com";
		ocanra.website="www.canrapkt.com";
		ocanra.AccountType[0]="savings";
		ocanra.AccountType[1]="salary";
		ocanra.AccountType[2]="business";
		ocanra.AccountType[3]="FD account";
		ocanra.Details();
		ocanra.Search();
		ocanra.Creation();
		ocanra.FDCreation();
		ocanra.information();
		
		BankDetailClassObj oHDFC =new BankDetailClassObj();
		oHDFC.name ="HDFC";
		oHDFC.address ="PKT";
		oHDFC.mobile=876899898775l;
		oHDFC.email="hdfc@pkt.com";
		oHDFC.website="www.hdfcpkt.com";
		oHDFC.AccountType[0]="savings";
		oHDFC.AccountType[1]="salary";
		oHDFC.AccountType[2]="business";
		oHDFC.AccountType[3]="FD account";
		oHDFC.Details();
		oHDFC.Search();
		oHDFC.Creation();
		oHDFC.FDCreation();
		oHDFC.information();
		
		

	}

}
