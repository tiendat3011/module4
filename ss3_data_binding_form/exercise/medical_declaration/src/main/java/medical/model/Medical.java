package medical.model;

public class Medical {
    private String name;
    private String yearOfBirth;
    private String gender;
    private String nationality;
    private String numberId;
    private String vehicle;
    private String vehicleOfCode;
    private String seatOfCode;
    private String startDay;
    private String endDay;
    private String info14Day;

    public Medical() {
    }

    public Medical(String name, String yearOfBirth, String gender, String nationality, String numberId, String vehicle, String vehicleOfCode, String seatOfCode, String startDay, String endDay, String info14Day) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.numberId = numberId;
        this.vehicle = vehicle;
        this.vehicleOfCode = vehicleOfCode;
        this.seatOfCode = seatOfCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.info14Day = info14Day;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleOfCode() {
        return vehicleOfCode;
    }

    public void setVehicleOfCode(String vehicleOfCode) {
        this.vehicleOfCode = vehicleOfCode;
    }

    public String getSeatOfCode() {
        return seatOfCode;
    }

    public void setSeatOfCode(String seatOfCode) {
        this.seatOfCode = seatOfCode;
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