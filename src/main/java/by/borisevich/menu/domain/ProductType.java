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
@Table(name = "PRODUCT_TYPE", schema = "test")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductType extends AbstractPersistable<ProductTypePK> {
    @EmbeddedId
    private ProductTypePK id;
    @Column
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "productType")
    @JsonBackReference
    private Set<LnkProductTypeProducer> lnkProductTypeProducers;

    public ProductTypePK getId() {
        return id;
    }

    public void setId(ProductTypePK productTypePK) {
        this.id = productTypePK;
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
