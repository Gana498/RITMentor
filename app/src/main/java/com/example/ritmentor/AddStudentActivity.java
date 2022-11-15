package com.example.ritmentor;

import static com.example.ritmentor.R.id.idBtnAddCourse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddStudentActivity extends AppCompatActivity {

    // creating variables for our button, edit text,
    // firebase database, database reference, progress bar.
    private Button addCourseBtn;
    private TextInputEditText studentIDEdt,studentFullNameEdt, studentBranchEdt, studentSectionEdt, studentYearOfAdmissionEdt, studentPhoneEdt, parentPhoneEdt, studentPersonalEmailEdt,
            studentAadhaarEdt, fatherAadhaarEdt, motherAadhaarEdt, studentPresentAddressEdt, studentPermanentAddressEdt, studentFirstNameEdt, studentMiddleNameEdt, studentLastNameEdt,
            studentGenderEdt, studentCollegeEmailEdt, studentDateOfBirthEdt, studentVillage_AreaEdt, studentDistrict_CityEdt, studentStateEdt, studentPincodeEdt, studentCountryEdt, parentFullNameEdt,
            guardianFullNameEdt, guardianPhoneEdt, studentClass10CGPA_PercentageEdt, studentSSCBoardEdt, studentSSCSchoolNameEdt, studentSSCStateEdt, studentSSCYearOfPassingEdt,
            studentClass12CGPA_PercentageEdt, studentClass12BoardEdt, studentClass12CollegeNameEdt, studentClass12StateEdt, studentClass12YearOfPassingEdt, studentEAMCETRankEdt,
            studentDiplomaCGPA_PercentageEdt, studentDiplomaBoardEdt, studentDiplomaInstituteNameEdt, studentDiplomaInstituteAddressEdt, studentDiplomaSpecilization_BranchEdt,
            studentDiplomaStateEdt, studentDiplomaYearOfPassingEdt, studentECETRankEdt, studentGraduationCGPAEdt, studentHistoryOfBacklogs_Yes_NoEdt, studentNoOfBacklogsEdt,
            studentGraduationUniversityNameEdt, studentGraduationInstituteNameEdt, studentGraduationSpecilization_BranchEdt, studentGraduationYearOfPassingEdt,
            studentCategoryEdt, student_1_1_SGPAEdt, student_1_1_FailedSubjectsEdt, student_1_2_SGPAEdt, student_1_2_FailedSubjectsEdt, student_2_1_SGPAEdt, student_2_1_FailedSubjectsEdt,
            student_2_2_SGPAEdt, student_2_2_FailedSubjectsEdt, studentPEGAEdt, studentService_ProductEdt;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private ProgressBar loadingPB;
    private String courseID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        // initializing all our variables.
        addCourseBtn = findViewById(R.id.idBtnAddCourse);
        studentIDEdt = findViewById(R.id.idEdtStudentID);
        studentFullNameEdt = findViewById(R.id.idEdtstudentFullName);
        studentBranchEdt = findViewById(R.id.idEdtstudentBranch);
        studentSectionEdt = findViewById(R.id.idEdtstudentSection);
        studentYearOfAdmissionEdt = findViewById(R.id.idEdtStudentYearOfAdmission);
        studentPhoneEdt = findViewById(R.id.idEdtstudentPhone);
        parentPhoneEdt = findViewById(R.id.idEdtparentPhone);
        studentPersonalEmailEdt = findViewById(R.id.idEdtstudentPersonalEmail);
        studentAadhaarEdt = findViewById(R.id.idEdtstudentAadhaar);
        fatherAadhaarEdt = findViewById(R.id.idEdtfatherAadhaar);
        motherAadhaarEdt = findViewById(R.id.idEdtmotherAadhaar);
        studentPresentAddressEdt = findViewById(R.id.idEdtstudentPresentAddress);
        studentPermanentAddressEdt = findViewById(R.id.idEdtstudentPermanentAddress);
        studentFirstNameEdt = findViewById(R.id.idEdtstudentFirstName);
        studentMiddleNameEdt = findViewById(R.id.idEdtstudentMiddleName);
        studentLastNameEdt = findViewById(R.id.idEdtstudentLastName);
        studentGenderEdt = findViewById(R.id.idEdtstudentGender);
        studentCollegeEmailEdt = findViewById(R.id.idEdtstudentCollegeEmail);
        studentDateOfBirthEdt = findViewById(R.id.idEdtstudentDateOfBirth);
        studentVillage_AreaEdt = findViewById(R.id.idEdtstudentVillage_Area);
        studentDistrict_CityEdt = findViewById(R.id.idEdtstudentDistrict_City);
        studentStateEdt = findViewById(R.id.idEdtstudentState);
        studentPincodeEdt = findViewById(R.id.idEdtstudentPincode);
        studentCountryEdt = findViewById(R.id.idEdtstudentCountry);
        parentFullNameEdt = findViewById(R.id.idEdtparentFullName);
        guardianFullNameEdt = findViewById(R.id.idEdtguardianFullName);
        guardianPhoneEdt = findViewById(R.id.idEdtguardianPhone);
        studentClass10CGPA_PercentageEdt = findViewById(R.id.idEdtstudentClass10CGPA_Percentage);
        studentSSCBoardEdt = findViewById(R.id.idEdtstudentSSCBoard);
        studentSSCSchoolNameEdt = findViewById(R.id.idEdtstudentSSCSchoolName);
        studentSSCStateEdt = findViewById(R.id.idEdtstudentSSCState);
        studentSSCYearOfPassingEdt = findViewById(R.id.idEdtstudentSSCYearOfPassing);
        studentClass12CGPA_PercentageEdt = findViewById(R.id.idEdtstudentClass12CGPA_Percentage);
        studentClass12BoardEdt = findViewById(R.id.idEdtstudentClass12Board);
        studentClass12CollegeNameEdt = findViewById(R.id.idEdtstudentClass12CollegeName);
        studentClass12StateEdt = findViewById(R.id.idEdtstudentClass12State);
        studentClass12YearOfPassingEdt = findViewById(R.id.idEdtstudentClass12YearOfPassing);
        studentEAMCETRankEdt = findViewById(R.id.idEdtstudentEAMCETRank);
        studentDiplomaCGPA_PercentageEdt = findViewById(R.id.idEdtstudentDiplomaCGPA_Percentage);
        studentDiplomaBoardEdt = findViewById(R.id.idEdtstudentDiplomaBoard);
        studentDiplomaInstituteNameEdt = findViewById(R.id.idEdtstudentDiplomaInstituteName);
        studentDiplomaInstituteAddressEdt = findViewById(R.id.idEdtstudentDiplomaInstituteAddress);
        studentDiplomaSpecilization_BranchEdt = findViewById(R.id.idEdtstudentDiplomaSpecialization_Branch);
        studentDiplomaStateEdt = findViewById(R.id.idEdtstudentDiplomaState);
        studentDiplomaYearOfPassingEdt = findViewById(R.id.idEdtstudentDiplomaYearOfPassing);
        studentECETRankEdt = findViewById(R.id.idEdtstudentECETRank);
        studentGraduationCGPAEdt = findViewById(R.id.idEdtstudentGraduationCGPA);
        studentHistoryOfBacklogs_Yes_NoEdt = findViewById(R.id.idEdtstudentHistoryOfBacklogs_Yes_No);
        studentNoOfBacklogsEdt = findViewById(R.id.idEdtstudentNoOfBacklogs);
        studentGraduationUniversityNameEdt = findViewById(R.id.idEdtstudentGraduationUniversityName);
        studentGraduationInstituteNameEdt = findViewById(R.id.idEdtstudentGraduationInstituteName);
        studentGraduationSpecilization_BranchEdt = findViewById(R.id.idEdtstudentGraduationSpecilization_Branch);
        studentGraduationYearOfPassingEdt = findViewById(R.id.idEdtstudentGraduationYearOfPassing);
        studentCategoryEdt = findViewById(R.id.idEdtstudentCategory);
        student_1_1_SGPAEdt = findViewById(R.id.idEdtstudent_1_1_SGPA);
        student_1_1_FailedSubjectsEdt = findViewById(R.id.idEdtstudent_1_1_FailedSubjects);
        student_1_2_SGPAEdt = findViewById(R.id.idEdtstudent_1_2_SGPA);
        student_1_2_FailedSubjectsEdt = findViewById(R.id.idEdtstudent_1_2_FailedSubjects);
        student_2_1_SGPAEdt = findViewById(R.id.idEdtstudent_2_1_SGPA);
        student_2_1_FailedSubjectsEdt = findViewById(R.id.idEdtstudent_2_1_FailedSubjects);
        student_2_2_SGPAEdt = findViewById(R.id.idEdtstudent_2_2_SGPA);
        student_2_2_FailedSubjectsEdt = findViewById(R.id.idEdtstudent_2_2_FailedSubjects);
        studentPEGAEdt = findViewById(R.id.idEdtstudentPEGA);
        studentService_ProductEdt = findViewById(R.id.idEdtstudentService_Product) ;
        loadingPB = findViewById(R.id.idPBLoading);
        firebaseDatabase = FirebaseDatabase.getInstance();
        // on below line creating our database reference.
        databaseReference = firebaseDatabase.getReference("Students");
        // adding click listener for our add course button.
        addCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingPB.setVisibility(View.VISIBLE);
                String studentID,studentFullName, studentBranch, studentSection, studentYearOfAdmission, studentPhone, parentPhone, studentPersonalEmail,
                        studentAadhaar, fatherAadhaar, motherAadhaar, studentPresentAddress, studentPermanentAddress, studentFirstName, studentMiddleName, studentLastName,
                        studentGender, studentCollegeEmail, studentDateOfBirth, studentVillage_Area, studentDistrict_City, studentState, studentPincode, studentCountry, parentFullName,
                        guardianFullName, guardianPhone, studentClass10CGPA_Percentage, studentSSCBoard, studentSSCSchoolName, studentSSCState, studentSSCYearOfPassing,
                        studentClass12CGPA_Percentage, studentClass12Board, studentClass12CollegeName, studentClass12State, studentClass12YearOfPassing, studentEAMCETRank,
                        studentDiplomaCGPA_Percentage, studentDiplomaBoard, studentDiplomaInstituteName, studentDiplomaInstituteAddress, studentDiplomaSpecilization_Branch,
                        studentDiplomaState, studentDiplomaYearOfPassing, studentECETRank, studentGraduationCGPA, studentHistoryOfBacklogs_Yes_No, studentNoOfBacklogs,
                        studentGraduationUniversityName, studentGraduationInstituteName, studentGraduationSpecilization_Branch, studentGraduationYearOfPassing,
                        studentCategory, student_1_1_SGPA, student_1_1_FailedSubjects, student_1_2_SGPA, student_1_2_FailedSubjects, student_2_1_SGPA, student_2_1_FailedSubjects,
                        student_2_2_SGPA, student_2_2_FailedSubjects, studentPEGA, studentService_Product;
                // getting data from our edit text.
                studentID = studentIDEdt.getText().toString().toUpperCase();
                studentFullName = studentFullNameEdt.getText().toString().toUpperCase();
                studentBranch = studentBranchEdt.getText().toString().toUpperCase();
                studentSection = studentSectionEdt.getText().toString().toUpperCase();
                studentYearOfAdmission = studentYearOfAdmissionEdt.getText().toString();
                studentPhone = studentPhoneEdt.getText().toString();
                parentPhone = parentPhoneEdt.getText().toString();
                studentPersonalEmail = studentPersonalEmailEdt.getText().toString().toLowerCase();
                studentAadhaar = studentAadhaarEdt.getText().toString();
                fatherAadhaar = fatherAadhaarEdt.getText().toString();
                motherAadhaar = motherAadhaarEdt.getText().toString();
                studentPresentAddress = studentPresentAddressEdt.getText().toString();
                studentPermanentAddress = studentPermanentAddressEdt.getText().toString();
                studentFirstName = studentFirstNameEdt.getText().toString().toUpperCase();
                studentMiddleName = studentMiddleNameEdt.getText().toString().toUpperCase();
                studentLastName = studentLastNameEdt.getText().toString().toUpperCase();
                studentGender = studentGenderEdt.getText().toString().toUpperCase();
                studentCollegeEmail = studentCollegeEmailEdt.getText().toString().toLowerCase();
                studentDateOfBirth = studentDateOfBirthEdt.getText().toString();
                studentVillage_Area = studentVillage_AreaEdt.getText().toString();
                studentDistrict_City = studentDistrict_CityEdt.getText().toString().toUpperCase();
                studentState = studentStateEdt.getText().toString().toUpperCase();
                studentPincode = studentPincodeEdt.getText().toString();
                studentCountry = studentCountryEdt.getText().toString().toUpperCase();
                parentFullName = parentFullNameEdt.getText().toString().toUpperCase();
                guardianFullName = guardianFullNameEdt.getText().toString().toUpperCase();
                guardianPhone = guardianPhoneEdt.getText().toString();
                studentClass10CGPA_Percentage = studentClass10CGPA_PercentageEdt.getText().toString();
                studentSSCBoard = studentSSCBoardEdt.getText().toString();
                studentSSCSchoolName = studentSSCSchoolNameEdt.getText().toString().toUpperCase();
                studentSSCState = studentSSCStateEdt.getText().toString().toUpperCase();
                studentSSCYearOfPassing = studentSSCYearOfPassingEdt.getText().toString();
                studentClass12CGPA_Percentage = studentClass12CGPA_PercentageEdt.getText().toString();
                studentClass12Board = studentClass12BoardEdt.getText().toString();
                studentClass12CollegeName = studentClass12CollegeNameEdt.getText().toString().toUpperCase();
                studentClass12State = studentClass12StateEdt.getText().toString();
                studentClass12YearOfPassing = studentClass12YearOfPassingEdt.getText().toString();
                studentEAMCETRank = studentEAMCETRankEdt.getText().toString();
                studentDiplomaCGPA_Percentage = studentDiplomaCGPA_PercentageEdt.getText().toString();
                studentDiplomaBoard = studentDiplomaBoardEdt.getText().toString().toUpperCase();
                studentDiplomaInstituteName = studentDiplomaInstituteNameEdt.getText().toString();
                studentDiplomaInstituteAddress = studentDiplomaInstituteAddressEdt.getText().toString();
                studentDiplomaSpecilization_Branch = studentDiplomaSpecilization_BranchEdt.getText().toString().toUpperCase();
                studentDiplomaState = studentDiplomaStateEdt.getText().toString();
                studentDiplomaYearOfPassing = studentDiplomaYearOfPassingEdt.getText().toString();
                studentECETRank = studentECETRankEdt.getText().toString();
                studentGraduationCGPA = studentGraduationCGPAEdt.getText().toString();
                studentHistoryOfBacklogs_Yes_No = studentHistoryOfBacklogs_Yes_NoEdt.getText().toString().toUpperCase();
                studentNoOfBacklogs = studentNoOfBacklogsEdt.getText().toString().toUpperCase();
                studentGraduationUniversityName = studentGraduationUniversityNameEdt.getText().toString();
                studentGraduationInstituteName = studentGraduationInstituteNameEdt.getText().toString();
                studentGraduationSpecilization_Branch = studentGraduationSpecilization_BranchEdt.getText().toString();
                studentGraduationYearOfPassing = studentGraduationYearOfPassingEdt.getText().toString();
                studentCategory = studentCategoryEdt.getText().toString();
                student_1_1_SGPA = student_1_1_SGPAEdt.getText().toString();
                student_1_1_FailedSubjects = student_1_1_FailedSubjectsEdt.getText().toString();
                student_1_2_SGPA = student_1_2_SGPAEdt.getText().toString();
                student_1_2_FailedSubjects = student_1_2_FailedSubjectsEdt.getText().toString();
                student_2_1_SGPA = student_2_1_SGPAEdt.getText().toString();
                student_2_1_FailedSubjects = student_2_1_FailedSubjectsEdt.getText().toString();
                student_2_2_SGPA = student_2_2_SGPAEdt.getText().toString();
                student_2_2_FailedSubjects = student_2_2_FailedSubjectsEdt.getText().toString();
                studentPEGA = studentPEGAEdt.getText().toString();
                studentService_Product = studentService_ProductEdt.getText().toString();


                // on below line we are passing all data to our modal class.
                StudentRVModal studentRVModal = new StudentRVModal(studentID,studentFullName, studentBranch, studentSection, studentYearOfAdmission, studentPhone, parentPhone, studentPersonalEmail,
                        studentAadhaar, fatherAadhaar, motherAadhaar, studentPresentAddress, studentPermanentAddress, studentFirstName, studentMiddleName, studentLastName,
                        studentGender, studentCollegeEmail, studentDateOfBirth, studentVillage_Area, studentDistrict_City, studentState, studentPincode, studentCountry, parentFullName,
                        guardianFullName, guardianPhone, studentClass10CGPA_Percentage, studentSSCBoard, studentSSCSchoolName, studentSSCState, studentSSCYearOfPassing,
                        studentClass12CGPA_Percentage, studentClass12Board, studentClass12CollegeName, studentClass12State, studentClass12YearOfPassing, studentEAMCETRank,
                        studentDiplomaCGPA_Percentage, studentDiplomaBoard, studentDiplomaInstituteName, studentDiplomaInstituteAddress, studentDiplomaSpecilization_Branch,
                        studentDiplomaState, studentDiplomaYearOfPassing, studentECETRank, studentGraduationCGPA, studentHistoryOfBacklogs_Yes_No, studentNoOfBacklogs,
                        studentGraduationUniversityName, studentGraduationInstituteName, studentGraduationSpecilization_Branch, studentGraduationYearOfPassing,
                        studentCategory, student_1_1_SGPA, student_1_1_FailedSubjects, student_1_2_SGPA, student_1_2_FailedSubjects, student_2_1_SGPA, student_2_1_FailedSubjects,
                        student_2_2_SGPA, student_2_2_FailedSubjects, studentPEGA, studentService_Product);
                // on below line we are calling a add value event
                // to pass data to firebase database.
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        // on below line we are setting data in our firebase database.
                        Toast.makeText(AddStudentActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                        databaseReference.child(studentID).setValue(studentRVModal);
                        // displaying a toast message.
                        Toast.makeText(AddStudentActivity.this, "Course Added..", Toast.LENGTH_SHORT).show();
                        // starting a main activity.
                        //startActivity(new Intent(AddStudentActivity.this, MainActivity.class));
                        loadingPB.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        // displaying a failure message on below line.
                        Toast.makeText(AddStudentActivity.this, "Fail to add Course..", Toast.LENGTH_SHORT).show();
                        loadingPB.setVisibility(View.VISIBLE);
                    }
                });
            }
        });
    }
}
