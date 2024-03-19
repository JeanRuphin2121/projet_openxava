package aka.salako.projet_openxava.model;

import javax.persistence.*;

@Entity
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String sportName;

    // Getters and setters for id and sportName
    // ...
}
