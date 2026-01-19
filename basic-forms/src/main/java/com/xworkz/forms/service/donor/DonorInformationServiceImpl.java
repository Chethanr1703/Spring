package com.xworkz.forms.service.donor;

import com.xworkz.forms.dto.DonorInformationDTO;
import com.xworkz.forms.entity.DonorInformationEntity;
import com.xworkz.forms.repo.donor.DonorInformationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorInformationServiceImpl implements DonorInformationService {

    @Autowired
    private DonorInformationRepository repository;

    @Override
    public void save(DonorInformationDTO dto) {
        DonorInformationEntity entity = new DonorInformationEntity();
        BeanUtils.copyProperties(dto, entity);
        repository.save(entity);
    }
}
