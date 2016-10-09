package by.borisevich.menu.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by dima on 7/10/16.
 */
@Embeddable
public class ProductTypePK implements Serializable {
    @Column(name = "id")
    protected Long id;
    @Column(name = "product_id")
    protected Long productId;

    public ProductTypePK() {
    }

    public ProductTypePK(Long id, Long productId) {
        this.id = id;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductTypePK that = (ProductTypePK) o;

        if (id != that.id) return false;
        return productId == that.productId;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (productId ^ (productId >>> 32));
        return result;
    }
}
