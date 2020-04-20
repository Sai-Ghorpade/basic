package com.example.workflow;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableProcessApplication
public class Application {

	 @Autowired
	  private RuntimeService runtimeService;

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
  
  @EventListener
  private void processPostDeploy(PostDeployEvent event) {
   // runtimeService.startProcessInstanceByKey("demo1-process");
  // runtimeService.startProcessInstanceByKey("loan-approval");
  runtimeService.startProcessInstanceByKey("printorder");
  runtimeService.startProcessInstanceByKey("printorder_start");
  }

}