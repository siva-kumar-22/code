import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bus[] m = new Bus[n];
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			int seats = sc.nextInt();
			sc.nextLine();
			
			String color = sc.nextLine();
			String city = sc.nextLine();
			
			
			m[i] = new Bus(id,seats,color,city);
		}

		String id = sc.nextLine();

		Bus m1 = findBusWithMaximumSeat(m);
		if (m1 == null) {
			System.out.println("No Bus found.");
		} else{
			System.out.println("id-" + m1.getId());
			System.out.println("seat-" + m1.getSeats());
			System.out.println("colour-" + m1.getColor());
			System.out.println("city-" + m1.getCity());
		}

		
		Bus s1 = searchBusByCity(m, id);
		if (s1 == null) {
			System.out.println("No Bus found with mentioned city.");
		} else {
			System.out.println("id-" + s1.getId());
			System.out.println("seat-" + s1.getSeats());
			System.out.println("colour-" + s1.getColor());
			System.out.println("city-" + s1.getCity());
			}


	}

	public static Bus findBusWithMaximumSeat(Bus[] m) {
		int max = m[0].getSeats();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getSeats() > max)
				max = m[i].getSeats();
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i].getSeats() == max)
				return m[i];
		}
		return null; 
	}

	public static Bus searchBusByCity(Bus[] arr, String id) {
		Bus res = null;
		for (Bus b : arr) {
			if (b.getCity().equalsIgnoreCase(id))
				res = b;
		}
		return res;
	}

}

class Bus {
	private int id;
	private int seats;
	private String color;
	private String city;
	

	public Bus() {
	}


	public Bus(int id, int seats, String color, String city) {
		super();
		this.id = id;
		this.seats = seats;
		this.color = color;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	
	
}
