import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIpg {

	public static void main(String[] args) {
		List<Integer>Values = Arrays.asList(1,2,3,4,5);
		/*for(int i=1;i<6;i++) {
			System.out.println(Values.get(i));
		}
		Iterator<Integer> ivalues = Values.iterator();
		while(ivalues.hasNext()) {
			System.out.println(ivalues.next());
		}
		/*for(int i:Values){
			System.out.println(i);// TODO Auto-generated method stub
		}*/
		/*Values.forEach(i->System.out.println(i));
		Values.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				
			}
		});*/
		Values.forEach(System.out::println);

	}

}
