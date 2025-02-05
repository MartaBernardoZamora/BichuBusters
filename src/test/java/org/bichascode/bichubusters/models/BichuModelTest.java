package org.bichascode.bichubusters.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

public class BichuModelTest {

    @Test
    @DisplayName ("Testeo del método GetName")

    void testGetName() {
        String nameExpect = "fantasmico";
        BichuModel bichuModel1 = new BichuModel(nameExpect);
        String result = bichuModel1.getName();
        assertThat(result, is(nameExpect));
    }

}
