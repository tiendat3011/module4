package medical.repository;

import medical.model.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements MedicalRepository {
    private static final List<Medical> medicalList = new ArrayList<>();

    static {
        medicalList.add(new Medical(1, "dat", "1999", "Tàu bay", "2022-07-08", "2022-07-07", "asd"));
        medicalList.add(new Medical(2, "ha", "1999", "Tàu bay", "2022-07-08", "2022-07-07", "asd"));
        medicalList.add(new Medical(3, "thao", "1999", "Tàu bay", "2022-07-08", "2022-07-07", "asd"));
        medicalList.add(new Medical(4, "linh", "1999", "Tàu bay", "2022-07-08", "2022-07-07", "asd"));
    }

    @Override
    public List<String> years() {
        List<String> years = new ArrayList<>();
        years.add("1999");
        years.add("2000");
        years.add("2001");
        years.add("2002");
        years.add("2003");
        return years;
    }

    @Override
    public List<String> vehicles() {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Tàu bay");
        vehicles.add("Tàu Thuyền");
        vehicles.add("Ô Tô");
        vehicles.add("Khác(Ghi Rõ)");
        return vehicles;
    }

    @Override
    public Medical findById(int id) {
        for (Medical item : medicalList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public void create(Medical medical) {
        medicalList.add(medical);
    }

    @Override
    public void update(int id, Medical medical) {
        medicalList.add(id, medical);
    }
}
