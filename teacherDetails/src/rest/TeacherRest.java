package rest;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Named
@Path("/teacher")
public class TeacherRest {
	private static List<Teacher> teachers = new ArrayList<Teacher>();
	static {
		Teacher teacher1 = new Teacher();
		teacher1.setSubjectId(100);
		teacher1.setTeacherId(1001);
		teacher1.setTeacherName("ABC");
		teachers.add(teacher1);
		Teacher teacher2 = new Teacher();
		teacher2.setSubjectId(200);
		teacher2.setTeacherId(1002);
		teacher2.setTeacherName("XYZ");
		teachers.add(teacher2);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> getTeachers() {
		return teachers;
	}

	@GET
	@Path("getTeacher")
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher getTeacher(@QueryParam("id") int id) {
		Teacher teacher = null;
		for (Teacher t : teachers) {
			if (t.getSubjectId() == id)
				teacher = t;
		}
		return teacher;
	}
}
