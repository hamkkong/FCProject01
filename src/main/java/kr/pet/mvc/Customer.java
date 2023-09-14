package kr.pet.mvc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String phoneNumber;
    private String ownerName;
    private String petName;
    private String address;
    private String species;
    private int birthYear;
    //private List<MedicalRecord> medicalRecords; // 진료 기록을 저장하는 리스트

    //public Customer(){ } // 디폴트 생성자

    // 생성자 추가

    public Customer(String phoneNumber, String ownerName, String petName, String address, String species, int birthYear) {
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.petName = petName;
        this.address = address;
        this.species = species;
        this.birthYear = birthYear;
        //this.medicalRecords =new ArrayList<>(); // 빈 리스트로 초기화
    }


    //Setter,getter 추가


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /* public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    // 고객별로 진료기록을 등록
    public void addMedicalRecords(MedicalRecord records) {
       medicalRecords.add(records); // 진료기록을 records로 받아 medicalRecords 등록
    }*/

    //toString 추가
    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", petName='" + petName + '\'' +
                ", address='" + address + '\'' +
                ", species='" + species + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }


}
