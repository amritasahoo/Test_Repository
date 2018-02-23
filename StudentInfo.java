package information;

import java.util.Map;

/**
 * StudentInfo class is used to provide details of the students like age, name, section
 * @author Amrita.Sahoo
 *
 */
	
public class StudentInfo  {
	
	private int studentAge;
	private String studentName;
	private String studentSection;
	public  String teacherName;
	public int marksOfSubject1;
	public int marksOfSubject2;
	public int marksOfSubject3;
	public int averageMarks;
	public int rank;
	
	public StudentInfo() { }	
	
	public String getStudentName() 
		{
        return studentName;
		}
	public void setStudentName(String studentName) 
		{
        this.studentName = studentName;
		}
  
	public int getStudentAge() 
		{
			return studentAge;
		}
	public void setStudentAge(int studentAge) 
		{
			this.studentAge = studentAge;
		}
	
	public String getStudentSection() 
	{
		return studentSection;
	}
	public void setStudentSection(String studentSection) 
	{
		this.studentSection = studentSection;
	}
		
	public static void assigningScoreCard(Map<StudentInfo, StudentInfo> studentInfo , Map<ScoreCard, ScoreCard> scoreCardInfo)
	{
		for (Map.Entry<StudentInfo, StudentInfo> studentDetails : studentInfo.entrySet())
		{	
			StudentInfo studentInfoDetailskey = studentDetails.getKey();
			
			for(Map.Entry<ScoreCard, ScoreCard> scoreCardDetails : scoreCardInfo.entrySet())
			{
				ScoreCard scoreCardInfoDetailsKey =  scoreCardDetails.getKey();
					 
				if(studentInfoDetailskey.getStudentName().replaceAll(" ","").equals(scoreCardInfoDetailsKey.getStudentName().replaceAll(" ", "")))
				{
					studentInfoDetailskey.marksOfSubject1 = scoreCardInfoDetailsKey.getMarksOfSubject1();
					studentInfoDetailskey.marksOfSubject2 = scoreCardInfoDetailsKey.getMarksOfSubject2();
					studentInfoDetailskey.marksOfSubject3 = scoreCardInfoDetailsKey.getMarksOfSubject3(); 
					studentInfoDetailskey.averageMarks = scoreCardInfoDetailsKey.getAverageMarks(); 
					
					break;
				}
        
			}
	
		}
	}
	
	public static void assigningTeacherName(Map<StudentInfo, StudentInfo> studentInfo , Map<TeacherInfo, TeacherInfo> teacherInfo)
	{
		for (Map.Entry<StudentInfo, StudentInfo> studentDetails : studentInfo.entrySet())
		{	
			StudentInfo studentInfoDetailskey = studentDetails.getKey();
			
			for(Map.Entry<TeacherInfo, TeacherInfo> teacherDetails : teacherInfo.entrySet())
			{
				
				TeacherInfo teacherInfoDetailsKey =  teacherDetails.getKey();
	 
				if(studentInfoDetailskey.getStudentSection().equals(teacherInfoDetailsKey.getTeacherSection()))
				{
					studentInfoDetailskey.teacherName = teacherInfoDetailsKey.getTeacherName();
					break;
				}
        
			}
	
		}
	}
	
}
