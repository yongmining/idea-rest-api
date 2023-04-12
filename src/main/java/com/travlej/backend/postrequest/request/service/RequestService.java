package com.travlej.backend.postrequest.request.service;
import com.travlej.backend.postrequest.request.dto.RequestDTO;
import com.travlej.backend.postrequest.request.entity.Request;
import com.travlej.backend.postrequest.request.repository.RequestRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestService {

    private final RequestRepository requestRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RequestService(RequestRepository requestRepository, ModelMapper modelMapper) {
        this.requestRepository = requestRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void registNewRequest(RequestDTO newRequest) {

        requestRepository.save(modelMapper.map(newRequest, Request.class));
    }


}
