package by.borisevich.menu.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dima on 7/10/16.
 */
@Entity
@Table(name = "LNK_PRODUCT_PT_PRODUCER", schema = "test")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LnkProductTypeProducer extends AbstractPersistable<Long> {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumns({
            @JoinColumn(name = "product_type_id", nullable = false, updatable = false),
            @JoinColumn(name = "product_id", nullable = false, updatable = false)
    })
    private ProductType productType;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "producer_id")
    private Producer producer;
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonManagedReference
    @JoinTable(name = "LNK_ITEM",
            joinColumns = {
                    @JoinColumn(name = "lnk_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "item_id",
                    nullable = false, updatable = false)})
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
