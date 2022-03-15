package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

 public void onStart(ITestContext arg){

     System.out.println("Start Test execution..." + arg.getName());


 }

 public void onFinish(ITestContext arg){

     System.out.println("Finish execution" + arg.getName());


 }

 public void onTestStart(ITestResult arg0){

     System.out.println("Start test" + arg0.getName());

 }

 public void onTestSkipped(ITestResult arg0){

     System.out.println("Skipped test"+ arg0.getName());


 }

 public void onTestSuccess(ITestResult arg0){

     System.out.println("Passed test" + arg0.getName());

 }

}

// Implement  ITestListeners

