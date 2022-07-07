import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void kiemTraChanLe(int a) {
//		return a%2 == 0?true:false;
	    if(a%2 == 0) {
	    	System.out.println("là số chẵn");
	    } else {
	    	System.out.println("là số lẻ");
	    }
	}
	
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Chương trình kiểu tra một số là số chẳn hay số lẻ");
       System.out.println("Mời nhập số để kiểm tra: ");
       int so = Integer.parseInt(scan.nextLine());
       
       kiemTraChanLe(so);
//       System.out.println("Số này là Số " + checkEvenOdd);
	}

}
