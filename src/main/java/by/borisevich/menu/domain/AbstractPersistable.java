package by.borisevich.menu.domain;

import java.io.Serializable;

/**
 * Created by BorisevichDA on 2016-04-21.
 */
public abstract class AbstractPersistable<ID extends Serializable> implements Persistable<ID> {

    public abstract void setId(ID id);

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractPersistable that = (AbstractPersistable) o;
        return !(getId() != null ? !getId().equals(that.getId()) : that.getId() != null);
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }


    public boolean isNew() {
        return this.getId() == null;
    }
}