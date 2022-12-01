package subjects;

import abstracts.Location;
import abstracts.Transport;

public class Rocket extends Transport {
    public Rocket(String name, Point point, Location location, Hero... heroes) {
        super (name, point, location, heroes);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        int result = this.getName() == null ? 0 : this.getName().hashCode();
        return (result) * 13;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Rocket) obj).getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return "Rocket: " + this.getName();
    }
}
