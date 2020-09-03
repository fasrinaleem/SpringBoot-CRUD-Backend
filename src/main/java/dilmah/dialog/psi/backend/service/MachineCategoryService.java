package dilmah.dialog.psi.backend.service;

import dilmah.dialog.psi.backend.model.MachineCategoryModel;
import dilmah.dialog.psi.backend.repository.MachineCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MachineCategoryService {

    @Autowired
    private MachineCategoryRepository machineCategoryRepository;

    public List<MachineCategoryModel> getAllCategories(){
        List<MachineCategoryModel> machineCategoryModels = new ArrayList<>();
        machineCategoryRepository.findAll().forEach(machineCategoryModels::add);
        return machineCategoryModels;
    }

    public MachineCategoryModel getCategorById(Long id){
        return machineCategoryRepository.findById(id).get();
    }

    public void addCategory(MachineCategoryModel machine){
        machineCategoryRepository.save(machine);
    }

    public void updateCategory(MachineCategoryModel machine){
        machineCategoryRepository.save(machine);
    }

    public void deleteCategory(Long id){
        machineCategoryRepository.deleteById(id);
    }

}
