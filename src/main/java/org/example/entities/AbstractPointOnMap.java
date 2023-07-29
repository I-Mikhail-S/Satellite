package org.example.entities;

import java.util.Objects;

public abstract class AbstractPointOnMap {
    private int id;
    private boolean flag;

    public AbstractPointOnMap(int id) {
        this.id = id;
        this.flag = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPointOnMap that = (AbstractPointOnMap) o;
        return id == that.id && flag == that.flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flag);
    }
}
