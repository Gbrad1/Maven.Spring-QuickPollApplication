package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Specifies that the class is an entity and is mapped to a database table.
public class Option {

    @Id //This ID Annotation denotes the primary key of the entity.
    @GeneratedValue // Configures the way of increment of the specified column(field).
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_VALUE")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
