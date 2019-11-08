package Model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class GeraetStore {

        private List<Geraet> GeraetList = new ArrayList<>();
        private MutableLiveData<List<Geraet>> geraets = new MutableLiveData<>();

        public void addGeraet(Geraet geraet) {
            GeraetList.add(geraet);
            geraets.postValue(GeraetList);
        }

        public LiveData<List<Geraet>> getAllGeraeten() {
            return geraets;
        }
    }
