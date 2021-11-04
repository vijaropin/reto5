
package RetoFinal.Reto3Grupo8;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface InterfaceReservaciones extends CrudRepository<Reservaciones, Integer> {
    
    public List<Reservaciones> findAllByStatus (String status);
    
    public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore (Date dateOne, Date dateTwo);
   
    @Query ("SELECT c.client, COUNT(c.client) from Reservaciones AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();
        
    
}
