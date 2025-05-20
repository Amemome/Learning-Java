import java.util.Arrays;

public class ParsingError<DT> {
    // your code parsing 할 때 에러를 유연하게 처리하는 클래스
    // 제네릭을 사용하여 String 과 String[] 두가지 타입을 받는다.
    private final DT data;
    private final int index;

    public ParsingError(int index, DT data) {
        this.index = index;
        this.data = data;
    }

    @Override
    public String toString() {
        // 데이터 결과를 저장할 String
        String dataString;
        if(data != null) {
            // data 의 타입이 String 배열이면
            if (data instanceof String[]) {
                // Arrays 의 유틸 메서드를 사용.
                dataString = Arrays.toString((String[])data);
            } else {
                dataString = (String) data;
            }
        } else {
            // data 가 null인 경우
            dataString = null;
        }
        return "Parsing Error occurred at " + index + '\n' + "Data: " + dataString;
    }
}
