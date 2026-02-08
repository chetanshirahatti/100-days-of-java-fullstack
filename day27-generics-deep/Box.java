

public class Box<T> {

    T value;
    // T -- means Type parameter that will be specified when creating an instance of Box

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
