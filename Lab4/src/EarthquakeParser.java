import java.util.Vector;

public class EarthquakeParser {
    public static Earthquake[] parse(String[][] earthquakeData) {
        Vector<Earthquake> result = new Vector<>();
        Vector<ParsingError<String[]> > errors = new Vector<>();
        for(int i = 0; i < earthquakeData.length; i++) {
            try {
                result.add(new Earthquake(
                        Integer.parseInt(earthquakeData[i][0]),
                        Integer.parseInt(earthquakeData[i][1]),
                        Integer.parseInt(earthquakeData[i][2]),
                        earthquakeData[i][3],
                        Double.parseDouble(earthquakeData[i][4]),
                        Double.parseDouble(earthquakeData[i][5]),
                        Integer.parseInt(earthquakeData[i][6]),
                        Double.parseDouble(earthquakeData[i][7])
                ));
            } catch (Exception e) {
                ParsingError<String[]> error = new ParsingError<>(i, earthquakeData[i]);
                errors.add(error);
            }
        }
        System.out.printf("파싱이 완료되었습니다 %d개 중 %d개 성공.\n", earthquakeData.length, result.size());
        if(!errors.isEmpty()) {
            System.out.println("파싱 중 에러가 발생했습니다.");
            System.out.println("에러가 발생한 데이터: ");
            for(var data : errors) {
                System.out.println(data);
            }
            System.out.println();
        }
        return result.toArray(new Earthquake[0]);
    }
}
