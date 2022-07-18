package medical.service;

import medical.model.Medical;

import java.util.List;

public interface MedicalService {
    List<String> years();

    List<String> vehicles();

    Medical findById(int id);

    List<Medical> findAll();

    void create(Medical medical);

    void update(int id, Medical medical);
}
