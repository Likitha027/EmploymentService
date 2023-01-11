package org.example;

public class Main {
    public static void main(String[] args) {
    JobSeeker J=new JobSeeker();
    J.setJobSeekerName("Varun");
    J.setGraduation("B.E");
    J.setYearOfPassout(2020);

    Recruiter R=new Recruiter();
    R.setCompanyName("Infotech");
    R.setJobDesignation("Software Developer");
    R.setNumOfVacancy(3);
    R.setJobLocation("Mysore");

        System.out.println("Job seeker Name: " +J.getJobSeekerName());
        System.out.println("Graduated in:" +J.getGraduation());
        System.out.println("Year Of Passout:"+J.getYearOfPassout());
        System.out.println("Recruiter Company Name:"+ R.getCompanyName());
        System.out.println("Job Designation:"+R.getJobDesignation());
        System.out.println("Number Of Vacancy:"+R.getNumOfVacancy());
        System.out.println("Job Location:"+R.getJobLocation());

    }
}