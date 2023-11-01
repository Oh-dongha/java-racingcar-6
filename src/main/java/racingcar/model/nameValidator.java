package racingcar.model;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class nameValidator {
    public static void namesException(String names){
        isNamesNull(names);
        List<String> nameList = List.of(names.split(","));
        isNamesRightSize(nameList);
    }
    public static void isNamesNull(String names) {
        if (names.isEmpty()) throw new IllegalArgumentException("자동차 이름을 입력해주세요");
    }

    public static void isNamesRightSize(List<String> nameList) {
        for (String name : nameList) {
            if (name.length()>5) throw new IllegalArgumentException("이름은 5자 이하만 가능합니다");
            if (name.isEmpty()) throw new IllegalArgumentException("쉼표를 올바르게 사용해주세요");
        }
    }
}
