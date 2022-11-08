package ds.entity_utility_platform.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "client")
public class Client extends User {

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Device> devices;

    public Client(String username, String password) {
        super(username, password);
    }

    public Client(List<Device> devices) {
        this.devices = devices;
    }

    public Client() {

    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setOrders(List<Device> devices) {
        this.devices= devices;
    }
}

