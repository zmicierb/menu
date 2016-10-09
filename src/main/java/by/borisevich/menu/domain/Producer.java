package by.borisevich.menu.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dima on 7/9/16.
 */
@Entity
@Table(name = "PRODUCER", schema = "test")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Producer extends AbstractPersistable<Long> {
    @Id
    private Long id;
    @Column
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producer")
    @JsonBackReference
    private Set<LnkProductTypeProducer> lnkProductTypeProducers;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<LnkProductTypeProducer> getLnkProductTypeProducers() {
        return lnkProductTypeProducers;
    }

    public void setLnkProductTypeProducers(Set<LnkProductTypeProducer> lnkProductTypeProducers) {
        this.lnkProductTypeProducers = lnkProductTypeProducers;
    }
}
