package io.zipcoder.tc_spring_poll_application.domain;

import io.zipcoder.tc_spring_poll_application.domain.Option;

import javax.persistence.*;

@Entity // Specifies that the class is an entity and is mapped to a database table.
public class Vote {

    @Id //This ID Annotation denotes the primary key of the entity.
    @GeneratedValue // Configures the way of increment of the specified column(field).
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToOne //Relational Database type
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
