package ge.edu.freeuni.restaurant.logic;
import java.util.*;
public class shekveta {

	
	private ArrayList<sameuli> arr;
	private String name;
	public shekveta(String name){
		this.name = name;
		arr = new ArrayList<shekveta.sameuli>();		
	}
	
	public void addShekveta(int kerdzi_id, int quantity){
		if(quantity > 0){
			sameuli sam = new sameuli(name, kerdzi_id, quantity);
			arr.add(sam);
		}
	}
	
	public int getSize(){
		return arr.size();
	}
	
	public void saveIntoDB(){
		if(getSize()>0){
			DBConnector db =  DBConnector.getInstance();
			for (int i = 0; i < arr.size(); i++) {
				db.insertIntoShekveta(arr.get(i).getName(),arr.get(i).getId(), arr.get(i).getQuantity());		
			}
		}
	}
	
	private class sameuli{
		private String name;
		private int id;
		private int quantity;
		public sameuli(String name, int kerdzi_id, int quantity){
			this.name = name;
			this.id = kerdzi_id;
			this.quantity = quantity;
		}
		public String getName() { return this.name; }
		public int getId() { return this.id; }
		public int getQuantity() { return this.quantity; }
	}
}