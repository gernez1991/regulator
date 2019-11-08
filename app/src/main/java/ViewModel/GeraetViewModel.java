package ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;


import Model.Geraet;
import Model.GeraetStore;


public class GeraetViewModel extends ViewModel {

    private GeraetStore geraets;

    public GeraetViewModel() {
        this.geraets = new GeraetStore();
    }

    public LiveData<List<Geraet>> getUsers() {
        return geraets.getAllGeraeten();}


    public void addGeraet(String name, String priority, String consumption, String description) {
        geraets.addGeraet(new Geraet(name, priority, consumption, description));
    }
}

