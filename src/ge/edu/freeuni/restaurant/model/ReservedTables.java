package ge.edu.freeuni.restaurant.model;
import java.sql.SQLException;


public interface ReservedTables {
	boolean[] getReservation(Table table) throws SQLException;
	// sxvebs gauqra es paili
}