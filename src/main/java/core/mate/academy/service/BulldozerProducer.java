package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("TYUI","white",200,160));
        bulldozers.add(new Bulldozer("GHJK","black",300,200));
        bulldozers.add(new Bulldozer("BNM","blue",120,80));
        return bulldozers;
    }
}
