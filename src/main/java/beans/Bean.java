package beans;

public class Bean {
    private final int value;
    private final String name;
    public Bean(int value, String name){
        this.name = name;
        this.value = value;
    }
    @Override
    public String toString(){

        return "Class: " + this.getClass().getName() + ". Name: " + name + ". Value: " + value;
    }

    public Boolean validation(){
        return (name != null) && (value > 0);
    }
}
