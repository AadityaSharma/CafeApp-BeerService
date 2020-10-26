package aaditya.dev.cafeappbeerservice.web.mappers;

import aaditya.dev.cafeappbeerservice.domain.Beer;
import aaditya.dev.cafeappbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
