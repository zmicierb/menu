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
@Table(name = "PRODUCT", schema = "test")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product extends AbstractPersistable<Long> {
    @Id
    private Long id;
    @Column
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.productId")
    @JsonBackReference
    private Set<ProductType> productType;

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

    public Set<ProductType> getProductType() {
        return productType;
    }

    public void setProductType(Set<ProductType> productType) {
        this.productType = productType;
    }
}
