package com.suraj.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class hospitalimpl implements hospitalservice {
    hospitalrepo repo;

    public hospitalimpl(hospitalrepo repo) {
        this.repo = repo;
    }

    @Override
    public String put(hospitaldetails details)     {
      repo.save(details);
      return "success";
    }

    @Override
    public String update(hospitaldetails details)
     {
      repo.save(details);
      return "sucess";

    }

    @Override
    public String detete(String p_id) 
    {
       repo.deleteById(p_id);
       return "sucess";

    }

    @Override
    public String get(String p_id) 
    {
        repo.findById(p_id);
        return "success";
       
    }

    @Override
    public List<hospitaldetails> getallhospitaldetails() 
    {
       
       return repo.findAll();
       
    
    }

    public hospitalrepo getRepo() {
      return repo;
    }

    public void setRepo(hospitalrepo repo) {
      this.repo = repo;
    }

    @Override
    public String post(String p_id) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'post'");
    }

  
}
