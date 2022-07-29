package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Result;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResultController {
    @GetMapping("listResults")
        public String getAllResults(){
            return "All Student's result get Successfully";
    }

    @GetMapping("/result/{id}")
    public String getResult(@PathVariable Integer id){
        return "Student's Result get Successfully";
    }

    @DeleteMapping("/result/{id}")
    public String deleteResult(@PathVariable Integer id){
        return "Student Result deleted Success";
    }

    @PostMapping("/result")
    public String addResult(@RequestBody Result result){
        return  "Student's Result added Successfully";
    }

    @PutMapping("/result/{id}")
    public String updateResult(@RequestBody Result result,@PathVariable Integer id){
        return "Student's Result Updated Successfully";
    }

}
