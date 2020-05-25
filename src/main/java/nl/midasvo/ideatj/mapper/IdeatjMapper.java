package nl.midasvo.ideatj.mapper;

import nl.midasvo.ideatj.dto.IdeatjDTO;
import nl.midasvo.ideatj.entity.Ideatj;

public class IdeatjMapper {

    public static IdeatjDTO toDTO(Ideatj ideatj) {
        IdeatjDTO dto = new IdeatjDTO();


        return dto;
    }

    static Ideatj toEntity(IdeatjDTO dto) {
        Ideatj ideatj = new Ideatj();

        return ideatj;
    }
}
