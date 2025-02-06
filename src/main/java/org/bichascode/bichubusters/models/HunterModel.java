package org.bichascode.bichubusters.models;

import java.util.ArrayList;

public class HunterModel {

    private ArrayList<BichuModel> bichus;

    public HunterModel(ArrayList<BichuModel> bichus) {
        this.bichus = bichus;
    }

    public ArrayList<BichuModel> getBichuList() {
        return bichus;
    }

    public void addBichu(BichuModel bichuModel1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addBichu'");
    }

}
