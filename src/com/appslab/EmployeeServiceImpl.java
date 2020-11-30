package com.appslab;
import com.appslab.model.*;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public float salarySum(List<JobType>list){
        return (float) list.stream().mapToDouble(JobType::getSalary).sum();
    }
    @Override
    public int bonusSum(List<JobType>list){
        return  list.stream().mapToInt(JobType::getBonus).sum();
    }

}
