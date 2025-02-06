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
        BichuModel bichuModel1 = new BichuModel("fantasmico", levelExpect, "medio", "vuela");
        int result = bichuModel1.getBichuClass();
        assertThat(result, is(levelExpect));

    }

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetName() {
        String nameExpect = "fantasmico";
        BichuModel bichuModel1 = new BichuModel(nameExpect, 4, "medio", "vuela");
        String result = bichuModel1.getName();
        assertThat(result, is(nameExpect));
    }

    @Test
    @DisplayName ("Testeo del método GetDanger")

    void testGetDanger() {
        String dangerExpect = "medio";
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, dangerExpect, "vuela");
        String result = bichuModel1.getDanger();
        assertThat(result, is(dangerExpect));
    }

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetAbility() {
        String getAbility = "vuela";
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, "medio", getAbility );
        String result = bichuModel1.getAbility();
        assertThat(result, is(getAbility));
    }


}
