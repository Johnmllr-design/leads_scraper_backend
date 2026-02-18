package com.example.demo;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ControllerFile {

    private DatabaseORM orm;

    public ControllerFile(DatabaseORM injectableORM){
        this.orm = injectableORM;
    }


    @GetMapping("/getpreviousrequests")
    public String getMethodName() {
        return orm.findById(1).get().getPreviousRequests().toString();
    }


    @PostMapping("/saverequest")
    public String postMethodName(@RequestBody Newreq req) {
        if (orm.existsById(1)){
            Optional<previousRequest> pr = orm.findById(1);
            previousRequest p = pr.get();
            p.appendRequest(req.request());
            orm.save(p);
        }else{
            ArrayList<String> requests = new ArrayList<>();
            requests.add(req.request());
            previousRequest allRequests = new previousRequest(1, requests);
            orm.save(allRequests);
        }
        return "succesfully saved request";
    }
}
