package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InputViewTest {
    private Scanner scanner;

    @Before
    public void setUp() {
        scanner = new Scanner("12000");
    }

    @Test
    public void getCost() {
        assertThat(InputView.getCost(scanner),is(12000));
    }
}
