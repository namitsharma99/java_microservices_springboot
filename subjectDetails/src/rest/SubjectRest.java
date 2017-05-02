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
@Path("/subject")
public class SubjectRest {
	private static List<Subject> subjects = new ArrayList<Subject>();
	static {
		Subject subject1 = new Subject();
		subject1.setSubjectId(100);
		subject1.setSubjectName("Maths");
		subjects.add(subject1);
		Subject subject2 = new Subject();
		subject2.setSubjectId(200);
		subject2.setSubjectName("IT");
		subjects.add(subject2);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getSubjects() {
		return subjects;
	}

	@GET
	@Path("getSubject")
	@Produces(MediaType.APPLICATION_JSON)
	public Subject getSubject(@QueryParam("id") int id) {
		Subject subject = null;
		for (Subject t : subjects) {
			if (t.getSubjectId() == id)
				subject = t;
		}
		return subject;
	}
}
