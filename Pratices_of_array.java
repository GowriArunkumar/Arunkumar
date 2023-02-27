package Interview;

public class Pratices_of_array {

	public static void main(String[] args) {
		 
		Pratices_of_array arr=new Pratices_of_array();
		arr.array();
		System.out.println("---------------------------");
		arr.marks();
		System.out.println("---------------------------");
		arr.reverse_marks();
		System.out.println("---------------------------");
		arr.maximum_marks();
		System.out.println("---------------------------");
		arr.sub_count();
		System.out.println("---------------------------");
		arr.marks_odd_number();
		System.out.println("---------------------------");
		arr.marks_total();
		System.out.println("---------------------------");
		arr.marks_total_average();
		System.out.println("---------------------------");
		arr.highest_number_in_given_array();
		System.out.println("---------------------------");
		arr.lowest_number_in_given_array();
		System.out.println("---------------------------");
		arr.highest_number_in_given_array_and_subject();
		System.out.println("---------------------------");
		arr.lowest_number_in_given_array_and_subject();
		System.out.println("---------------------------");
		arr.first_two_highest_number_in_given_array();
		System.out.println("---------------------------");
        arr.first_two_lowest_number_in_given_array();
	}

	private void first_two_lowest_number_in_given_array() {
		
		int heights []= {178,176,180,190,165,170};
		 
		int first=heights[0],second=heights[0];
		
		for (int i=0;i<heights.length;i++)
		{
			if (heights[i]<first)
			{
				second=first;
			    first=heights[i];
			}
			
			else if (heights[i]<second)
			{
				second= heights[i];
			}
			
		}
		
		System.out.println("first lowest number in given array :"+ first);
		System.out.println("second lowest number in  given array :"+ second);
		
		
		
	}

	private void first_two_highest_number_in_given_array() {
		
		int heights []= {178,176,180,190,165,170};
		
		int first=0,second=0;
		
		for (int i=0;i<heights.length;i++)
		{
			if(heights[i]>first)
			{
				
		    second=first;
			first=heights[i];
			
			}
			
			else if (heights[i]>second)
			{
				second=heights[i];
				
			}
			
		}
		System.out.println("first heights number in given array :"+first);
		System.out.println("second heights number in given array :"+second);
		
	}

	private void lowest_number_in_given_array_and_subject() {
		
		int marks[]= {77,89,73,93,99};
		
		String subjects[]= {"Tamil","English","Maths","science","social"};
		int lowest=marks[0];
		String sub=subjects[0];
		
		for (int i=0;i<subjects.length;i++)
		{
			
		
		for (int j=0;j<marks.length;j++)
		{
			   
			if(marks[i]<lowest)
			{
			lowest=marks[i];
			sub=subjects[i];
			}
			
		}
		
		}
		System.out.println(lowest);
		System.out.println(sub);
		
	}

	private void highest_number_in_given_array_and_subject() {
		 
		int marks []= {77,89,96,93,99};
		
		String subjects []= {"Tamil","English","Maths","science","social"};
		
		int highest =0;
		String sub="0";
		
		for (int i=0;i<subjects.length;i++)
		{
			for (int j=0;j<marks.length;j++)
			{
				
		     if(marks[i]>highest)
				highest=marks[j];
				
				sub=subjects[i];
				
			}
		}
		System.out.println(highest);
		System.out.println(sub);
		
		}
		
	

	private void lowest_number_in_given_array() {
	
		
		int marks []= {77,89,96,93,99};
		
		int lowest =marks[0];
		
		for (int i=1;i<marks.length;i++)
		{
			if (marks[i]<lowest)
			{
				lowest=marks[i];
				
			}
		}
		
		System.out.println("lowest number in given array :"+lowest);
		
	}

	private void highest_number_in_given_array() {
		
		int highest=0;
		
		int []marks= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			if(marks[i]>highest)
			{
				highest=marks[i];
				
			}
			
		}
		System.out.println("highest number in given array :"+highest);
		
	}

	private void marks_total_average() {
		
		int total=0;
		 
		int marks [] = {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			total =total+marks[i];
			
		if(total/marks.length>=90)
		{
			System.out.println("very good boy ");
		}
		else if(total/marks.length>=80)
		{
			System.out.println("good boy ");
		}
		
		}
		System.out.println("total :"+total+ " "+"average :"+ total/marks.length);
		
	}

	private void marks_total() {
		
		int total=0;
		
		int marks []= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		
			System.out.println(marks[i]);
		
		}
			System.out.println("total of marks :"+total+"  "+"average of marks :"+ total/marks.length);
	}

	private void marks_odd_number() {
		
		int marks[]= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			if(marks[i]%2!=0)
			{
				System.out.println(marks[i]);
			}
		}
		
	}

	private void sub_count() {
		
		int count=0;
		
		int marks []= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			if(marks[i]>90)
				count++;
			System.out.println(marks[i]);
			
			
		}
		System.out.println("-------------------");
		System.out.println("count of marks"+" "+count);
		
	}

	private void maximum_marks() {
		
		int []marks= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			//System.out.println(marks[i]);
			
			if(marks[i]>90)
			{
				System.out.println(marks[i]);
			}
				
		}
		System.out.println("--------------------");
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<80)
			{
				
				System.out.println(marks[i]);
			}
			
		}
		
	}

	private void reverse_marks() {
		
		int marks[]= {77,89,96,93,99};
		 
		for (int i=marks.length-1;i>=0;i--)
		{
			System.out.println("reverse the given array "+ marks[i]);
		}
	}

	private void marks() {
		int marks[]= {77,89,96,93,99};
		
		for (int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
	}

	private void array() {
		int []a = new int[2] ;
		a[0]=100;
		a[1]=200;
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
