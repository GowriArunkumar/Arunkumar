public class BakeryCake
{
String name;
 int price;
 public static void main(String[]args)
 {
    BakeryCake b=new BakeryCake();
	 b.name="vanilla";
	 b.price=250;
	 b.buy();
    b.sale();
}
    
    
public void sale()
{
   BakeryCake b=new BakeryCake();
	b.name="vanilla";
      b.price=500;
	  System.out.println(this.name);
      System.out.println(this.price);	
    b.made();
	  }
    
    
public void buy()
{
   System.out.println(this.name);
	System.out.println(this.price);
	 BakeryCake b=new BakeryCake();
	  b.name="black forest";
	  b.price=600;
	b.get();
   }
    
    
	public void made()
	{
	BakeryCake b=new BakeryCake();
		b.name="biscuit";
		b.price=220;
		System.out.println(this.name);
		System.out.println(this.price);
        this.make();                      // method calling inside method after the print statement
	\	
	}
    
	public void get()
	{
		 BakeryCake b=new BakeryCake();
		b.name="bun";
		b.price=20;
    System.out.println(this.name);
		System.out.println(this.price);
        b.made();
		
	}
    
    public void make()
    {
        System.out.println(this.name);
        System.out.println(this.price);
    }
    
    
    
}   
	  