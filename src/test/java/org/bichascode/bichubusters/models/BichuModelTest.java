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
        Level levelExpect = Level.CLASS4;
        BichuModel bichuModel1 = new BichuModel("fantasmico", levelExpect, "medio", "vuela");
        Level result = bichuModel1.getBichuClass();
        assertThat(result, is(levelExpect));

    }

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetName() {
        String nameExpect = "fantasmico";
        BichuModel bichuModel1 = new BichuModel(nameExpect, Level.CLASS4, "medio", "vuela");
        String result = bichuModel1.getName();
        assertThat(result, is(nameExpect));
    }

    @Test
    @DisplayName ("Testeo del método GetDanger")

    void testGetDanger() {
        String dangerExpect = "medio";
        BichuModel bichuModel1 = new BichuModel("fantasmico", Level.CLASS4, dangerExpect, "vuela");
        String result = bichuModel1.getDanger();
        assertThat(result, is(dangerExpect));
    }

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetAbility() {
        String getAbility = "vuela";
        BichuModel bichuModel1 = new BichuModel("fantasmico", Level.CLASS4, "medio", getAbility);
        String result = bichuModel1.getAbility();
        assertThat(result, is(getAbility));
    }

    @Test
    @DisplayName ("Testeo del método GetDate")
    void testGetDate() {
        LocalDate currentDate = LocalDate.now ();
        BichuModel bichuModel1 = new BichuModel("fantasmico", Level.CLASS4, "medio", "vuela");
        LocalDate result = bichuModel1.getDate();
        assertThat(result, is (currentDate));
    }


}
