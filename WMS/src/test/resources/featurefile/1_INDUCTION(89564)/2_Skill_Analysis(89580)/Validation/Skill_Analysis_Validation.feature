@Induction_SkillAnalysis_Validation
Feature: Feature : Induction (89564) UserStory: Skill Analysis (89580)
  *********************************************
  UserStory: Skill Analysis (89580)
  *********************************************
  Description : As a EIP User i should be able to Validate Skill analysis fields
  ******************************************************************************************

  @Induction_SkillAnalysis_Create_Validation_With_noInput
  Scenario: Verify User can be Validate Skill Analysis fields for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select Single workmen and Proceed to Skill Test
    Then Verify User can be able to Validate Total Questions with no input
    Then Verify User can be able to Validate Test Status with no input
    Then Verify User can be able to Validate Skill type with no input
    Then Verify User can be able to Validate Retest Date with no input
    Then Verify User can be able to Validate Retest Date with Past Date
    Then Verify User can be able to Validate Retest Date with Current Date
    Then Verify User can be able to Validate Correct error message if Total Answers is more then Total Questions

  @Induction_SkillAnalysis_Create_Validation_With_multipleInput
  Scenario: Verify User can be Validate Skill Analysis fields for Manual Test with Numeric , Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select Single workmen and Proceed to Skill Test
    Then Verify User can be able to Validate Total Questions with max numeric input
    Then Verify User can be able to Validate Total Questions with alphabets input
    Then Verify User can be able to Validate Total Questions with Special characters input
    Then Verify User can be able to Validate Total Answers with max numeric input
    Then Verify User can be able to Validate Total Answers with alphabets input
    Then Verify User can be able to Validate Total Answers with Special characters input
