package kr.pet.mvc;

public class MedicalRecord {  // 진료받은 내용과 날짜를 표시
    private String phoneNumber;
    private String date;
    private String content;

    //디폴트 생성자
    public MedicalRecord(){  }

    //생성자
    public MedicalRecord(String phoneNumber, String date, String content) {
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.content = content;
    }
    //getter, setter

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //toString
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
