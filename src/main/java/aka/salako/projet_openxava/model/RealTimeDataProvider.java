package aka.salako.projet_openxava.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class RealTimeDataProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and setters for id

    public List<?> getEventData() {
		return null;
        // Implementation for getEventData method
    }
}
