/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009-2012, The University of Melbourne, Australia
 */
package base;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Request made by some user to access a application
 * 
 * Created By Nathan Kong 11/2016
 */
public class Request {

    /**
     * The request ID.
     */
    private int id;

    /**
     * The time when the application for this request starts.
     */
    private long startTime;

    /**
     * The time when the application for this request completes.
     */
    private long finishTime;
    
    //status of the request true=started false=not started
    private boolean started;
    
    //The bandwidth required
    private int bw;
  
    //the id of the container
    private int containerId;
    
    //The time it will take to run this request
    private int time;
    
     /**
     * Allocates a Request being made to a container
     */
    public Request( int id, int bw, int time, int containerId){
    	this.id = id;
    	this.bw = bw;
    	this.time = time;
    	this.containerId = containerId;
    	this.startTime = 0;
    	this.finishTime = 0;
    	this.started = false;
    }

	public int getId() {
		return id;
	}

	public int getBw() {
		return bw;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}
    
    public void printResults(){
    	System.out.println( id + "\t\t" + containerId + "\t\t" + startTime + "\t\t" + finishTime + "\t\t" + bw);
    }
    
    public int getTime(){
    	return time;
    }
    
    public void subTime(int t){
    	time -= t;
    }
    
    public int getContainerId(){
    	return containerId;
    }
    
    public boolean getStatus(){
    	return started;
    }
    
    public void turnOn(){
    	started = true;
    }
}