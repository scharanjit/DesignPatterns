package design.patterns.z.problems10.educative;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Callcenter {
}
/**
 Imagine you have a call center with three levels of employees:
 fresher, technical lead (TL), product manager (PM).

 There can be multiple employees, but only one TL or PM.
 An incoming telephone call must be allocated to a fresher who is free.
 If a fresher can’t handle the call, he or she must escalate the call
 to technical lead.If the TL is not free or not able to handle it,
 then the call should be escalated to PM.Design the classes and
 data structures for this problem.Implement a method getCallHandler()
 */
class Employee{
    CallHandler callHandler;
    int rank;//0 - fresher, 1 - technical lead, 2 - product manager
    boolean free;
    Employee(int rank) {
        this.rank = rank;
    }
    void receiveCall(Call call){}
    void callHandled(Call call, String message){
        call.reply(message);
        call.disconnect();
        callHandler.getNextCall(this);
    }//complete call
    //If the employee with the current rank cannot handle the call
    void cannotHandle(Call call){
        //escalate the call to a higher rank
        call.rank = rank + 1;
        callHandler.dispatchCall(call);
        free = true;
        callHandler.getNextCall(this);
    }
}

class Fresher extends Employee{
    public Fresher() {super(0);}
}
class TechLead extends Employee{
    public TechLead() {super(1);}
}
class ProductManager extends Employee{
    public ProductManager() {super(2);}
}

class CallHandler{
    static final int LEVELS = 3;
    static final int NUM_FRESHERS =5; //assume we have 5 freshers
    List<Employee>[] employeeLevels;
    Queue<Call>[] callQueues;//enqueue waiting calls

    public CallHandler(int NUM_FRESHERS){
//        this.NUM_FRESHERS = NUM_FRESHERS;
//        employeeLevels = new ArrayList<Employee>[LEVELS];
//        callQueues = new LinkedList<Call>[LEVELS];
    }
    //return the first available person equal or higher than
    //current call rank
    Employee getCallHandler(Call call){
        for(int level = call.rank; level < LEVELS - 1; level++){
            List<Employee> employeeLevel = employeeLevels[level];
            for(Employee emp : employeeLevel){
                if(emp.free) return emp;
            }
        }
        return null;
    }
    void dispatchCall(Call call){
        //try to route the call to an employee with minimal rank
        Employee emp = getCallHandler(call);
//        if(emp != null)
//            emp.ReceiveCall(call);
            //if no one is available for the call, put the call on the queue
            //waiting for the next available employee
//        else
//            callQueues[call.rank].add(call);
    }
    //look for call at e's rank
    void getNextCall(Employee e){
//        if(callQueues[e.level].size() != 0){
//            Call next = callQueues[e.level].poll();
//            e.receiveCall(next);
//        }
    }
}

class Call {
    int rank = 0; // minimal rank of employee who can handle this call
    public void reply(String message) {}
    public void disconnect(){}//end call
}