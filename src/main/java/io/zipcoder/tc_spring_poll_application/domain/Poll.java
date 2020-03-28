package io.zipcoder.tc_spring_poll_application.domain;

import io.zipcoder.tc_spring_poll_application.domain.Option;

import javax.persistence.*;
import java.util.Set;

@Entity // Specifies that the class is an entity and is mapped to a database table.
public class Poll {

    @Id //This ID Annotation denotes the primary key of the entity.
    @GeneratedValue // Configures the way of increment of the specified column(field).
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name = "QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set<Option> options;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
