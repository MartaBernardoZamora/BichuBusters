package org.bichascode.bichubusters.controllers;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.models.HunterModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class HunterControllerTest {

    @Test
    @DisplayName("Test método createHunter con lista bichuList vacía")
    void testCreateHunter() {
        HunterController hunterController = new HunterController();
        HunterModel hunterModel = hunterController.createHunter();
        assertThat(hunterModel, is(instanceOf(HunterModel.class)));
        assertThat(hunterModel.getBichuList().size(), is(0));
    }
    @Test
    @DisplayName("Test método catchBichu y añadir a la lista")
    void testCatchBichu() {
        HunterController hunterController = new HunterController();
        HunterModel hunterModel = hunterController.createHunter();

        hunterController.catchBichu("fantasmico", 1, "Medio", "vuela");
        ArrayList<BichuModel> result = hunterModel.getBichuList();

        assertThat(result.size(), is(1));
        assertThat(result.get(0).getName(), is("fantasmico"));

    }

}
