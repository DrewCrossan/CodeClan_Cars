package Vehicles;

public enum CarType {
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    SALOON("Saloon"),
    ESTATE("Estate");

    private final String description;

    CarType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
