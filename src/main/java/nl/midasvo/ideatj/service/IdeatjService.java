package nl.midasvo.ideatj.service;

import nl.midasvo.ideatj.dto.IdeatjDTO;
import nl.midasvo.ideatj.entity.Ideatj;
import nl.midasvo.ideatj.mapper.IdeatjMapper;
import nl.midasvo.ideatj.repository.IdeatjRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IdeatjService {

    @Autowired
    private IdeatjRepository ideatjRepository;

    public List<IdeatjDTO> listIdeatj() {
        List<Ideatj> ideatjList = IterableUtils.toList(ideatjRepository.findAll());
        return ideatjList.stream().map(i -> IdeatjMapper.toDTO(i)).collect(Collectors.toList());
    }

}
