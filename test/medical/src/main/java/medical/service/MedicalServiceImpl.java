package medical.service;

import medical.model.Medical;
import medical.repository.MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {
    @Autowired
    private MedicalRepository medicalRepository;

    @Override
    public List<String> years() {
        return medicalRepository.years();
    }

    @Override
    public List<String> vehicles() {
        return medicalRepository.vehicles();
    }

    @Override
    public Medical findById(int id) {
        return null;
    }

    @Override
    public List<Medical> findAll() {
        return null;
    }

    @Override
    public void create(Medical medical) {

    }

    @Override
    public void update(int id, Medical medical) {

    }
}