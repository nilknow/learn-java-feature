package serializable;

import java.io.Serializable;

public class SerializableObj implements Serializable {
    private int id;

    public SerializableObj(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
