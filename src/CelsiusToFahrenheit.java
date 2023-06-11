public  class CelsiusToFahrenheit implements Converter{

    @Override
    public double converter(double a) {
        return a*1.8+32;
    }
}
