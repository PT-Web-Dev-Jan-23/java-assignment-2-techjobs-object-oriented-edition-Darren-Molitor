package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        Job job4 = new Job("", new Employer(""), new Location("St.Louis"), new PositionType("Programmer"), new CoreCompetency("Java & JavaScript"));
        Job job5 = new Job("LaunchCode", new Employer("Darren Molitor"), new Location(""), new PositionType(""), new CoreCompetency(""));
        Job job6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);
        jobs.add(job6);

        for (Job job : jobs) {
            System.out.println(job.toString());
//            System.out.println(job.getName() + ": " + job.getEmployer() + ": " + job.getLocation() + ": " + job.getPositionType() + ": " + job.getCoreCompetency());
        }
    }
}