package dilmah.dialog.psi.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import dilmah.dialog.psi.backend.repository.MachineRepository;
import dilmah.dialog.psi.backend.model.MachineModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;

    public List<MachineModel> getAllMachines(){
        List<MachineModel> machineModels = new ArrayList<>();
        machineRepository.findAll().forEach(machineModels::add);
        return machineModels;
    }

    public MachineModel getMachine(String id){
        return machineRepository.findById(id).get();
    }

    public void addMachine(MachineModel machine){
        machineRepository.save(machine);
    }

    public void updateMachine(String id, MachineModel machine){
        machineRepository.save(machine);
    }

    public void deleteMachine(String id){
        machineRepository.deleteById(id);
    }

}
