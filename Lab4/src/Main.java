public class Main {
    public static String[][] volcanoData = {
        {"2020", "1", "12", "Taal", "Luzon-Philippines", "Philippines", "14.011", "120.998", "311", "Stratovolcano", "4"},
        {"2021", "3", "5", "Sangay", "Ecuador", "Ecuador", "-2.005", "-78.341", "5286", "Stratovolcano", "2"},
        {"2021", "3", "", "Pacaya", "Guatemala", "Guatemala", "14.382", "-90.601", "2569", "Complex volcano", "1"},
        {"2021", "4", "9", "Soufriere St. Vincent", "W Indies", "St. Vincent & the Grenadines", "13.330", "-61.180", "1220", "Stratovolcano", "4"},
        {"2021", "5", "19", "Stromboli", "Italy", "Italy", "38.789", "15.213", "924", "Stratovolcano", "2"},
        {"2021", "5", "22", "Nyiragongo", "Africa-C", "Congo, DRC", "-1.520", "29.250", "3470", "Stratovolcano", "2"},
        {"2021", "9", "19", "La Palma", "Canary Is", "Spain", "28.570", "-17.830", "2426", "Stratovolcano", "3"},
        {"2021", "12", "4", "Semeru", "Java", "Indonesia", "-8.108", "112.922", "3657", "Stratovolcano", "4"},
        {"2022", "1", "15", "Hunga Tonga-Hunga Ha'apai", "Tonga-SW Pacific", "Tonga", "-20.553", "-175.384", "114", "Submarine volcano", "5"},
        {"2022", "6", "22", "Popocatepetl", "Mexico", "Mexico", "19.023", "-98.622", "5393", "Stratovolcano", "2"},
        {"2022", "10", "9", "Stromboli", "Italy", "Italy", "38.789", "15.213", "924", "Stratovolcano", "2"},
        {"2022", "12", "4", "Stromboli", "Italy", "Italy", "38.789", "15.213", "924", "Stratovolcano", "2"},
        {"2022", "12", "4", "Semeru", "Java", "Indonesia", "-8.108", "112.922", "3657", "Stratovolcano", "4"},
        {"2023", "7", "7", "Bagana", "Bougainville-SW Paci", "Papua New Guinea", "-6.137", "155.196", "1855", "Lava cone", "2"},
        {"2024", "5", "11", "Marapi", "Sumatra", "Indonesia", "-0.380", "100.474", "2885", "Complex volcano", "2"},
        {"2024", "6", "3", "Kanlaon", "Philippines-C", "Philippines", "10.410", "123.130", "2422", "Stratovolcano", "3"},
        {"2024", "8", "17", "Sheveluch", "Kamchatka", "Russia", "56.653", "161.360", "3283", "Stratovolcano", "4"}
    };

    public static String[][] earthquakeData = {
        {"2020", "1", "28", "CUBA: GRANMA; CAYMAN IS; JAMAICA", "19.440", "-78.755", "10", "7.7"},
        {"2020", "3", "25", "RUSSIA: KURIL ISLANDS", "48.986", "157.693", "57", "7.5"},
        {"2020", "6", "18", "KERMADEC ISLANDS: S OF, RAOUL", "-33.294", "-177.838", "10", "7.4"},
        {"2020", "6", "23", "MEXICO: OAXACA", "16.029", "-95.901", "26", "7.4"},
        {"2020", "7", "17", "PAPUA NEW GUINEA: MOROBE, OROA", "-7.843", "147.766", "80", "7"},
        {"2020", "7", "22", "ALASKA", "55.030", "-158.522", "28", "7.8"},
        {"2020", "10", "19", "ALASKA", "54.608", "-159.655", "33", "7.6"},
        {"2020", "10", "30", "GREECE: SAMOS; TURKEY: IZMIR", "37.918", "26.790", "21", "7"},
        {"2021", "2", "10", "NEW CALEDONIA: LOYALTY ISLANDS", "-23.054", "171.601", "10", "7.7"},
        {"2021", "2", "13", "JAPAN: OFF FUKUSHIMA", "37.745", "141.749", "49", "7.1"},
        {"2021", "3", "4", "KERMADEC ISLANDS: S OF, RAOUL", "-29.613", "-177.843", "55", "7.4"},
        {"2021", "3", "4", "KERMADEC ISLANDS: SSE OF RAOUL ISLAND", "-29.740", "-177.267", "19", "8.1"},
        {"2021", "3", "20", "JAPAN: HONSHU ISLAND", "38.452", "141.648", "43", "7"},
        {"2021", "5", "21", "CHINA: QINGHAI PROVINCE", "34.598", "98.251", "10", "7.3"},
        {"2021", "7", "29", "ALASKA PENINSULA", "55.325", "-157.841", "32", "8.2"},
        {"2021", "8", "11", "PHILIPPINES: MINDANAO", "6.455", "126.742", "65", "7.1"},
        {"2021", "8", "12", "SOUTH SANDWICH ISLANDS", "-57.596", "-25.187", "63", "7.5"}
    };

    public static void main(String[] args) {
        Volcano[] volcanoes = VolcanoParser.parse(volcanoData);
        System.out.println(volcanoes[0]);
        Earthquake[] earthquakes = EarthquakeParser.parse(earthquakeData);
        System.out.println(earthquakes[0]);

        System.out.println("NaturalHazardElevationFinder ");

    }
}