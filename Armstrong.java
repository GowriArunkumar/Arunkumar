package LIC.chennai;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Armstrong a=new Armstrong();
         
      //   a.count(153);
         int no=45797878;
         int count=a.count(no);
         System.out.println(count);
         //count.arm(no.count);
         a.arm(no,count);
	}
	

	private int count(int no) {
		// TODO Auto-generated method stub
		int count=0;
		while(no>0) {
		  no=no/10;
		  count++;
		}
		return count;
	}


	private void arm(int no,int count) {
		// TODO Auto-generated method stub
		int arm=0,rem=0;
		 int no1=no;
		while(no>0) {
			rem=no%10;
			//rem=rem*rem*rem;
			rem=(int)Math.pow(rem, count);
			arm=arm+rem;
			no=no/10;
			
		}
		//System.out.println(arm);
		if(no1==arm) {
			System.out.println("given no is armstrong");
		}else
			System.out.println("given no is  not arnstrong");
	}


}
