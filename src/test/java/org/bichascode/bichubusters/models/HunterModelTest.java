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
       HunterModel hunterModel1 = new HunterModel();
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        ArrayList<BichuModel> resultExpected = new ArrayList<>();
        assertThat(result, is(resultExpected));
    }

    @Test
    @DisplayName ("Testear el método addBichu")
    void testAddBichu() {
        HunterModel hunterModel1 = new HunterModel();
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, "medio", "vuela");
        hunterModel1.addBichu(bichuModel1);
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        assertThat(result.size(), is(1));
    }
    @Test
    @DisplayName ("Testear el método deleteBichu")
    void testDeleteBichu() {
        HunterModel hunterModel1 = new HunterModel();
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, "medio", "vuela");
        hunterModel1.addBichu(bichuModel1);
        int bichuNumber = 1; /*Numero proporcionado por el usuario*/
        hunterModel1.deleteBichu(bichuNumber);
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        assertThat(result.size(), is(0));
    }

}
