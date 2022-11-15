package com.example.ritmentor;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentRVModal implements Parcelable {
    private String studentID,studentFullName, studentBranch, studentSection, studentYearOfAdmission, studentPhone, parentPhone, studentPersonalEmail,
            studentAadhaar, fatherAadhaar, motherAadhaar, studentPresentAddress, studentPermanentAddress, studentFirstName, studentMiddleName, studentLastName,
            studentGender, studentCollegeEmail, studentDateOfBirth, studentVillage_Area, studentDistrict_City, studentState, studentPincode, studentCountry, parentFullName,
            guardianFullName, guardianPhone, studentClass10CGPA_Percentage, studentSSCBoard, studentSSCSchoolName, studentSSCState, studentSSCYearOfPassing,
            studentClass12CGPA_Percentage, studentClass12Board, studentClass12CollegeName, studentClass12State, studentClass12YearOfPassing, studentEAMCETRank,
            studentDiplomaCGPA_Percentage, studentDiplomaBoard, studentDiplomaInstituteName, studentDiplomaInstituteAddress, studentDiplomaSpecialization_Branch,
            studentDiplomaState, studentDiplomaYearOfPassing, studentECETRank, studentGraduationCGPA, studentHistoryOfBacklogs_Yes_No, studentNoOfBacklogs,
            studentGraduationUniversityName, studentGraduationInstituteName, studentGraduationSpecialization_Branch, studentGraduationYearOfPassing,
            studentCategory, student_1_1_SGPA, student_1_1_FailedSubjects, student_1_2_SGPA, student_1_2_FailedSubjects, student_2_1_SGPA, student_2_1_FailedSubjects,
            student_2_2_SGPA, student_2_2_FailedSubjects, studentPEGA, studentService_Product;

    protected StudentRVModal(Parcel in) {
        studentID = in.readString();
        studentFullName = in.readString();
        studentBranch = in.readString();
        studentSection = in.readString();
        studentYearOfAdmission = in.readString();
        studentPhone = in.readString();
        parentPhone = in.readString();
        studentPersonalEmail = in.readString();
        studentAadhaar = in.readString();
        fatherAadhaar = in.readString();
        motherAadhaar = in.readString();
        studentPresentAddress = in.readString();
        studentPermanentAddress = in.readString();
        studentFirstName = in.readString();
        studentMiddleName = in.readString();
        studentLastName = in.readString();
        studentGender = in.readString();
        studentCollegeEmail = in.readString();
        studentDateOfBirth = in.readString();
        studentVillage_Area = in.readString();
        studentDistrict_City = in.readString();
        studentState = in.readString();
        studentPincode = in.readString();
        studentCountry = in.readString();
        parentFullName = in.readString();
        guardianFullName = in.readString();
        guardianPhone = in.readString();
        studentClass10CGPA_Percentage = in.readString();
        studentSSCBoard = in.readString();
        studentSSCSchoolName = in.readString();
        studentSSCState = in.readString();
        studentSSCYearOfPassing = in.readString();
        studentClass12CGPA_Percentage = in.readString();
        studentClass12Board = in.readString();
        studentClass12CollegeName = in.readString();
        studentClass12State = in.readString();
        studentClass12YearOfPassing = in.readString();
        studentEAMCETRank = in.readString();
        studentDiplomaCGPA_Percentage = in.readString();
        studentDiplomaBoard = in.readString();
        studentDiplomaInstituteName = in.readString();
        studentDiplomaInstituteAddress = in.readString();
        studentDiplomaSpecialization_Branch = in.readString();
        studentDiplomaState = in.readString();
        studentDiplomaYearOfPassing = in.readString();
        studentECETRank = in.readString();
        studentGraduationCGPA = in.readString();
        studentHistoryOfBacklogs_Yes_No = in.readString();
        studentNoOfBacklogs = in.readString();
        studentGraduationUniversityName = in.readString();
        studentGraduationInstituteName = in.readString();
        studentGraduationSpecialization_Branch = in.readString();
        studentGraduationYearOfPassing = in.readString();
        studentCategory = in.readString();
        student_1_1_SGPA = in.readString();
        student_1_1_FailedSubjects = in.readString();
        student_1_2_SGPA = in.readString();
        student_1_2_FailedSubjects = in.readString();
        student_2_1_SGPA = in.readString();
        student_2_1_FailedSubjects = in.readString();
        student_2_2_SGPA = in.readString();
        student_2_2_FailedSubjects = in.readString();
        studentPEGA = in.readString();
        studentService_Product = in.readString();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(studentID);
        dest.writeString(studentFullName);
        dest.writeString(studentBranch);
        dest.writeString(studentSection);
        dest.writeString(studentYearOfAdmission);
        dest.writeString(studentPhone);
        dest.writeString(parentPhone);
        dest.writeString(studentPersonalEmail);
        dest.writeString(studentAadhaar);
        dest.writeString(fatherAadhaar);
        dest.writeString(motherAadhaar);
        dest.writeString(studentPresentAddress);
        dest.writeString(studentPermanentAddress);
        dest.writeString(studentFirstName);
        dest.writeString(studentMiddleName);
        dest.writeString(studentLastName);
        dest.writeString(studentGender);
        dest.writeString(studentCollegeEmail);
        dest.writeString(studentDateOfBirth);
        dest.writeString(studentVillage_Area);
        dest.writeString(studentDistrict_City);
        dest.writeString(studentState);
        dest.writeString(studentPincode);
        dest.writeString(studentCountry);
        dest.writeString(parentFullName);
        dest.writeString(guardianFullName);
        dest.writeString(guardianPhone);
        dest.writeString(studentClass10CGPA_Percentage);
        dest.writeString(studentSSCBoard);
        dest.writeString(studentSSCSchoolName);
        dest.writeString(studentSSCState);
        dest.writeString(studentSSCYearOfPassing);
        dest.writeString(studentClass12CGPA_Percentage);
        dest.writeString(studentClass12Board);
        dest.writeString(studentClass12CollegeName);
        dest.writeString(studentClass12State);
        dest.writeString(studentClass12YearOfPassing);
        dest.writeString(studentEAMCETRank);
        dest.writeString(studentDiplomaCGPA_Percentage);
        dest.writeString(studentDiplomaBoard);
        dest.writeString(studentDiplomaInstituteName);
        dest.writeString(studentDiplomaInstituteAddress);
        dest.writeString(studentDiplomaSpecialization_Branch);
        dest.writeString(studentDiplomaState);
        dest.writeString(studentDiplomaYearOfPassing);
        dest.writeString(studentECETRank);
        dest.writeString(studentGraduationCGPA);
        dest.writeString(studentHistoryOfBacklogs_Yes_No);
        dest.writeString(studentNoOfBacklogs);
        dest.writeString(studentGraduationUniversityName);
        dest.writeString(studentGraduationInstituteName);
        dest.writeString(studentGraduationSpecialization_Branch);
        dest.writeString(studentGraduationYearOfPassing);
        dest.writeString(studentCategory);
        dest.writeString(student_1_1_SGPA);
        dest.writeString(student_1_1_FailedSubjects);
        dest.writeString(student_1_2_SGPA);
        dest.writeString(student_1_2_FailedSubjects);
        dest.writeString(student_2_1_SGPA);
        dest.writeString(student_2_1_FailedSubjects);
        dest.writeString(student_2_2_SGPA);
        dest.writeString(student_2_2_FailedSubjects);
        dest.writeString(studentPEGA);
        dest.writeString(studentService_Product);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<StudentRVModal> CREATOR = new Creator<StudentRVModal>() {
        @Override
        public StudentRVModal createFromParcel(Parcel in) {
            return new StudentRVModal(in);
        }

        @Override
        public StudentRVModal[] newArray(int size) {
            return new StudentRVModal[size];
        }
    };

    public StudentRVModal(String studentID, String studentFullName, String studentBranch, String studentSection, String studentYearOfAdmission, String studentPhone, String parentPhone, String studentPersonalEmail, String studentAadhaar, String fatherAadhaar, String motherAadhaar, String studentPresentAddress, String studentPermanentAddress, String studentFirstName, String studentMiddleName, String studentLastName, String studentGender, String studentCollegeEmail, String studentDateOfBirth, String studentVillage_Area, String studentDistrict_City, String studentState, String studentPincode, String studentCountry, String parentFullName, String guardianFullName, String guardianPhone, String studentClass10CGPA_Percentage, String studentSSCBoard, String studentSSCSchoolName, String studentSSCState, String studentSSCYearOfPassing, String studentClass12CGPA_Percentage, String studentClass12Board, String studentClass12CollegeName, String studentClass12State, String studentClass12YearOfPassing, String studentEAMCETRank, String studentDiplomaCGPA_Percentage, String studentDiplomaBoard, String studentDiplomaInstituteName, String studentDiplomaInstituteAddress, String studentDiplomaSpecialization_Branch, String studentDiplomaState, String studentDiplomaYearOfPassing, String studentECETRank, String studentGraduationCGPA, String studentHistoryOfBacklogs_Yes_No, String studentNoOfBacklogs, String studentGraduationUniversityName, String studentGraduationInstituteName, String studentGraduationSpecialization_Branch, String studentGraduationYearOfPassing, String studentCategory, String student_1_1_SGPA, String student_1_1_FailedSubjects, String student_1_2_SGPA, String student_1_2_FailedSubjects, String student_2_1_SGPA, String student_2_1_FailedSubjects, String student_2_2_SGPA, String student_2_2_FailedSubjects, String studentPEGA, String studentService_Product) {
        this.studentID = studentID;
        this.studentFullName = studentFullName;
        this.studentBranch = studentBranch;
        this.studentSection = studentSection;
        this.studentYearOfAdmission = studentYearOfAdmission;
        this.studentPhone = studentPhone;
        this.parentPhone = parentPhone;
        this.studentPersonalEmail = studentPersonalEmail;
        this.studentAadhaar = studentAadhaar;
        this.fatherAadhaar = fatherAadhaar;
        this.motherAadhaar = motherAadhaar;
        this.studentPresentAddress = studentPresentAddress;
        this.studentPermanentAddress = studentPermanentAddress;
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.studentGender = studentGender;
        this.studentCollegeEmail = studentCollegeEmail;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentVillage_Area = studentVillage_Area;
        this.studentDistrict_City = studentDistrict_City;
        this.studentState = studentState;
        this.studentPincode = studentPincode;
        this.studentCountry = studentCountry;
        this.parentFullName = parentFullName;
        this.guardianFullName = guardianFullName;
        this.guardianPhone = guardianPhone;
        this.studentClass10CGPA_Percentage = studentClass10CGPA_Percentage;
        this.studentSSCBoard = studentSSCBoard;
        this.studentSSCSchoolName = studentSSCSchoolName;
        this.studentSSCState = studentSSCState;
        this.studentSSCYearOfPassing = studentSSCYearOfPassing;
        this.studentClass12CGPA_Percentage = studentClass12CGPA_Percentage;
        this.studentClass12Board = studentClass12Board;
        this.studentClass12CollegeName = studentClass12CollegeName;
        this.studentClass12State = studentClass12State;
        this.studentClass12YearOfPassing = studentClass12YearOfPassing;
        this.studentEAMCETRank = studentEAMCETRank;
        this.studentDiplomaCGPA_Percentage = studentDiplomaCGPA_Percentage;
        this.studentDiplomaBoard = studentDiplomaBoard;
        this.studentDiplomaInstituteName = studentDiplomaInstituteName;
        this.studentDiplomaInstituteAddress = studentDiplomaInstituteAddress;
        this.studentDiplomaSpecialization_Branch = studentDiplomaSpecialization_Branch;
        this.studentDiplomaState = studentDiplomaState;
        this.studentDiplomaYearOfPassing = studentDiplomaYearOfPassing;
        this.studentECETRank = studentECETRank;
        this.studentGraduationCGPA = studentGraduationCGPA;
        this.studentHistoryOfBacklogs_Yes_No = studentHistoryOfBacklogs_Yes_No;
        this.studentNoOfBacklogs = studentNoOfBacklogs;
        this.studentGraduationUniversityName = studentGraduationUniversityName;
        this.studentGraduationInstituteName = studentGraduationInstituteName;
        this.studentGraduationSpecialization_Branch = studentGraduationSpecialization_Branch;
        this.studentGraduationYearOfPassing = studentGraduationYearOfPassing;
        this.studentCategory = studentCategory;
        this.student_1_1_SGPA = student_1_1_SGPA;
        this.student_1_1_FailedSubjects = student_1_1_FailedSubjects;
        this.student_1_2_SGPA = student_1_2_SGPA;
        this.student_1_2_FailedSubjects = student_1_2_FailedSubjects;
        this.student_2_1_SGPA = student_2_1_SGPA;
        this.student_2_1_FailedSubjects = student_2_1_FailedSubjects;
        this.student_2_2_SGPA = student_2_2_SGPA;
        this.student_2_2_FailedSubjects = student_2_2_FailedSubjects;
        this.studentPEGA = studentPEGA;
        this.studentService_Product = studentService_Product;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public String getStudentYearOfAdmission() {
        return studentYearOfAdmission;
    }

    public void setStudentYearOfAdmission(String studentYearOfAdmission) {
        this.studentYearOfAdmission = studentYearOfAdmission;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getStudentPersonalEmail() {
        return studentPersonalEmail;
    }

    public void setStudentPersonalEmail(String studentPersonalEmail) {
        this.studentPersonalEmail = studentPersonalEmail;
    }

    public String getStudentAadhaar() {
        return studentAadhaar;
    }

    public void setStudentAadhaar(String studentAadhaar) {
        this.studentAadhaar = studentAadhaar;
    }

    public String getFatherAadhaar() {
        return fatherAadhaar;
    }

    public void setFatherAadhaar(String fatherAadhaar) {
        this.fatherAadhaar = fatherAadhaar;
    }

    public String getMotherAadhaar() {
        return motherAadhaar;
    }

    public void setMotherAadhaar(String motherAadhaar) {
        this.motherAadhaar = motherAadhaar;
    }

    public String getStudentPresentAddress() {
        return studentPresentAddress;
    }

    public void setStudentPresentAddress(String studentPresentAddress) {
        this.studentPresentAddress = studentPresentAddress;
    }

    public String getStudentPermanentAddress() {
        return studentPermanentAddress;
    }

    public void setStudentPermanentAddress(String studentPermanentAddress) {
        this.studentPermanentAddress = studentPermanentAddress;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentCollegeEmail() {
        return studentCollegeEmail;
    }

    public void setStudentCollegeEmail(String studentCollegeEmail) {
        this.studentCollegeEmail = studentCollegeEmail;
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentVillage_Area() {
        return studentVillage_Area;
    }

    public void setStudentVillage_Area(String studentVillage_Area) {
        this.studentVillage_Area = studentVillage_Area;
    }

    public String getStudentDistrict_City() {
        return studentDistrict_City;
    }

    public void setStudentDistrict_City(String studentDistrict_City) {
        this.studentDistrict_City = studentDistrict_City;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    public String getStudentPincode() {
        return studentPincode;
    }

    public void setStudentPincode(String studentPincode) {
        this.studentPincode = studentPincode;
    }

    public String getStudentCountry() {
        return studentCountry;
    }

    public void setStudentCountry(String studentCountry) {
        this.studentCountry = studentCountry;
    }

    public String getParentFullName() {
        return parentFullName;
    }

    public void setParentFullName(String parentFullName) {
        this.parentFullName = parentFullName;
    }

    public String getGuardianFullName() {
        return guardianFullName;
    }

    public void setGuardianFullName(String guardianFullName) {
        this.guardianFullName = guardianFullName;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public String getStudentClass10CGPA_Percentage() {
        return studentClass10CGPA_Percentage;
    }

    public void setStudentClass10CGPA_Percentage(String studentClass10CGPA_Percentage) {
        this.studentClass10CGPA_Percentage = studentClass10CGPA_Percentage;
    }

    public String getStudentSSCBoard() {
        return studentSSCBoard;
    }

    public void setStudentSSCBoard(String studentSSCBoard) {
        this.studentSSCBoard = studentSSCBoard;
    }

    public String getStudentSSCSchoolName() {
        return studentSSCSchoolName;
    }

    public void setStudentSSCSchoolName(String studentSSCSchoolName) {
        this.studentSSCSchoolName = studentSSCSchoolName;
    }

    public String getStudentSSCState() {
        return studentSSCState;
    }

    public void setStudentSSCState(String studentSSCState) {
        this.studentSSCState = studentSSCState;
    }

    public String getStudentSSCYearOfPassing() {
        return studentSSCYearOfPassing;
    }

    public void setStudentSSCYearOfPassing(String studentSSCYearOfPassing) {
        this.studentSSCYearOfPassing = studentSSCYearOfPassing;
    }

    public String getStudentClass12CGPA_Percentage() {
        return studentClass12CGPA_Percentage;
    }

    public void setStudentClass12CGPA_Percentage(String studentClass12CGPA_Percentage) {
        this.studentClass12CGPA_Percentage = studentClass12CGPA_Percentage;
    }

    public String getStudentClass12Board() {
        return studentClass12Board;
    }

    public void setStudentClass12Board(String studentClass12Board) {
        this.studentClass12Board = studentClass12Board;
    }

    public String getStudentClass12CollegeName() {
        return studentClass12CollegeName;
    }

    public void setStudentClass12CollegeName(String studentClass12CollegeName) {
        this.studentClass12CollegeName = studentClass12CollegeName;
    }

    public String getStudentClass12State() {
        return studentClass12State;
    }

    public void setStudentClass12State(String studentClass12State) {
        this.studentClass12State = studentClass12State;
    }

    public String getStudentClass12YearOfPassing() {
        return studentClass12YearOfPassing;
    }

    public void setStudentClass12YearOfPassing(String studentClass12YearOfPassing) {
        this.studentClass12YearOfPassing = studentClass12YearOfPassing;
    }

    public String getStudentEAMCETRank() {
        return studentEAMCETRank;
    }

    public void setStudentEAMCETRank(String studentEAMCETRank) {
        this.studentEAMCETRank = studentEAMCETRank;
    }

    public String getStudentDiplomaCGPA_Percentage() {
        return studentDiplomaCGPA_Percentage;
    }

    public void setStudentDiplomaCGPA_Percentage(String studentDiplomaCGPA_Percentage) {
        this.studentDiplomaCGPA_Percentage = studentDiplomaCGPA_Percentage;
    }

    public String getStudentDiplomaBoard() {
        return studentDiplomaBoard;
    }

    public void setStudentDiplomaBoard(String studentDiplomaBoard) {
        this.studentDiplomaBoard = studentDiplomaBoard;
    }

    public String getStudentDiplomaInstituteName() {
        return studentDiplomaInstituteName;
    }

    public void setStudentDiplomaInstituteName(String studentDiplomaInstituteName) {
        this.studentDiplomaInstituteName = studentDiplomaInstituteName;
    }

    public String getStudentDiplomaInstituteAddress() {
        return studentDiplomaInstituteAddress;
    }

    public void setStudentDiplomaInstituteAddress(String studentDiplomaInstituteAddress) {
        this.studentDiplomaInstituteAddress = studentDiplomaInstituteAddress;
    }

    public String getStudentDiplomaSpecialization_Branch() {
        return studentDiplomaSpecialization_Branch;
    }

    public void setStudentDiplomaSpecialization_Branch(String studentDiplomaSpecialization_Branch) {
        this.studentDiplomaSpecialization_Branch = studentDiplomaSpecialization_Branch;
    }

    public String getStudentDiplomaState() {
        return studentDiplomaState;
    }

    public void setStudentDiplomaState(String studentDiplomaState) {
        this.studentDiplomaState = studentDiplomaState;
    }

    public String getStudentDiplomaYearOfPassing() {
        return studentDiplomaYearOfPassing;
    }

    public void setStudentDiplomaYearOfPassing(String studentDiplomaYearOfPassing) {
        this.studentDiplomaYearOfPassing = studentDiplomaYearOfPassing;
    }

    public String getStudentECETRank() {
        return studentECETRank;
    }

    public void setStudentECETRank(String studentECETRank) {
        this.studentECETRank = studentECETRank;
    }

    public String getStudentGraduationCGPA() {
        return studentGraduationCGPA;
    }

    public void setStudentGraduationCGPA(String studentGraduationCGPA) {
        this.studentGraduationCGPA = studentGraduationCGPA;
    }

    public String getStudentHistoryOfBacklogs_Yes_No() {
        return studentHistoryOfBacklogs_Yes_No;
    }

    public void setStudentHistoryOfBacklogs_Yes_No(String studentHistoryOfBacklogs_Yes_No) {
        this.studentHistoryOfBacklogs_Yes_No = studentHistoryOfBacklogs_Yes_No;
    }

    public String getStudentNoOfBacklogs() {
        return studentNoOfBacklogs;
    }

    public void setStudentNoOfBacklogs(String studentNoOfBacklogs) {
        this.studentNoOfBacklogs = studentNoOfBacklogs;
    }

    public String getStudentGraduationUniversityName() {
        return studentGraduationUniversityName;
    }

    public void setStudentGraduationUniversityName(String studentGraduationUniversityName) {
        this.studentGraduationUniversityName = studentGraduationUniversityName;
    }

    public String getStudentGraduationInstituteName() {
        return studentGraduationInstituteName;
    }

    public void setStudentGraduationInstituteName(String studentGraduationInstituteName) {
        this.studentGraduationInstituteName = studentGraduationInstituteName;
    }

    public String getStudentGraduationSpecialization_Branch() {
        return studentGraduationSpecialization_Branch;
    }

    public void setStudentGraduationSpecialization_Branch(String studentGraduationSpecialization_Branch) {
        this.studentGraduationSpecialization_Branch = studentGraduationSpecialization_Branch;
    }

    public String getStudentGraduationYearOfPassing() {
        return studentGraduationYearOfPassing;
    }

    public void setStudentGraduationYearOfPassing(String studentGraduationYearOfPassing) {
        this.studentGraduationYearOfPassing = studentGraduationYearOfPassing;
    }

    public String getStudentCategory() {
        return studentCategory;
    }

    public void setStudentCategory(String studentCategory) {
        this.studentCategory = studentCategory;
    }

    public String getStudent_1_1_SGPA() {
        return student_1_1_SGPA;
    }

    public void setStudent_1_1_SGPA(String student_1_1_SGPA) {
        this.student_1_1_SGPA = student_1_1_SGPA;
    }

    public String getStudent_1_1_FailedSubjects() {
        return student_1_1_FailedSubjects;
    }

    public void setStudent_1_1_FailedSubjects(String student_1_1_FailedSubjects) {
        this.student_1_1_FailedSubjects = student_1_1_FailedSubjects;
    }

    public String getStudent_1_2_SGPA() {
        return student_1_2_SGPA;
    }

    public void setStudent_1_2_SGPA(String student_1_2_SGPA) {
        this.student_1_2_SGPA = student_1_2_SGPA;
    }

    public String getStudent_1_2_FailedSubjects() {
        return student_1_2_FailedSubjects;
    }

    public void setStudent_1_2_FailedSubjects(String student_1_2_FailedSubjects) {
        this.student_1_2_FailedSubjects = student_1_2_FailedSubjects;
    }

    public String getStudent_2_1_SGPA() {
        return student_2_1_SGPA;
    }

    public void setStudent_2_1_SGPA(String student_2_1_SGPA) {
        this.student_2_1_SGPA = student_2_1_SGPA;
    }

    public String getStudent_2_1_FailedSubjects() {
        return student_2_1_FailedSubjects;
    }

    public void setStudent_2_1_FailedSubjects(String student_2_1_FailedSubjects) {
        this.student_2_1_FailedSubjects = student_2_1_FailedSubjects;
    }

    public String getStudent_2_2_SGPA() {
        return student_2_2_SGPA;
    }

    public void setStudent_2_2_SGPA(String student_2_2_SGPA) {
        this.student_2_2_SGPA = student_2_2_SGPA;
    }

    public String getStudent_2_2_FailedSubjects() {
        return student_2_2_FailedSubjects;
    }

    public void setStudent_2_2_FailedSubjects(String student_2_2_FailedSubjects) {
        this.student_2_2_FailedSubjects = student_2_2_FailedSubjects;
    }

    public String getStudentPEGA() {
        return studentPEGA;
    }

    public void setStudentPEGA(String studentPEGA) {
        this.studentPEGA = studentPEGA;
    }

    public String getStudentService_Product() {
        return studentService_Product;
    }

    public void setStudentService_Product(String studentService_Product) {
        this.studentService_Product = studentService_Product;
    }
}
