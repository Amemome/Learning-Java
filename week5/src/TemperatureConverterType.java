public enum TemperatureConverterType {
    CELSIUS_TO_FAHRENHEIT(1),
    FAHRENHEIT_TO_CELSIUS(2);

    private final int type;
    TemperatureConverterType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    // 메소드 오버로딩. 이름은 같지만 파라미터가 다른.
    public static TemperatureConverterType valueOf(int value) {
        return switch (value) {
            case 1 -> CELSIUS_TO_FAHRENHEIT;
            case 2 -> FAHRENHEIT_TO_CELSIUS;
            default -> null;
        };
    }
}
