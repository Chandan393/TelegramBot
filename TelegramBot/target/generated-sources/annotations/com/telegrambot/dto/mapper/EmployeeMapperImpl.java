package com.telegrambot.dto.mapper;

import com.airport.api.dto.request.AirportRequest;
import com.airport.api.dto.response.AirportResponse;
import com.airport.api.model.Airports;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-17T15:41:07+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements AirportMapper {

    @Override
    public Airports fromRequestToEntity(AirportRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        Airports Airports = new Airports();

        Airports.setName( employeeRequest.getName() );
        Airports.setGender( employeeRequest.getGender() );
        Airports.setDateOfBirth( employeeRequest.getDateOfBirth() );
        Airports.setAddress( employeeRequest.getAddress() );

        return Airports;
    }

    @Override
    public AirportResponse fromEntityToResponse(Airports Airports) {
        if ( Airports == null ) {
            return null;
        }

        AirportResponse airportResponse = new AirportResponse();

        airportResponse.setId( Airports.getId() );
        airportResponse.setName( Airports.getName() );
        airportResponse.setGender( Airports.getGender() );
        airportResponse.setDateOfBirth( Airports.getDateOfBirth() );
        airportResponse.setAddress( Airports.getAddress() );

        return airportResponse;
    }
}
