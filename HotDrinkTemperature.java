public class HotDrinkTemperature extends HotDrink{
    int temp;

    public HotDrinkTemperature(String name, int volume, int temp){
        super(name, volume);
        this.temp = temp;
    }

    public int getTemperature() {
        return temp;
    }

    public void setTemperature(int temp) {
        this.temp = temp;
    }
    
}
