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
        bichus.add(bichuModel1);
    }

    public void deleteBichu(int bichuNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBichu'");
    }

}
