package org.camptocamp.dollop;
import jenkins.*;
import jenkins.model.*;
import javaposse.jobdsl.plugin.JenkinsJobManagement

class initDsl{
    private Object context;


    initDsl(context){
        this.context = context;
    }

    void installJobs(){
        //println this.context;
        println this.context.toString()
        println this.context.getRawBuild()
        println this.context.getRawBuild().toString()
        def creator = new JenkinsJobManagement(System.out, [:], new File('.'))
        creator.createNewJob('This is a test','BLBLBL')
        //this.context.getRawBuild().job("admin/01_team_credentials_and_allocated_slaves") {}
    }
}
