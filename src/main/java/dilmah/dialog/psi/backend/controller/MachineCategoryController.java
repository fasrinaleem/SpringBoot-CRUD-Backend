package dilmah.dialog.psi.backend.controller;

import dilmah.dialog.psi.backend.model.MachineCategoryModel;
import dilmah.dialog.psi.backend.service.MachineCategoryService;
import dilmah.dialog.psi.backend.repository.MachineCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MachineCategoryController {

    @Autowired
    MachineCategoryService machineCategoryService;
    @Autowired
    MachineCategoryRepository machineCategoryRepository;

    @RequestMapping("/categories")
    public List<MachineCategoryModel> getAllCategories(){
        return machineCategoryService.getAllCategories();
    }

    @PostMapping("/categories")
    public void addCategory(@RequestBody MachineCategoryModel categoryModel){
        machineCategoryService.addCategory(categoryModel);
    }

    @RequestMapping("/categories/{id}")
    public MachineCategoryModel getCategoryById(@PathVariable Long id){
        return machineCategoryService.getCategorById(id);
    }

    @PutMapping("/updateCategory/{id}")
    public void updateCategory (@RequestBody MachineCategoryModel machineCategoryModel, @PathVariable String id){
        machineCategoryService.updateCategory(machineCategoryModel);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        machineCategoryService.deleteCategory(id);
    }

    @PostMapping("/addUpdateCategory")
    public void addOrUpdateCategory (@RequestBody MachineCategoryModel machineCategoryModel){
        System.out.println(machineCategoryModel);
        if (machineCategoryModel.getCategoryId() != null && machineCategoryRepository.existsById(machineCategoryModel.getCategoryId())){
            machineCategoryService.updateCategory(machineCategoryModel);
        }
        else {
            machineCategoryService.addCategory(machineCategoryModel);
        }
    }

}
