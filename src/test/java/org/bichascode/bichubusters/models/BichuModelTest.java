package org.bichascode.bichubusters.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BichuModelTest {

    @Test
    @DisplayName ("Testeo del método BichuClass")
    void testBichuClass() {
        int levelExpect = 4;
        BichuModel bichuModel1 = new BichuModel("fantasmico", levelExpect, "medio", "vuela",LocalDate.now());
        int result = bichuModel1.getBichuClass();
        assertThat(result, is(levelExpect));

    }

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetName() {
        String nameExpect = "fantasmico";
        BichuModel bichuModel1 = new BichuModel(nameExpect, 4, "medio", "vuela", LocalDate.now());
        String result = bichuModel1.getName();
        assertThat(result, is(nameExpect));
    }





}
