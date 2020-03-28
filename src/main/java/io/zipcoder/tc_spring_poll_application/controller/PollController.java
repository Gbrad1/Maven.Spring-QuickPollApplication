package io.zipcoder.tc_spring_poll_application.controller;

import io.zipcoder.tc_spring_poll_application.domain.Poll;
import io.zipcoder.tc_spring_poll_application.repositories.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    private PollRepository pollRepository;

    @Autowired
    public PollController(PollRepository pr) {
        this.pollRepository = pr;
    }

    @RequestMapping(value="/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        Iterable<Poll> allPolls = pollRepository.findAll();
        return new ResponseEntity<>(allPolls, HttpStatus.OK);
    }

    /*The method above begins with reading all of the polls using the PollRepository
    * We then create an instance of ResponseEntity and pass in Poll data and the HttpStatus.OK status value.
    * The Poll data becomes part of the response body and OK (code200) becomes the response status code.*/
}
