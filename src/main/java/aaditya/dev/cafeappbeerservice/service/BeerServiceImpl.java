package aaditya.dev.cafeappbeerservice.service;

import aaditya.dev.cafeappbeerservice.domain.Beer;
import aaditya.dev.cafeappbeerservice.repositories.BeerRepository;
import aaditya.dev.cafeappbeerservice.web.controller.NotFoundException;
import aaditya.dev.cafeappbeerservice.web.mappers.BeerMapper;
import aaditya.dev.cafeappbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(
                beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
       Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

       beer.setBeerName(beerDto.getBeerName());
       beer.setBeerStyle(beerDto.getBeerStyle().name());
       beer.setPrice(beerDto.getPrice());
       beer.setUpc(beerDto.getUpc());

       return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
