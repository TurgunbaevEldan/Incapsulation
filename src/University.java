public class University {
    private int year;
    private String name;
    private String address;
    private String country;

    public University(int year, String name, String address, String country) {
        this.year = year;
        this.name = name;
        this.address = address;
        this.country = country;
    }
    public University(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "< University >" +'\n'+
                " Year - " + year +'\n'+
                " Name: " + name +'\n'+
                " Address: " + address +'\n'+
                " Country: " + country +'\n';
    }
}