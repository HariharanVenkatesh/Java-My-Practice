class CarApp{
    private String CarBrand;
    private String CarModel;
    private int ManufacturingYear;
    private double CarPrice;

    public CarApp(String CarBrand, String CarModel, int ManufacturingYear, double CarPrice){
        this.CarBrand = CarBrand;
        this.CarModel = CarModel;
        this.ManufacturingYear = ManufacturingYear;
        this.CarPrice = CarPrice;
    }
    public String getCarBrand(){
        return CarBrand;
    }
    public String getCarModel(){
        return CarModel;
    }
    public int getManufacturingYear(){
        return ManufacturingYear;
    }
    public double getCarPrice(){
        return CarPrice;
    }
    public void setCarBrand(String CarBrand){
        this.CarBrand = CarBrand;
    }
    public void setCarModel(String CarModel){
        this.CarModel = CarModel;
    }
    public void setManufacturingYear(int ManufacturingYear){
        this.ManufacturingYear = ManufacturingYear;
    }
    public void setCarPrice(double CarPrice){
        this.CarPrice = CarPrice;
    }
    public static void main(String [] args){
        CarApp a = new CarApp(null, null, 0, 0);
        a.setCarBrand("Maruthi Suzuki");
        a.setCarModel("Swift");
        a.setManufacturingYear(2025);
        a.setCarPrice(900000);
        System.out.println(a.getCarBrand());
        System.out.println(a.getCarModel());
        System.out.println(a.getManufacturingYear());
        System.out.println(a.getCarPrice());
    }
}
    

