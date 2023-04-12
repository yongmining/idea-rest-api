package com.travlej.backend.postrequest.request.controller;

import com.travlej.backend.common.ResponseDto;
import com.travlej.backend.postrequest.request.dto.RequestDTO;
import com.travlej.backend.postrequest.request.repository.RequestRepository;
import com.travlej.backend.postrequest.request.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class RequestController {
    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/reports")
    public ResponseEntity<?> registNewRequest(@RequestBody RequestDTO newRequest) {

        requestService.registNewRequest(newRequest);

        return ResponseEntity
                .created(URI.create("/swagger/requests" + newRequest.getTitle()))
                .build();
    }
}