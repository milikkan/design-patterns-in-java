package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        SimpleSubject mySubject = new SimpleSubject();
        SimpleObserver observer1 = new SimpleObserver(mySubject);
        SimpleObserver observer2 = new SimpleObserver(mySubject);

        observer1.display(); // 0
        observer2.display(); // 0

        mySubject.setValue(42);
        mySubject.setValue(26);

    }
}
