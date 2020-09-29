package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Game1Test {

    @Test
    public void checkGame() {
                   int rsl = Game1.checkGame(0.2, 50, 9);
            assertThat(rsl, is(1));
        }
    }
