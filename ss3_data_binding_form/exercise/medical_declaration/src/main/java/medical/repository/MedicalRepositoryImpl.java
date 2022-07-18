package medical.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements MedicalRepository {
    @Override
    public List<String> genders() {
        List<String> genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");
        genders.add("Other");
        return genders;
    }

    @Override
    public List<String> nationality() {
        List<String> nationality = new ArrayList<>();
        nationality.add("Việt Nam");
        nationality.add("Lào");
        nationality.add("Nhật");
        nationality.add("Hàn");
        return nationality;
    }

    @Override
    public List<String> years() {
        List<String> years = new ArrayList<>();
        years.add("1997");
        years.add("1998");
        years.add("1999");
        years.add("2000");
        return years;
    }

    @Override
    public List<String> vehicles() {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("Tàu bay");
        vehicles.add("Tàu thuyền");
        vehicles.add("Ô tô");
        vehicles.add("Khác");
        return vehicles;
    }
}
