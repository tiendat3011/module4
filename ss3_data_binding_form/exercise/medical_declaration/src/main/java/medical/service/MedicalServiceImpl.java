package medical.service;

import medical.repository.MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {
    @Autowired
    private MedicalRepository medicalRepository;

    @Override
    public List<String> genders() {
        return medicalRepository.genders();
    }

    @Override
    public List<String> nationality() {
        return medicalRepository.nationality();
    }

    @Override
    public List<String> years() {
        return medicalRepository.years();
    }

    @Override
    public List<String> vehicles() {
        return medicalRepository.vehicles();
    }
}
