package medical.repository;

import medical.model.Medical;

import java.util.List;

public interface MedicalRepository {
    List<String> years();

    List<String> vehicles();

    Medical findById(int id);

    List<Medical> findAll();

    void create(Medical medical);

    void update(int id, Medical medical);


}
