package ws1;

import lombok.Data;

@Data
public class MathService {

    private Integer number = 10;

    public Integer divideNumberBy(Integer dividend) {
        return number / dividend;
    }
}
