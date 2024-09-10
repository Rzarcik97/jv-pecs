package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("POIU","orange",1200,160));
        excavators.add(new Excavator("LKJH","grey",1100,200));
        excavators.add(new Excavator("MNBV","yellow",1420,480));
        return excavators;
    }
}
