package medical.service;

import java.util.List;

public interface MedicalService {
    List<String> genders();

    List<String> nationality();

    List<String> years();

    List<String> vehicles();
}