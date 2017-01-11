package hello;


public class Component {
	private String name = "anonymous";
	
	public void print()
	{
		System.out.println(getname());
		
	}
	public static void main(String args[])
	    {
		Hello a = new Hello();
		a.print();
		
		}
	public String getname()
	{
		
		return name;
	}
		
	public void setname(String name){
		this.name = name;
	}
	
	
}