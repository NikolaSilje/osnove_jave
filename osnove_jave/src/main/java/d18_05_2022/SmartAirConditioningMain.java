package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning samsung = new SmartAirConditioning();

        samsung.brendName = "Samsung";
        samsung.temperature = 16;
        samsung.mode = "cool";

        SmartAirConditioning lg = new SmartAirConditioning();

        lg.brendName = "LG";
        lg.temperature = 28;
        lg.mode = "heat";

        SmartAirConditioning.stamp (samsung.brendName, samsung.temperature, samsung.mode);
        System.out.println();
        SmartAirConditioning.stamp (lg.brendName, lg.temperature, lg.mode);





    }

}

