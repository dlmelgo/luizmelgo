package com.melgo.sysarch.service;

import com.melgo.sysarch.dto.BangkaRequest;
import com.melgo.sysarch.model.Bangka;
import com.melgo.sysarch.repository.BangkaRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BangkaService {

    @Autowired
    private BangkaRepository bangkaRepository;

    @ApiOperation(value = "Add a new Bangka")
    public Bangka addBangka(@ApiParam(value = "Bangka details to add", required = true) BangkaRequest request) {
        Bangka bangka = new Bangka();
        bangka.setName(request.getName());
        bangka.setPrice(request.getPrice());
        bangka.setPortArea(request.getPortArea());

        return bangkaRepository.save(bangka);
    }

    @ApiOperation(value = "Get all Bangkas", response = List.class)
    public List<Bangka> getAllBangkas() {
        return bangkaRepository.findAll();
    }

    @ApiOperation(value = "Get Bangka by name", response = Bangka.class)
    public Bangka getBangkaByName(
            @ApiParam(value = "Name of the Bangka to retrieve", required = true) String name) throws Exception {
        Optional<Bangka> bangkaOptional = bangkaRepository.findByName(name);
        if (bangkaOptional.isPresent()) {
            return bangkaOptional.get();
        } else {
            throw new Exception("Bangka not found");
        }
    }
}
