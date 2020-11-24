package com.appslab;

public class JobType {
        protected float Salary;
        protected int Bonus;
        protected enum Jobtype {
            Programmer,
            Teacher,
            Driver
        }

        public JobType(float salary, int bonus) {
            this.Salary = salary;
            this.Bonus = bonus;
        }
}
