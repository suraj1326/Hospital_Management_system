package com.suraj.demo;

import java.util.List;

public interface hospitalservice  {
public String put(hospitaldetails a);

public String update(hospitaldetails a);

public String detete(String p_id);

public String get(String p_id);

public String post(String p_id);

    
public List<hospitaldetails> getallhospitaldetails(); 
} 

