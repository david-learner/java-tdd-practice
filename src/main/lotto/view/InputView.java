package view;

import java.util.Scanner;

public class InputView {
    public static int getCost(Scanner scanner) {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }

    public static String getWinningNos(Scanner scanner) {
        return scanner.nextLine();
    }
}
