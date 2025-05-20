public class TemperatureConverter {
    private TemperatureConverterType type;
    private String fromUnit; // C/F
    private String toUnit; // C/F
    private float fromValue; // 0.0f
    private float toValue; // 0.0f

    private static float fromCelsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static float fromFahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5.0f / 9;
    }

    private void setUnit() {
        switch (this.type) {
            case CELSIUS_TO_FAHRENHEIT:
                this.fromUnit = "Celsius";
                this.toUnit = "Fahrenheit";
                break;
            case FAHRENHEIT_TO_CELSIUS:
                this.fromUnit = "Fahrenheit";
                this.toUnit = "Celsius";
                break;
        }
    }

    public float convert() {
        return switch (this.type) {
            case CELSIUS_TO_FAHRENHEIT -> fromCelsiusToFahrenheit(this.fromValue);
            case FAHRENHEIT_TO_CELSIUS -> fromFahrenheitToCelsius(this.fromValue);
            default -> 0.0f;
        };
    }

    public String toString() {
        return String.format("TemperatureConverter %s = %f => %s = %f",fromUnit, fromValue, toUnit, toValue);
    }

    public TemperatureConverter(TemperatureConverterType type, float temperature)  {
        this.type = type;
        this.fromValue = temperature;
        this.toValue = convert();
        setUnit();
    }
}
