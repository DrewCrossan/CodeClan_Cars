public class Engine {

    private String model;
    private int hp;
    private int torque;

    public Engine(String model, int hp, int torque){
        this.model = model;
        this.hp = hp;
        this.torque = torque;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public int getTorque() {
        return torque;
    }
}
