class TemperatureConverter {
    // Convert Celsius to Fahrenheit
    double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius and adjust for altitude
    double convert(double celsius, int altitude) {
        return ((celsius * 9/5) + 32) - (altitude * 0.003);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Celsius to Fahrenheit: " + converter.convert(25));
        System.out.println("Adjusted for altitude: " + converter.convert(25, 1000));
    }
}
