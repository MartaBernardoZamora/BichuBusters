package org.bichascode.bichubusters.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

public class BichuModelTest {

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetName() {
        String nameExpect = "fantasmico";
        BichuModel bichuModel1 = new BichuModel(nameExpect, 4, "medio", "vuela", LocalDate.now());
        String result = bichuModel1.getName();
        assertThat(result, is(nameExpect));
    }

    @Test
    @DisplayName ("Testeo del método BichuClass")

    void testBichuClass() {
        Integer  levelExpect = 4;
        BichuModel bichuModel1 = new BichuModel("fantasmico", levelExpect, "medio", "vuela", LocalDate.now());
        Integer result = bichuModel1.getBichuClass();
        assertThat(result, is(levelExpect));
}
}
