package kr.pet.mvc;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordsController {
    private List<MedicalRecord> records = new ArrayList<>(); //customer에서 가져온 객체

    // 진료기록을 등록하는 메서드
    public void addMedicalRecord(MedicalRecord record){
        records.add(record); // records 라는 Arraylist 에 추가해 저장한다.
    }

    // 진료기록을 삭제하는 메서드
    public void removeMedicalRecord(String phoneNumber){
        for (int i=0; i< records.size();i++){
            if (records.get(i).getPhoneNumber().equals(phoneNumber)){
                records.remove(i); // 입력한 값과 일치하는 저장값이 있을경우 저장값을 지워라.
                break;
            }
        }
    }
    //전화번호에 해당하는 모든 진료기록을 검색하여 새로운 List<Medical Record>를 만들어주는 메서드
    public List<MedicalRecord> findMedicalRecord(String phoneNumber){
        List<MedicalRecord> result = new ArrayList<>();
        for(MedicalRecord record : records){
            if (record.getPhoneNumber().equals(phoneNumber)){
                result.add(record);
            }
        }
        return result;
    }
}
