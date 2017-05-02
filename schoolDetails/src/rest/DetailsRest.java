package rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.client.RestTemplate;

@Named
@Path("/details")
public class DetailsRest {

	@Inject
	private RestTemplate restTemplate;

	@GET
	@Path("detailsApi")
	@Produces(MediaType.APPLICATION_JSON)
	public Details submitRequest(@QueryParam("id") int subjectId) {
		Details details = new Details();
		Teacher teacher = restTemplate.getForObject(
				"http://localhost:8097/teacher/getTeacher?id={subjectId}",
				Teacher.class, subjectId);
		Subject subject = restTemplate.getForObject(
				"http://localhost:8098/subject/getSubject?id={subjectId}",
				Subject.class, subjectId);
		details.setSubjectId(subjectId);
		details.setTeacher(teacher);
		details.setSubject(subject);

		return details;
	}
}
