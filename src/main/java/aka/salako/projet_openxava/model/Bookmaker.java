package aka.salako.projet_openxava.model;

import javax.persistence.*;

@Entity
public class Bookmaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and setters for id

    public void defineEvent() {
        // Implementation for defineEvent method
    }

    public void defineOdd() {
        // Implementation for defineOdd method
    }

    public void limitBetAmount() {
        // Implementation for limitBetAmount method
    }
}

