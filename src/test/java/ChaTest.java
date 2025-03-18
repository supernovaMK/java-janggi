import static org.assertj.core.api.Assertions.assertThat;

import model.Cha;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChaTest {
    @Test
    @DisplayName("차 기물 생성 테스트")
    public void test1() {
        String team = "red";

        Cha cha = new Cha(team);

        assertThat(cha.getTeam()).isEqualTo(team);
    }

    @Test
    @DisplayName("차 이동 가능 여부 판별 테스트")
    public void test2() {
        Cha cha = new Cha("red");
        assertThat(cha.canMove(0, 0, 100, 0)).isTrue();
    }
}
