package com.suraj.demo;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospitaldetails")
public class hospitalcontroller {
hospitalservice service;

public hospitalcontroller(hospitalservice service) {
    this.service = service;
}
@GetMapping("{p_id}")
public String gethospitaldetails( @PathVariable ("p_id") String p_id){
    return service.get(p_id);

}

@DeleteMapping("{p_id}")
public String deletehospitaldetals( @PathVariable ("p_id") String p_id){
    return service.detete(p_id);
}
    

@PostMapping
public String createhospitaldetails( @RequestBody hospitaldetails a){
    return service.put(a);

}

@PutMapping
public String puthospitaldetails( @RequestBody hospitaldetails a){
    return service.update(a);


}

@GetMapping
public List<hospitaldetails> getallhospitaldetails( ){
    return service.getallhospitaldetails();

}
}