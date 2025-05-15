
package orang;

public abstract class DataOrang {
    public int id;
    public String nama;
    public int usia;

    public abstract void create();
    public abstract void read();
    public abstract void update(int id);
    public abstract void delete(int id);
}


