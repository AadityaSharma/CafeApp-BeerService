package aaditya.dev.cafeappbeerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    @Ignore
    void getBeerById() throws Exception{
//        mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString()));
    }

    @Test
    @Ignore
    void saveNewBeer() throws Exception{

//        BeerDto beerDto = BeerDto.builder().build();
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//
//        mockMvc.perform(post("/api/v1/beer")).contentType(MediaType.APPLICATION_JSON);
//
    }

    @Test
    @Ignore
    void updateBeerById() throws Exception{
    }
}