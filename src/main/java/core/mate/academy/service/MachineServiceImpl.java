package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> machineList = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machineList = new ArrayList<>(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machineList = new ArrayList<>(excavatorProducer.get());
        } else if (type.equals(Truck.class)) {
            TruckProducer truckproducer = new TruckProducer();
            machineList = new ArrayList<>(truckproducer.get());
        }
        return machineList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
