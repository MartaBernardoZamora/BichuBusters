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

    @Test
    @DisplayName ("Testear el método addBichu")
    void testAddBichu() {
        ArrayList<BichuModel> bichus = new ArrayList<>();
        HunterModel hunterModel1 = new HunterModel(bichus);
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, "medio", "vuela");
        hunterModel1.addBichu(bichuModel1);
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        assertThat(result.size(), is(1));
    }


    @Test
    @DisplayName ("Testear el método deleteBichu")
    void testDeleteBichu() {
        ArrayList<BichuModel> bichus = new ArrayList<>();
        HunterModel hunterModel1 = new HunterModel(bichus);
        BichuModel bichuModel1 = new BichuModel("fantasmico", 4, "medio", "vuela");
        hunterModel1.addBichu(bichuModel1);
        int bichuNumber = 1; /*Numero proporcionado por el usuario*/
        hunterModel1.deleteBichu(bichuNumber);
        ArrayList<BichuModel> result = hunterModel1.getBichuList();
        assertThat(result.size(), is(0));
    }

}
