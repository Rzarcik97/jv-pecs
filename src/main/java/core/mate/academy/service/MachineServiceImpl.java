package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machineList;
        switch (type.getSimpleName()) {
            case "Bulldozer" -> machineList = new BulldozerProducer().get();
            case "Excavator" -> machineList = new ExcavatorProducer().get();
            case "Truck" -> machineList = new TruckProducer().get();
            default -> {
                return new ArrayList<>();
            }
        } return new ArrayList<>(machineList);
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
