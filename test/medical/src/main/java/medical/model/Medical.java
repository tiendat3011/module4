package medical.model;

public class Medical {
    private int id;
    private String name;
    private String yearOfBirth;
    private String vehicle;
    private String startDay;
    private String endDay;
    private String info14Day;

    public Medical() {
    }

    public Medical(int id, String name, String yearOfBirth, String vehicle, String startDay, String endDay, String info14Day) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.vehicle = vehicle;
        this.startDay = startDay;
        this.endDay = endDay;
        this.info14Day = info14Day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getInfo14Day() {
        return info14Day;
    }

    public void setInfo14Day(String info14Day) {
        this.info14Day = info14Day;
    }
}