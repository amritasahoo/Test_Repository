package information;

import java.util.Map;

/**
 * TeacherInfo is a class utilized to provide teacher's name and teaching section
 * @author Amrita.Sahoo
 *
 */
public class TeacherInfo {
		
	 	private String teacherName;
		private String teacherSection;
		/**
		 * TeacherInfo constructor is used to initialize the instance variables
		 * @param teacherName is the 1st parameter of TeacherInfo constructor
		 * @param teachingSection is the 2nd parameter of TeacherInfo constructor
		 */
		public TeacherInfo()
		{
		
						
		}
		   public String getTeacherName() {
	            return teacherName;
	      }
	      public void setTeacherName(String teacherName) {
	            this.teacherName = teacherName;
	      }
	      public String getTeacherSection() 
			{
				return teacherSection;
			}
		public void setTeacherSection(String teacherSection) 
			{
				this.teacherSection = teacherSection;
			}
		
		
		
	}


