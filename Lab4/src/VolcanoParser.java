import java.util.Vector;

public class VolcanoParser {
    public static Volcano[] parse(String[][] volcanoData) {
        Vector<Volcano> result = new Vector<>();
        Vector<ParsingError<String[]> > errors = new Vector<>();
        for(int i = 0; i < volcanoData.length; i++) {
            try {
                result.add(new Volcano(
                        Integer.parseInt(volcanoData[i][0]),
                        Integer.parseInt(volcanoData[i][1]),
                        Integer.parseInt(volcanoData[i][2]),
                        volcanoData[i][3],
                        volcanoData[i][4],
                        volcanoData[i][5],
                        Double.parseDouble(volcanoData[i][6]),
                        Double.parseDouble(volcanoData[i][7]),
                        Integer.parseInt(volcanoData[i][8]),
                        volcanoData[i][9],
                        VolcanicExplosiveIndex.fromValue(Integer.parseInt(volcanoData[i][10]))
                ));
            } catch (Exception e) {
                ParsingError<String[]> error = new ParsingError<>(i, volcanoData[i]);
                errors.add(error);
            }
        }
        System.out.printf("파싱이 완료되었습니다 %d개 중 %d개 성공.\n", volcanoData.length, result.size());
        if(!errors.isEmpty()) {
            System.out.println("파싱 중 에러가 발생했습니다.");
            System.out.println("에러가 발생한 데이터: ");
            for(var data : errors) {
                System.out.println(data);
            }
        }
        return result.toArray(new Volcano[0]);
    }
}
