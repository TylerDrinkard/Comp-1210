  
/**
 * Driver program that takes the user's name, activity average, 
 * quiz average, project average, and exam averages as input 
 * and calculates their final grade in COMP 1210.
 *
 *@author Tyler Drinkard
 *@version 2/12/17
 */
public class Grade {

   private double exam1, exam2, finalExam;
   private double activityAvg, quizAvg, projectAvg;
   private String studentName;
   
   /**
    *
    *
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15, 
        ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10,
        FINAL_WEIGHT = 0.30, PROJ_WEIGHT = 0.25;
        
   /**
   *
   *@param studentNameIn (not used).
   */   
   public Grade(String studentNameIn) {
      
      studentName = studentNameIn;
   }
   
   /**
    *
    *@param activityAvgIn (not used).
    *@param quizAvgIn (not used).
    */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      		
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   
   /**
    *
    *@param projectAvgIn (not used).
    */
   public void setProjectAvg(double projectAvgIn) {
         
      projectAvg = projectAvgIn;
   }
   
   /**
    *
    *@param examType (not used).
    *@param examScoreIn (not used).
    */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
   
   /**
    *
    *@return grade
    */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT 
            + finalExam * FINAL_WEIGHT + activityAvg * ACT_WEIGHT
            + quizAvg * QUIZ_WEIGHT + projectAvg * PROJ_WEIGHT;
            
      return grade;
   }
   
   /**
    *
    *@return grade
    */
   public String toString() {
      return "Name: " + studentName + "\r\n"
            + "Course Grade: " + calculateGrade();
   }
      
}