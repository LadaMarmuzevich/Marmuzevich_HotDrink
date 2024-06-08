public class Main {
    public static void main(String[] args) {
        
        HotDrinkTemperature drink1 = new HotDrinkTemperature("Tea", 200, 80);
        System.out.println("Продукт: " + drink1.name + ", Объем: " + drink1.volume + ", Температура: " + drink1.temp);
        HotDrinkTemperature drink2 = new HotDrinkTemperature("Coffi", 150, 90);
        System.out.println("Продукт: " + drink2.name + ", Объем: " + drink2.volume + ", Температура: " + drink2.temp);
        HotDrinkTemperature drink3 = new HotDrinkTemperature("BubbleTea", 250, 75);
        System.out.println("Продукт: " + drink3.name + ", Объем: " + drink3.volume + ", Температура: " + drink3.temp);
    }
    
}
