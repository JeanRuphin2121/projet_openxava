package aka.salako.projet_openxava.model;

import javax.persistence.*;

@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String optionName;

    @ManyToOne
    private Bet betType;

    // Getters and setters for id, optionName, and betType
    // ...
}
