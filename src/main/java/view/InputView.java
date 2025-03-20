package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import model.Point;
import model.Team;
import model.janggi_board.JanggiBoard;

public class InputView {
    private static Scanner sc;

    public static int choiceSetUp() {
        sc = new Scanner(System.in);
        System.out.println("""
                상차림을 선택하세요,
                1. 안상차림 (마상상마)
                2. 바깥상차림 (상마마상)
                3. 왼상차림 (상마상마)
                4. 오른상차림 (마상마상)
                입력 형식 : 번호 ex)1
                """);
        return Integer.parseInt(sc.nextLine());
    }

    public static void choMoveInput(JanggiBoard janggiBoard, Team team) {
        sc = new Scanner(System.in);
        System.out.printf("%s 나라의 차례\n", team.getTeam());
        System.out.println("이동할 기물의 위치를 선택하세요. 입력 형식 : 가로(공백)세로 ex)1 2");
        List<Integer> beforePointInput = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toList();
        Point beforePoint = Point.of(beforePointInput.get(0) - 1, beforePointInput.get(1) - 1);
        System.out.println("이동될 위치를 선택하세요. 입력 형식 : 가로(공백)세로 ex)1 2");
        List<Integer> targetPointInput = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toList();
        Point targetPoint = Point.of(targetPointInput.get(0) - 1, targetPointInput.get(1) - 1);
        janggiBoard.move(beforePoint, targetPoint);
    }
}
