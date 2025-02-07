package org.bichascode.bichubusters.controllers;

import org.bichascode.bichubusters.models.HunterModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

public class HunterControllerTest {

    @Test
    @DisplayName("Test método createHunter con lista bichuList vacía")
    void testCreateHunter() {
        HunterController hunterController = new HunterController();
        HunterModel hunterModel = hunterController.createHunter();
        assertThat(hunterModel, is(instanceOf(HunterModel.class)));
        assertThat(hunterModel.getBichuList().size(), is(0));
    }

}
