package schildt;

public class Queue {
    char q[];
    int putloc, getloc;

    public Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("- Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    public void put(int ch) {
        if (putloc == q.length - 1) {
            System.out.println("- Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = (char) ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
