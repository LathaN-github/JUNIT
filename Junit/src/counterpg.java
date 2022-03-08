
public class counterpg extends Thread {
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread());
	}

	public static void main(String[] args) {
		/*counterpg c1=new counterpg();
		counterpg c2=new counterpg();
		System.out.println("one compartment");
		System.out.println("two compartment");*/
		int counter = 0;
		while (counter < 21){
			System.out.println("number of count"+ counter +" times ");
			counter++;
			int i=0;
			do
			{
				System.out.println(i);
				i++;// TODO Auto-generated method stub
			}while(i<21);
			
		}
	}
	}
	


			
	
	
		
			

	


