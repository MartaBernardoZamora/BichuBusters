package org.bichascode.bichubusters.models;

import java.util.ArrayList;

public class HunterModel {

    private ArrayList<BichuModel> bichus;

    public HunterModel() {
        this.bichus = new ArrayList<>();
    }

    public ArrayList<BichuModel> getBichuList() {
        return bichus;
    }

    public void addBichu(BichuModel bichuModel1) {
        bichus.add(bichuModel1);
    }

    public void deleteBichu(int bichuNumber) {
        bichus.remove(bichuNumber-1);
    }

}
