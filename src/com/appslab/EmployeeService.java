package com.appslab;
import com.appslab.model.*;

import java.util.List;


public interface EmployeeService {
     float salarySum(List<JobType>list);
     int bonusSum(List<JobType>list);
}
