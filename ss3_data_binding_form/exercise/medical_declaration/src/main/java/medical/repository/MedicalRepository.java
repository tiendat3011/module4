package medical.repository;

import java.util.List;

public interface MedicalRepository {
    List<String> genders();

    List<String> nationality();

    List<String> years();

    List<String> vehicles();
}
