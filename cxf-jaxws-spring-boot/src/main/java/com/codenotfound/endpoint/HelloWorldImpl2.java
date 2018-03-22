package com.codenotfound.endpoint;

import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;
import com.informatica.wsh.DIServerDetails;
import com.informatica.wsh.DIServerProperties;
import com.informatica.wsh.DIServiceInfo;
import com.informatica.wsh.DataIntegrationInterface;
import com.informatica.wsh.EPingState;
import com.informatica.wsh.Fault;
import com.informatica.wsh.GetNextLogSegmentRequest;
import com.informatica.wsh.GetSessionLogRequest;
import com.informatica.wsh.GetSessionPerformanceDataRequest;
import com.informatica.wsh.GetSessionStatisticsRequest;
import com.informatica.wsh.GetWorkflowLogRequest;
import com.informatica.wsh.InitializeDIServerConnectionRequest;
import com.informatica.wsh.Log;
import com.informatica.wsh.LogSegment;
import com.informatica.wsh.LoginRequest;
import com.informatica.wsh.MonitorDIServerRequest;
import com.informatica.wsh.PingDIServerRequest;
import com.informatica.wsh.SessionHeader;
import com.informatica.wsh.SessionPerformanceData;
import com.informatica.wsh.SessionStatistics;
import com.informatica.wsh.StartSessionLogFetchRequest;
import com.informatica.wsh.StartWorkflowLogFetchRequest;
import com.informatica.wsh.TaskDetails;
import com.informatica.wsh.TaskRequest;
import com.informatica.wsh.TypeGetTaskDetailsExRequest;
import com.informatica.wsh.TypeGetWorkflowDetailsExRequest;
import com.informatica.wsh.TypeStartWorkflowExRequest;
import com.informatica.wsh.TypeStartWorkflowExResponse;
import com.informatica.wsh.VoidRequest;
import com.informatica.wsh.VoidResponse;
import com.informatica.wsh.WorkflowDetails;
import com.informatica.wsh.WorkflowRequest;

public class HelloWorldImpl2 implements DataIntegrationInterface   {

//  @Override
//  public Greeting sayHello(Person request) {
//    String greeting = "Hello " + request.getFirstName() + " "
//        + request.getLastName() + "!";
//
//    ObjectFactory factory = new ObjectFactory();
//    Greeting response = factory.createGreeting();
//    response.setGreeting(greeting);
//
//    return response;
//  }

@Override
public VoidResponse startWorkflow(WorkflowRequest startWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse startWorkflowFromTask(WorkflowRequest startWorkflowFromTask, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse waitTillWorkflowComplete(WorkflowRequest waitTillWorkflowComplete, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public WorkflowDetails getWorkflowDetails(WorkflowRequest getWorkflowDetails, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public EPingState pingDIServer(PingDIServerRequest pingDIServer, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Log getWorkflowLog(GetWorkflowLogRequest getWorkflowLog, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse scheduleWorkflow(WorkflowRequest scheduleWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public TaskDetails getTaskDetails(TaskRequest getTaskDetails, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse unscheduleWorkflow(WorkflowRequest unscheduleWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse waitTillTaskComplete(TaskRequest waitTillTaskComplete, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DIServerDetails getWorkflowDetailsEx(TypeGetWorkflowDetailsExRequest getWorkflowDetailsEx, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse recoverWorkflow(WorkflowRequest recoverWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public LogSegment getNextLogSegment(GetNextLogSegmentRequest param) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DIServerDetails getTaskDetailsEx(TypeGetTaskDetailsExRequest getTaskDetailsEx, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public SessionPerformanceData getSessionPerformanceData(GetSessionPerformanceDataRequest getSessionPerformanceData,
		SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse resumeWorkflow(WorkflowRequest resumeWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String login(LoginRequest param) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse stopWorkflow(WorkflowRequest stopWorkflow, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int startSessionLogFetch(StartSessionLogFetchRequest param) throws Fault {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Log getSessionLog(GetSessionLogRequest getSessionLog, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DIServerProperties getDIServerProperties(DIServiceInfo getDIServerProperties, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse initializeDIServerConnection(InitializeDIServerConnectionRequest param) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse deinitializeDIServerConnection(VoidRequest param) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int startWorkflowLogFetch(StartWorkflowLogFetchRequest param) throws Fault {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public TypeStartWorkflowExResponse startWorkflowEx(TypeStartWorkflowExRequest startWorkflowEx, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public SessionStatistics getSessionStatistics(GetSessionStatisticsRequest getSessionStatistics, SessionHeader context)
		throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse logout(VoidRequest param) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse startTask(TaskRequest startTask, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public VoidResponse stopTask(TaskRequest stopTask, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DIServerDetails monitorDIServer(MonitorDIServerRequest monitorDIServer, SessionHeader context) throws Fault {
	// TODO Auto-generated method stub
	return null;
}
}
