package my.pgmanagement;

class Guest extends Entity {

    String phone_no;
    String aadhar;

    Guest(String name, String phone_no, String aadhar) {
        this.name = name;
        this.phone_no = phone_no;
        this.aadhar = aadhar;
    }
}