package org.bichascode.bichubusters.models;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HunterModelTest {

    @Test
    @DisplayName ("Testear el método getBichuList")
    void testGetBichuList() {
       ArrayList<BichuModel> bichus = new ArrayList<>();
       HunterModel hunterModel1 = new HunterModel(bichus);
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        assertThat(result, is(bichus));
    }

}
