package org.bichascode.bichubusters.controllers;

import org.bichascode.bichubusters.models.BichuModel;
import org.bichascode.bichubusters.views.MenuView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.spy;

public class HunterControllerTest {

    @Test
    @DisplayName("Test método catchBichu y añadir a la lista")
    void testCatchBichu() {

        HunterController hunterController = new HunterController();
        hunterController.catchBichu("fantasmico", 1, "Medio", "vuela");

        ArrayList<BichuModel> result = hunterController.getHunter().getBichuList();

        assertThat(result.size(), is(1));
    }



}
