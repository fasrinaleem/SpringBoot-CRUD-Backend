package dilmah.dialog.psi.backend.controller;

import dilmah.dialog.psi.backend.service.MachineService;
import dilmah.dialog.psi.backend.model.MachineModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Machine {

    @Autowired
    private MachineService machineService;

    @RequestMapping("/machines")
    public List<MachineModel> getAllMachines(){
        return machineService.getAllMachines();
    }

    @PostMapping("/machines")
    public void addMachine(@RequestBody MachineModel machine){
        machineService.addMachine(machine);
    }

    @RequestMapping("/{id}")
    public MachineModel getMachine(@PathVariable String id){
        return machineService.getMachine(id);
    }

    @PutMapping("/updateMachine/{id}")
    public void updateMachine(@RequestBody MachineModel machine, @PathVariable String id){
        machineService.updateMachine(id, machine);
    }

    @DeleteMapping("/deleteMachine/{id}")
    public void deleteMachine(@PathVariable String id){
        machineService.deleteMachine(id);
    }

}