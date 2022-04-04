package edu.miu.restful.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

    @AfterReturning("execution(* edu.miu.restful.*.*.*(..))")
    public void afterReturningJobDelete(JoinPoint joinPoint) {
        System.out.println("Deletion Successful");
    }

//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.JobServiceImplementation.deleteJob*(..))", throwing = "exception")
//    public void afterThrowingJobDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }

//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.InterviewServiceImplementation.deleteInterview*(..))")
//    public void afterReturningInterviewDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.InterviewServiceImplementation.deleteInterview*(..))", throwing = "exception")
//    public void afterThrowingInterviewDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.HiringManagerInterviewServiceImplementation.deleteHiringManagerInterview*(..))")
//    public void afterReturningHiringManagerInterviewDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.HiringManagerInterviewServiceImplementation.deleteHiringManagerInterview*(..))", throwing = "exception")
//    public void afterThrowingHiringManagerInterviewDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.TechnicalInterviewServiceImplementation.deleteTechnicalInterview*(..))")
//    public void afterReturningTechnicalInterviewDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.TechnicalInterviewServiceImplementation.deleteTechnicalInterview*(..))", throwing = "exception")
//    public void afterThrowingTechnicalInterviewDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.CompanyServiceImplementation.deleteCompany*(..))")
//    public void afterReturningCompanyDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.CompanyServiceImplementation.deleteCompany*(..))", throwing = "exception")
//    public void afterThrowingCompanyDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.RecruiterServiceImplementation.deleteRecruiter*(..))")
//    public void afterReturningRecruiterDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.RecruiterServiceImplementation.deleteRecruiter*(..))", throwing = "exception")
//    public void afterThrowingRecruiterDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.ClientServiceImplementation.deleteClient*(..))")
//    public void afterReturningClientDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.ClientServiceImplementation.deleteClient*(..))", throwing = "exception")
//    public void afterThrowingClientDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.ScreeningInterviewServiceImplementation.deleteScreeningInterview*(..))")
//    public void afterReturningScreeningInterviewDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.ScreeningInterviewServiceImplementation.deleteScreeningInterview*(..))", throwing = "exception")
//    public void afterThrowingScreeningInterviewDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.SkillServiceImplementation.deleteSkill*(..))")
//    public void afterReturningSkillDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.SkillServiceImplementation.deleteSkill*(..))", throwing = "exception")
//    public void afterThrowingSkillDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.QuestionServiceImplementation.deleteQuestion*(..))")
//    public void afterReturningQuestionDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.QuestionServiceImplementation.deleteQuestion*(..))", throwing = "exception")
//    public void afterThrowingQuestionDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//
//    @AfterReturning("execution(* miu.edu.cs544.mohamed.jobapplication.service.ApplicationServiceImplementation.deleteApplication*(..))")
//    public void afterReturningApplicationDelete(JoinPoint joinPoint) {
//        System.out.println("Deletion Successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(* miu.edu.cs544.mohamed.jobapplication.service.ApplicationServiceImplementation.deleteApplication*(..))", throwing = "exception")
//    public void afterThrowingApplicationDelete(JoinPoint joinPoint, Exception exception) {
//        System.out.println("Deletion Unsuccessful: " + exception.getMessage());
//    }
//


//    @Before("execution(* miu.edu.cs544.mohamed.jobapplication.service.JobServiceImplementation.deleteJob*(..))")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("Done Done Done");
//    }
//    @After("execution(* miu.edu.cs544.mohamed.jobapplication.service.JobServiceImplementation.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("After After After");
//    }

}