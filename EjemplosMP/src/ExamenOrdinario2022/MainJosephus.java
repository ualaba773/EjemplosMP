package ExamenOrdinario2022;

public class MainJosephus {

	public static void main(String[] args) {
		Object[] objects = {1,2,3,4,5,6,7,8,9};
		GenericJosephus josephus = new GenericJosephus(3,9, objects);
		
		System.out.println(josephus);
		System.out.println(josephus.ordenEliminar(josephus.getCola()));
	}

}
